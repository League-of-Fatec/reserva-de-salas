package controller;

//import java.util.Scanner;

import model.usuario.Autoridade;
import model.usuario.UsuarioFactory;

public class CadastrarUsuario {
	 
	
	public static void mostrarMenu(int escolha) {
		
		System.out.println("-------------------------------\nDigite o tipo de usuário que quer cadastrar: "
				+ "\n1) Estudante.  2) Professor.  3) Administrador");
		  
		if(escolha == 1) {
			UsuarioFactory.cadastrarUsuario(Autoridade.ESTUDANTE); 
			System.out.println("Você cadastrou um estudante com sucesso!"); 
		} else if(escolha == 2) {
			UsuarioFactory.cadastrarUsuario(Autoridade.PROFESSOR);
			System.out.println("Você cadastrou um professor com sucesso!");
			
		} else if(escolha == 3) {
			UsuarioFactory.cadastrarUsuario(Autoridade.ADMINISTRADOR);
			System.out.println("Você cadastrou um administrador com sucesso!");
		} else {
			System.out.println("Erro no if de APP de cadastrar usuario.");
		}
		
	}

	
}
