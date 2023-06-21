package model.salas;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.FabricaConexao;

public class UpdateSala {
	
		public static void update(String salaNome, String campo, String valor) {
		
		String sqlUpdate = "UPDATE sala_de_aula SET " + campo + " = '" + valor +"' WHERE identificacao = '" + salaNome + "'";
		
		PreparedStatement ps = null;   
		
		try {
			ps = FabricaConexao.getConexao().prepareStatement(sqlUpdate);	
			
			ps.execute();
			ps.close();
			 
		} catch (SQLException e) {
//			System.out.println("Erro na reserva de sala");
			e.printStackTrace(); 
		}
		
	}
	
}
