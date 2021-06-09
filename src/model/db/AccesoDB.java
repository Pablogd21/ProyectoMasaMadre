package model.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoDB {
	Connection conn = null;
	final String username;
	final String passw;
	
	public AccesoDB() {
		username = "sql11408150";
		passw = "XiMuSWLt8Z";
	}
	
	public Connection getConexion() 
			throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://sql11.freemysqlhosting.net:3306/sql11408150",username,passw);
		
		System.out.println("Conexión establecida");
		
		return conn;
	}
}
