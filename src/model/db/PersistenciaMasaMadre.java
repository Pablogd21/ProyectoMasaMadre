package model.db;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.data.Cliente;
import model.data.Pedido;

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
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
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

		// formato de fecha: AAAA-MM-DD
		Date fecha = Date.valueOf(cliente.getFechaNaCliente());

		try {
			con = acceso.getConexion();

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 0);
			pstmt.setString(2, cliente.getNombreCliente());
			pstmt.setString(3, cliente.getApellidoCliente());
			pstmt.setString(4, cliente.getEmailCliente());
			pstmt.setString(5, cliente.getTelefonoCliente());
			pstmt.setDate(6, fecha);
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
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
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
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return res;
	}

	public ArrayList<Cliente> selectClientes() {
		ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

		String query = "SELECT idCliente, Nombre, Apellido, Email, Telefono, FechaNac, Direccion" + "	 FROM Clientes";

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
				fecha = rslt.getDate(6).toString();
				cliente = new Cliente(rslt.getInt(1), rslt.getString(2), rslt.getString(3), rslt.getString(4),
						rslt.getString(5), fecha, rslt.getString(7));
				listaClientes.add(cliente);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null)
					rslt.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
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
				// TODO: revisar el manejo de datos de tipo fecha
				cliente = new Cliente(id, nom, ape, email, telef, fech.toString(), dir);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null)
					rslt.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return cliente;
	}

	public int updateCliente(Cliente cli) {
		String query = "UPDATE Clientes SET Nombre = ?, Apellido = ?, Email = ?, Telefono = ?, FechaNac = ?, Direccion = ?"
				+ "WHERE idCliente = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;

		Date fecha = Date.valueOf(cli.getFechaNaCliente());

		try {
			con = acceso.getConexion();

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, cli.getNombreCliente());
			pstmt.setString(2, cli.getApellidoCliente());
			pstmt.setString(3, cli.getEmailCliente());
			pstmt.setString(4, cli.getTelefonoCliente());
			pstmt.setDate(5, fecha);
			pstmt.setString(6, cli.getDireccionCliente());
			pstmt.setInt(7, cli.getIdCliente());

			res = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			res = -200;
			e.printStackTrace();
		} catch (SQLException e) {
			res = -100;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
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
				if (rslt != null)
					rslt.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return contra;
	}

	public int insertPedido(Pedido ped) {
		String query = "INSERT INTO Pedidos VALUES (?, ?, ?, ?, ?)";

		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;

		// formato de fecha: AAAA-MM-DD
		Date fecha = Date.valueOf(ped.getFechaPedido());

		try {
			con = acceso.getConexion();

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 0);
			pstmt.setString(2, ped.getDescripcionPedido());
			pstmt.setDate(3, fecha);
			pstmt.setInt(4, ped.getIdCliente());
			pstmt.setDouble(5, ped.getPrecioPedido());

			res = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			res = -200;
			e.printStackTrace();
		} catch (SQLException e) {
			res = -100;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return res;
	}

	public ArrayList<Pedido> selectPedidos() {
		ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();
		
		String query = "SELECT idPedido, Descripcion, FechaPedido, idCliente, Importe" + "	 FROM Pedidos";

		Connection con = null;
		Statement stmt = null;
		ResultSet rslt = null;
		
		try {
			con = acceso.getConexion();
			stmt = con.createStatement();
			rslt = stmt.executeQuery(query);

			Pedido pedido = null;
			String fecha = null;
			while (rslt.next()) {
				fecha = rslt.getDate(3).toString();
				pedido = new Pedido(rslt.getInt(1), rslt.getString(2), fecha, rslt.getInt(4) , rslt.getDouble(5));
				listaPedidos.add(pedido);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null)
					rslt.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return listaPedidos;
	}

	public Pedido selectPedidoId(int idPedido) {
		Pedido pedido = null;
		String query = "SELECT idPedido, Descripcion, FechaPedido, idCliente, Importe FROM Pedidos WHERE idPedido = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rslt = null;

		try {
			con = acceso.getConexion();
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idPedido);

			rslt = pstmt.executeQuery();

			int id = 0;
			String desc = "";
			int idC = 0;
			Double imp;
			Date fech = null;
			String dir = "";
			if (rslt.next()) {
				id = rslt.getInt(1);
				desc = rslt.getString(2);
				fech = rslt.getDate(3);
				idC = rslt.getInt(4);
				imp = rslt.getDouble(5);
				pedido = new Pedido(id, desc, fech.toString(), idC, imp.toString());
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rslt != null)
					rslt.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return pedido;
	}

	public int updatePedido(Pedido pedidoMod) {
		String query = "UPDATE Pedidos SET Descripcion = ?, FechaPedido = ?, idCliente = ?, Importe = ?"
				+ "WHERE idPedido = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;

		Date fecha = Date.valueOf(pedidoMod.getFechaPedido());

		try {
			con = acceso.getConexion();

			pstmt = con.prepareStatement(query);
			pstmt.setString(1, pedidoMod.getDescripcionPedido());
			pstmt.setDate(2, fecha);
			pstmt.setInt(3, pedidoMod.getIdCliente());
			pstmt.setDouble(4, pedidoMod.getPrecioPedido());
			pstmt.setInt(5, pedidoMod.getIdPedido());
			

			res = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			res = -200;
			e.printStackTrace();
		} catch (SQLException e) {
			res = -100;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return res;
	}

	public int deletePedido(int idPedido) {
		String query = "DELETE FROM Pedidos WHERE idPedido = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		int res = 0;

		try {
			con = acceso.getConexion();

			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idPedido);

			res = pstmt.executeUpdate();

		} catch (ClassNotFoundException e) {
			res = -200;
			e.printStackTrace();
		} catch (SQLException e) {
			res = -100;
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return res;
	}
	
}
