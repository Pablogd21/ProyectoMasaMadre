package model.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.data.Cliente;

public class PersistenciaMasaMadre {
private AccesoDB acceso;
	
	public PersistenciaMasaMadre() {
		acceso = new AccesoDB();
	}
	
	public int insertUser() {
		String query = "INSERT INTO Usuarios VALUES (?, ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, "admin");
			pstmt.setString(2, "1a2b3c");
			
			res = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			res = -200;
			e.printStackTrace();
		} catch (SQLException e) {
			res = -100;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
	}
	
	public int insertCliente(String nombre, String apellido, String email, String telef, String fechaNac, String direccion) {
		String query = "INSERT INTO Clientes VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		
		Date fecha = Date.valueOf(fechaNac);
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 0);
			pstmt.setString(2, nombre);
			pstmt.setString(3, apellido);
			pstmt.setString(4, email);
			pstmt.setString(5, telef);
			pstmt.setDate(6, fecha);
			pstmt.setString(7, direccion);
			
			res = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			res = -200;
			e.printStackTrace();
		} catch (SQLException e) {
			res = -100;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
	}
	
	public int deleteCliente(int idCliente) {
		String query = "DELETE FROM Clientes WHERE idCliente = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idCliente);
					
			res = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			res = -200;
			e.printStackTrace();
		} catch (SQLException e) {
			res = -100;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
	}
	
	public Cliente selectClienteId(int idCliente) {
		Cliente cliente = null;
		String query = "SELECT idCliente, Nombre, Apellido, Email, Telefono, FechaNac, Direccion " 
				+ "FROM Clientes WHERE idCliente = ?";
				
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idCliente);
			
			rslt = pstmt.executeQuery();
			
			int id = 0;
			String nom = "";
			String ape = "";
			String email = "";
			String telef = "";
			Date fech = null;
			String dir = "";
			if (rslt.next()) {
				id = rslt.getInt(1);
				nom = rslt.getString(2);
				ape = rslt.getString(3);
				email = rslt.getString(4);
				telef = rslt.getString(5);
				fech = rslt.getDate(6);
				dir = rslt.getString(7);
				cliente = new Cliente(id, nom, ape, email, telef, fech, dir);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null) rslt.close();
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return cliente;
	}
	
	public int updatePiloto(int id, String nombre, String apellido, String email, String telef, String fechaNac, String direccion) {
		String query = "UPDATE Clientes SET Nombre = ?, Apellido = ?, Email = ?, Telefono = ?, FechaNac = ?, Direccion = ?"
				+ "WHERE idCliente = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		Date fecha = Date.valueOf(fechaNac);
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, nombre);
			pstmt.setString(2, apellido);
			pstmt.setString(3, email);
			pstmt.setString(4, telef);
			pstmt.setDate(5, fecha);
			pstmt.setString(6, direccion);
			pstmt.setInt(7, id);
					
			res = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			res = -200;
			e.printStackTrace();
		} catch (SQLException e) {
			res = -100;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return res;
	}
	
	public String getCredentials(String nomUsu) {
		String query = "SELECT pass FROM Usuarios WHERE nomUsu = ?";
				
				Connection con = null;
				PreparedStatement pstmt = null;
				ResultSet rslt = null;
				String contra = null;
				try {
					con = acceso.getConexion();
					pstmt = con.prepareStatement(query);
					pstmt.setString(1, nomUsu);
					
					rslt = pstmt.executeQuery();
					while (rslt.next()) {
						contra = rslt.getString(1);
					}
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					try {
						if (rslt != null) rslt.close();
						if (pstmt != null) pstmt.close();
						if (con != null) con.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
		
		return contra;
	}
}
