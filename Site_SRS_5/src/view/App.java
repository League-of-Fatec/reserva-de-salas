package view;

import java.util.Scanner;
import controller.CadastrarUsuario;
import controller.Login;

//Classe para representar o app.
public class App { 
	  
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 
		System.out.println("Bem vindo ao sistema!");		
		int teste  = 0; 
		
		while(teste != 3) {
			System.out.println("------------------------------"
					+ "\n1) Login. 2) Cadastro.  3) Sair.");
			int controle = entrada.nextInt();
			 
			switch (controle) {//Login.
			case 1: {
				 Login.fazerLogin();
				
				controle = 0; 
				break;  
				
			}  case 2: {//Cadastro
				
				System.out.println("-------------------------------\nDigite o tipo de usuário que quer cadastrar: "
						+ "\n1) Estudante.  2) Professor.  3) Administrador");
				
				int escolha = entrada.nextInt();
				
				CadastrarUsuario.mostrarMenu(escolha);
				controle = 0;
				break;
			} case 3: {
				teste = 3;  
				break; 
			}
			
			default:
				System.out.println("Erro no case geral do app.");
				throw new IllegalArgumentException("Unexpected value: " + controle);
			}
			
		}
		
		entrada.close();
		
	}
}