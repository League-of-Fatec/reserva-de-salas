package model.salas;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import model.FabricaConexao;

//É pra ser usada ao inves de SalaDAO, mas ta dando erro.
public class CadastroSala {
	
	
	public static void cadastrar(Sala sala) {
		 
		@SuppressWarnings("resource")
		//Fechar o Scanner casa um erro no código ao ser usado no Menu Salas.
		Scanner entrada = new Scanner(System.in);
			System.out.println("----------------------------------\n"
					+ "Para cadastrar a sala, siga as instruções abaixo:\n"
					+ "1) Digite a identificacação da sala (Exemplo 1A, 2B)\n"
					+ "2) Digite o numero de cadeiras da sala. \n"  
					+ "3) Digite o numero de mesas da sala. \n"
					+ "4) Digite o numero de computadores na sala.\n"
					+ "5) Digite 'true' caso a sala possua um projetor, e 'false' caso não.\n"
					+ "6) Digite 'true' caso a sala possua um ventilador, e 'false' caso não.\n"
					+ "7) Digite 'true' caso a sala possua ar condicionado, e 'false' caso não.\n"
					+ "8) Digite 'true' caso a sala esteja disponivel, e 'false' caso não.");
			
			sala = new SalaBuilder()
					.withIdentificacao(entrada.next())  
					.withCaderias(entrada.nextInt())
					.withMesas(entrada.nextInt())
					.withComputadores(entrada.nextInt())
					.withProjetor(entrada.nextBoolean())
					.withVentilador(entrada.nextBoolean())
					.withArCondicionado(entrada.nextBoolean())
					.build(); 

		
		
		String sqlInsert = "INSERT INTO sala_de_aula "
				+ "(identificacao, disponivel, cadeiras, mesas, computadores, projetor, ventilador, arCondicionado) "
				+ "VALUES (?, 'Sim', ?, ?, ?, ?, ?, ?)" ; 
		PreparedStatement ps = null; 
		
		try { 
			ps = FabricaConexao.getConexao().prepareStatement(sqlInsert);
			ps.setString(1, sala.getIdentificacao());
			ps.setLong(2, sala.getCadeiras());
			ps.setLong(3, sala.getMesas());
			ps.setLong(4, sala.getComputadores());
			ps.setString(5, sala.isProjetor());
			ps.setString(6, sala.isVentilador());
			ps.setString(7, sala.isArCondicionado());
			
			ps.execute();  
			ps.close(); 
			
			System.out.println("\nSala cadastrada com sucesso!\n");
			
		} catch (SQLException e) {
			System.out.println("Erro ao cadastrar a sala...\n"); 
//			e.printStackTrace();
			}
		
	}

}
