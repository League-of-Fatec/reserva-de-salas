package controller;

import java.util.Scanner;

import model.reserva.SelecionarReserva;
import model.salas.CadastroSala;
import model.salas.ExcluirSala;
import model.salas.LiberarSala;
import model.salas.ReservaSala;
import model.salas.Sala;
import model.salas.SalaBuilder;
import model.salas.SelecionarSalas;
import model.salas.UpdateSala;
import model.usuario.ExcluirUsuario;
import model.usuario.SelecionarUsuario;

public class MenuAdministrador {
	
	public static void mostrarMenu() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int teste = 0;
		
		while(teste == 0) {
			System.out.println("------------------------------"
					+ "\nEscolha o que quer fazer: "
					+ "\n1)Ver salas.        | 2)Cadastrar salas.   "
					+ "\n3)Excluir salas.    | 4)Update Salas."
					+ "\n5)Reservar salas.   | 6)Cancelar reservas." 
					+ "\n7)Selecionar reserva| 8)Ver usuarios."
					+ "\n9)Excluir usuarios. | 0)Voltar. ");
			int escolha = entrada.nextInt();
			
			switch (escolha) {
			case 1: {//Ver salas.
				SelecionarSalas.selecionarGeral();
				break;
				
			}case 2: {//Cadastrar salas.
				Sala sala = new SalaBuilder().build();
				CadastroSala.cadastrar(sala);
				break;
				
			}case 3: {//Excluir salas.
				System.out.println("Digite a identificação da sala que deseja excluir: (1A)");
				String identificacao = entrada.next();
				ExcluirSala.excluir(identificacao);
				break;
				
			}case 4: {//Update Salas.
				System.out.println("Qual sala deseja atualizar? (1A, 2B");
				String sala = entrada.next();
				System.out.println("O que deseja atualizar? \n1)Cadeiras. 2)Mesas. "
						+ "\n3)Ventilador. 4)Computadores. \n5)Ar Condicionado ");
				int escolhaUpdate = entrada.nextInt();

				switch (escolhaUpdate) {
				case 1: {//cadeiras.
					System.out.println("Quantas cadeiras a sala tem agora?");
					String numeroCadeiras = entrada.next();
					UpdateSala.update(sala, "cadeiras", numeroCadeiras);
					break;
				} case 2:{//mesas
					System.out.println("Quantas mesas tem agora?");
					String numeroMesas = entrada.next();
					UpdateSala.update(sala, "mesas", numeroMesas);
					break;
				} case 3: {//ventilador
					System.out.println("Digite 1 caso tenha ventilador, e 2 caso não.");
					int sn = entrada.nextInt();
					String tf = "";
					if(sn == 1) {
						tf = "Sim";
					} if (sn == 2) {
						tf = "Não";
					}
					UpdateSala.update(sala, "computadores", tf);
					break;
				}case 4: {//Computadores
					System.out.println("Quantas computadores a sala tem agora?");
					String numeroComputadores = entrada.next();
					UpdateSala.update(sala, "cadeiras", numeroComputadores);
					break;
				}case 5: {//Ar Condicionado
					System.out.println("Digite 1 caso tenha ar condicionado, e 2 caso não.");
					int sn = entrada.nextInt();
					String tf = "";
					if(sn == 1) {
						tf = "Sim";
					} if (sn == 2) {
						tf = "Não";
					}
					UpdateSala.update(sala, "arCondicionado", tf);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + escolhaUpdate);
				}
				
				System.out.println("Atualização bem sucedida!");
				break; 
				
			}case 5: {//Reservar salas.
				System.out.print("Digite a sala que deseja reservar: "); 
				String salaNome = entrada.next(); 
				ReservaSala.reservar(salaNome);	 
				break;
				
			}case 6: {//Cancelar reservas.
				System.out.println("Digite a identificação da sala que deseja liberar: (1A)");
				String identificacao = entrada.next();
				System.out.println("Digite a data da reserva: ");
				String data = entrada.next();
				LiberarSala.liberar(identificacao, data);
				break;
			}case 7:{//Ver reservas
				System.out.println("Deseja ver: \1)Todas as reservas.   2)Reservas por turma.");
				int selecionar = entrada.nextInt();
				if(selecionar == 1) {
					SelecionarReserva.selecionarGeral();
				} else if(selecionar == 2) {
					System.out.print("Digite a turma: ");
					String turma = entrada.next();
					SelecionarReserva.selecionarPorTurma(turma);
				}
				break;
			}
			
			
			case 8: {//Ver usuarios.
				System.out.println("1)TODOS os usuarios.  2) Estudante.  3) Professores.  4) Administradores");
				int escolhaSelect = entrada.nextInt();
				
				if(escolhaSelect == 1) {
					SelecionarUsuario.selecionarGeral();
				}else if (escolhaSelect == 2) {
					SelecionarUsuario.selecionarPorTipo("Estudante");
				}else if (escolhaSelect == 3) {
					SelecionarUsuario.selecionarPorTipo("Professor");
				}else if (escolhaSelect == 4) {
					SelecionarUsuario.selecionarPorTipo("Administrador");
				} else {
					System.out.println("Ocorreu um erro ao selecionar a visualização.");
				}
				break;
				
			}case 9: {//Excluir usuarios.
				System.out.println("Digite o id do usuario que deseja excluir: ");
				int id = entrada.nextInt();
				ExcluirUsuario.excluir(id);	
			}
			
			case 0: {//Voltar.
				teste = 1;
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + escolha);
			}
			
		}
	}

}
