package controller;

import java.util.Scanner;

import model.reserva.SelecionarReserva;
import model.salas.LiberarSala;
import model.salas.ReservaSala;
import model.salas.SelecionarSalas;

public class MenuProfessor {

	public static void mostrarMenu() {

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int teste = 0;
		
		while(teste == 0) {
			System.out.println("------------------------------\n"
					+ "Escolha o que quer fazer: \n1)Ver salas.  \n2)Reservar salas.   \n3)Cancelar reserva.   "
					+ "\n4)Ver reservas.    \n5) Voltar.");
			int escolha = entrada.nextInt();			
			if(escolha == 1) {//Ver salas.
				SelecionarSalas.selecionarGeral();
				
			} else if (escolha == 2) {//Reservar salas.
				System.out.print("Digite a sala que deseja reservar: "); 
				String salaNome = entrada.next(); 
				ReservaSala.reservar(salaNome);
				
			} else if (escolha == 3){//Cancelar reserva.
				
				System.out.println("Digite a identificação da sala que deseja liberar: (1A)");
				String identificacao = entrada.next();
				System.out.println("Digite a data da reserva: ");
				String data = entrada.next();
				LiberarSala.liberar(identificacao, data);
				
			} else if (escolha == 4) {
				System.out.println("Deseja ver: \1)Todas as reservas.   2)Reservas por turma.");
				int selecionar = entrada.nextInt();
				if(selecionar == 1) {
					SelecionarReserva.selecionarGeral();
				} else if(selecionar == 2) {
					System.out.print("Digite a turma: ");
					String turma = entrada.next();
					SelecionarReserva.selecionarPorTurma(turma);
				}
				 
			}else if(escolha == 5) {
				teste = 1;
			}
			
			else {
				System.out.println("Erro no menu do professor.");
			}
			
		}
	}
	
}
