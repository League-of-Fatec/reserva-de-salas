package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//SINGLETON USADO AQUI
public class FabricaConexao {
	
	 static String DBUrl= "jdbc:mysql://localhost:3306/salateste";
	 static String DBUsername="root";
	 static String DBPassword = "Fatec123";
	 
	 public static Connection conn; 
	 
	 public static Connection getConexao() {
		 
		 try {
			if(conn == null) {
				conn = DriverManager.getConnection(DBUrl, DBUsername, DBPassword);
				return conn;
			} else {
				return conn;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		  
	 }

}
