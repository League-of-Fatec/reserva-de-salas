package model.reserva;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.FabricaConexao;


public class SelecionarReserva {
	
	public static void selecionarGeral() {
		
		String sqlSelect = "SELECT * FROM reserva";
		PreparedStatement ps = null;		
		
		try {
			ps = FabricaConexao.getConexao().prepareStatement(sqlSelect);
			ResultSet resultado = ps.executeQuery();
			
			System.out.println("----------------------------------");
			
			while(resultado.next()) {
				String nomeSala = resultado.getString("salaNome");
				String data = resultado.getString("data");
				String horarioInicio = resultado.getString("horarioInicio");
				String horarioFim = resultado.getString("horarioFim");
				String turma = resultado.getString("turma"); 
				
				System.out.println("Sala:" + nomeSala + "    Turma: " + turma 
						+ "\nHorario: " + horarioInicio + " - " + horarioFim 
						+ "\nData: " + data 
						+ "\n----------------------------------"); 
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void selecionarPorTurma(String turmaidentificacao) {
		

		String sqlSelect = "SELECT * FROM reserva WHERE turma = '" + turmaidentificacao + "'";
		PreparedStatement ps = null;
 

		try {
			ps = FabricaConexao.getConexao().prepareStatement(sqlSelect); 
			ResultSet resultado = ps.executeQuery();
			
			System.out.println("----------------------------------");
			
				while(resultado.next()) {
					String nomeSala = resultado.getString("salaNome");
					String data = resultado.getString("data");
					String horarioInicio = resultado.getString("horarioInicio");
					String horarioFim = resultado.getString("horarioFim");
					String turma = resultado.getString("turma");
					
					System.out.println("Sala:" + nomeSala + "    Turma: " + turma 
							+ "\nHorario: " + horarioInicio + " - " + horarioFim 
							+ "\nData: " + data 
							+ "\n----------------------------------"); 
				} 

			
			
		} catch (SQLException e) {
			System.out.println("Erro na seleção de turma.");
			e.printStackTrace();
		}
	}
	
}
