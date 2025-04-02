package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexion {

	public static void main(String[] args) {
		
		/**
		 * Para conectar a una base de datos nos va hacer falta:
		 * 
		 * String url="jdbc:mysql://localhost:3306/mysql_hr?servertTimezone=UTC"; MYSQL 8
		 * 
		 * String url="jdbc:mysql://localhost:3306/mysql_hr"; XAMPP
		 * 
		 * 
		 */
		
		String url="jdbc:mysql://localhost:3306/jardineria";
		String user="root";
		String password="";
		
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("CONEXION ESTABLECIDA");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("CONEXION NO ESTABLECIDA");
		}
		System.out.println("FIN DE PROGRAMA");
	}

}
