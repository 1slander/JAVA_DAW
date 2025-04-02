package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMy8 {
	
	private static Connection conn;
			
	private String url="jdbc:mysql://localhost:3306/mysql_hr";
	private String user="root";
	private String password="";
	
	private ConexionMy8() {
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("CONEXION ESTABLECIDA");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			System.out.println("CONEXION NO ESTABLECIDA");
		}
	}

	public static Connection getConexion() {
		
		if(conn==null)
			new ConexionMy8();
			return conn;
	}
}
