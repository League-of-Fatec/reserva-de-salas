package model.salas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
//import java.util.Scanner;

import model.FabricaConexao;

public class LiberarSala {
	
	public static void liberar(String identificacao, String data) {

		 
		String sqlDelete = "DELETE FROM reserva WHERE salaNome = '"+identificacao +"' AND data = '" + data + "'" ;
		
		PreparedStatement ps1 = null;
		
		try {
			ps1 = FabricaConexao.getConexao().prepareStatement(sqlDelete);
			
			ps1.execute();
			ps1.close();
			
			UpdateSala.update(identificacao, "disponivel", "Sim");
			
			System.out.println("Cancelamento feito com sucesso!");
			
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}
