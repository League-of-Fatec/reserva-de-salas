package model.salas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Scanner;

import model.FabricaConexao;

public class RecuperarId {
	
	public static int recuperar(String identidade) {
		int id = 0;
		
		
		String sql = "SELECT id FROM sala_de_aula WHERE identificacao = '"+identidade+"'";
		PreparedStatement ps = null;

		
		try { 
			ps = FabricaConexao.getConexao().prepareStatement(sql);
			 
			ResultSet resultado = ps.executeQuery();  
			
			while(resultado.next()){
				id = resultado.getInt("id");
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
				
 
		return id;
		
	}

}
