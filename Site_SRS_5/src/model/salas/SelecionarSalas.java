package model.salas;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.FabricaConexao;

public class SelecionarSalas {
	
	public static void selecionarGeral() { 
		
		@SuppressWarnings("resource") 
		Scanner entrada = new Scanner(System.in);
		 
		System.out.println("Deseja selecinoar salas: \n1) Disponiveis. 2) Reservadas. 3) Todas. ");
		int escolha = entrada.nextInt();
		int confirmacao = 0;
		String sqlSelect = "";
		 
		while(confirmacao == 0) {
			  
			
			switch (escolha) {
			case 1: {
				sqlSelect = "SELECT * FROM sala_de_aula WHERE disponivel = 'sim'";
				confirmacao = 1;
				break;
			} case 2: {
				sqlSelect = "SELECT * FROM sala_de_aula WHERE disponivel = 'não'";
				confirmacao = 1;
				break;
				
			} case 3: {
				sqlSelect = "SELECT * FROM sala_de_aula";
				confirmacao = 1;
				break;
				
			}
			default:
//			throw new IllegalArgumentException("Unexpected value: " + escolha);
				System.out.println("Opção invalida, tente novamente.");
				escolha = 0;
				break;
			}
		}
		
		PreparedStatement ps = null;
		
		try {
			ps = FabricaConexao.getConexao().prepareStatement(sqlSelect);
			//Está sendo usado para armazenar o que o select pegou.
			ResultSet resultado = ps.executeQuery();
			System.out.println("----------------------------------");
			 
			while(resultado.next()) {
				String identificacao = resultado.getString("identificacao");
				String cadeiras = resultado.getString("Cadeiras");
				String mesas = resultado.getString("mesas"); 
				String ventilador = resultado.getString("Ventilador");
				String computadores = resultado.getString("Computadores"); 
				String arCondicionado = resultado.getString("arCondicionado");
				String disponivel = resultado.getString("disponivel");
				
				System.out.println( "Sala: " + identificacao + "        | Disponivel: " + disponivel + "\n"
						+ "Cadeiras: " + cadeiras + "    | Mesas: " + mesas + "\n"
						+ "Computadores : " + computadores  + "| Ventilador: " + ventilador + "\n"
						+ "Ar Condicionado: " + arCondicionado + "\n"
						+ "----------------------------------");
				
			}
			
		} catch (SQLException e) {
			System.out.println("Falha no select geral.");
//		e.printStackT	race();
		}

		
	}		

	//ARRUMAR
	public static void selecionarParaTurma(String turmaIdentificacao) {
		
		String sql = "SELECT * FROM sala_de_aula WHERE turma = '" + turmaIdentificacao + "'";
		PreparedStatement ps1 = null;
		
		try {
			ps1 = FabricaConexao.getConexao().prepareStatement(sql);
			ResultSet resultado = ps1.executeQuery();
			
			System.out.println("----------------------------------");
			
			while(resultado.next()) {
				String identificacao = resultado.getString("identificacao");
				String cadeiras = resultado.getString("Cadeiras");
				String mesas = resultado.getString("mesas"); 
				String ventilador = resultado.getString("Ventilador"); 
				String computadores = resultado.getString("Computadores"); 
				String arCondicionado = resultado.getString("arCondicionado");
				
				System.out.println( "Sala: " + identificacao + "         \n"
						+ "Cadeiras: " + cadeiras + "    | Mesas: " + mesas + "\n"
						+ "Computadores : " + computadores  + "| Ventilador: " + ventilador + "\n"
						+ "Ar Condicionado: " + arCondicionado + "\n"
						+ "----------------------------------");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
