package model.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
	
	public int insertCliente(Cliente cliente) {
		String query = "INSERT INTO Clientes VALUES (?, ?, ?, ?, ?, ?, ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;
		
		
		try {
			con = acceso.getConexion();
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 0);
			pstmt.setString(2, cliente.getNombreCliente());
			pstmt.setString(3, cliente.getApellidoCliente());
			pstmt.setString(4, cliente.getEmailCliente());
			pstmt.setString(5, cliente.getTelefonoCliente());
			pstmt.setString(6, cliente.getFechaNaCliente()); //formato de fecha: AAAA-MM-DD
			pstmt.setString(7, cliente.getDireccionCliente());
			
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
	
	public ArrayList<Cliente> selectClientes() {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
		
		String query = "SELECT idCliente, Nombre, Apellido, Email, Telefono, FechaNac, Direccion"
				+ "	 FROM Clientes";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			stmt = con.createStatement();
			rslt = stmt.executeQuery(query);
			
			Cliente cliente = null;
			String fecha = null;
			while (rslt.next()) {
				fecha = rslt.getString(6);
				cliente = new Cliente(rslt.getInt(1), rslt.getString(2), 
						rslt.getString(3), rslt.getString(4), rslt.getString(5), fecha, rslt.getString(7));
				listaClientes.add(cliente);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null) rslt.close();
				if (stmt != null) stmt.close();
				if (con != null) con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return listaClientes;
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
				//TODO: revisar el manejo de datos de tipo fecha
				cliente = new Cliente(id, nom, ape, email, telef, fech.toString(), dir);
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
	
	public int updateCliente(int id, String nombre, String apellido, String email, String telef, String fechaNac, String direccion) {
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
