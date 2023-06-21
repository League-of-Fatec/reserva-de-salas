package controller;

import java.util.Scanner;

import model.reserva.SelecionarReserva;

public class MenuEstudante {
	
	public static void mostrarMenu() {
		

		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int teste = 0; 
		
		while(teste == 0) {
			System.out.println("------------------------------"
					+ "\nEscolha o que quer fazer: \n1)Ver aulas reservadas.  \n2)Sair.");
			int escolha = entrada.nextInt();
			if(escolha == 1) {
				System.out.println("Qual sua turma? (DSM, VSM)");
				String turma = entrada.next(); 
				SelecionarReserva.selecionarPorTurma(turma);
				
			} else if (escolha == 2) { 
				teste = 1;
			} else {
				System.out.println("Deu erro no menu estudante.");
			}
			
		}
		
	}

}
