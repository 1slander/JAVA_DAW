package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMy8 {
	
	private static Connection conn;
	
	private String url="jdbc:mysql://localhost:3306/proyectos_FP_2025";
	private String user="root";
	private String root="";
	
	private ConexionMy8(){
		
	
			try {
				conn=DriverManager.getConnection(url, user, root);
				System.out.println("Conexion estbalecida!!");
			} catch (SQLException e) {
				
				e.printStackTrace();
				System.out.println("ERROR: Conexion no establecida");
			}
			
			
		
	}
	
	public static Connection getConexion() {
		if(conn==null)
			new ConexionMy8();
			return conn;
			
	}

}
