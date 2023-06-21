package model.reserva;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import model.FabricaConexao;
import model.salas.RecuperarId;

public class CadastrarReserva {

	public static void cadastrar(Reserva reserva, String salaNome) { 
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		 
		System.out.println("Para reservar, a sala, siga as instruções a seguir: "
				+ "\n1)Data que deseja reservar (12/10)."
				+ "\n2)Horario de inicio da aula (12:10)."
				+ "\n3)Data de termino da aula (13:50)."
				+ "\n4)Turma para qual vai reservar (VSM).");	 

		int id = RecuperarId.recuperar(salaNome);
		
 
		reserva = new ReservaBuilder()
				.withNomeSala(salaNome)
				.withData(entrada.next()) 
				.withHorarioInicio(entrada.next())
				.withHorarioFim(entrada.next())
				.withTurma(entrada.next())
				.build();
		
		String sqlInsert = "INSERT INTO reserva "
				+ "(salaNome, data, horarioInicio, horarioFim, turma, idSala) "
				+ "VALUES (?, ?, ?, ?, ?, ?)"; 
		
		PreparedStatement ps1 = null;
		try {
			ps1 = FabricaConexao.getConexao().prepareStatement(sqlInsert);
			
			ps1.setString(1, reserva.getNomeSala());
			ps1.setString(2, reserva.getData());
			ps1.setString(3, reserva.getHorarioInicio());
			ps1.setString(4, reserva.getHorarioFim());
			ps1.setString(5, reserva.getTurma());
			ps1.setLong(6, id);
			
			ps1.execute();
			ps1.close();
			
			System.out.println("\nCadastro de reserva bem sucedido");
			
		} catch (SQLException e) {
			System.out.println("Erro no cadastro de reserva.");
			e.printStackTrace();
		}
	
	}
	
}
