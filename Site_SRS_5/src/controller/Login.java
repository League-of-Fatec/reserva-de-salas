package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.FabricaConexao;

public class Login {

	public static void fazerLogin() {
		
        System.out.println("Login \n  \nInsira seu email:");
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        String email = sc.next();
        System.out.println("Insira sua senha");
        String senha = sc.next();
        
        String sql = "SELECT nome, email, senha, tipo_usuario FROM usuario WHERE email = '"+ email +"' AND senha = '"+ senha+"'";
		PreparedStatement ps1 = null;
		
		try {
			ps1 = FabricaConexao.getConexao().prepareStatement(sql);
			ResultSet resultado = ps1.executeQuery();
			
			System.out.println("----------------------------------");
			
			
			
			if(resultado.next()) {

					String nome = resultado.getString("nome");
					String tipo = resultado.getString("tipo_usuario");
					
					switch (tipo) {
					case "Estudante": {
						System.out.println("Bem vindo " + nome + "!");
						MenuEstudante.mostrarMenu();
						break;
					} case "Professor": {
						System.out.println("Bem vindo " + nome + "!");
						MenuProfessor.mostrarMenu();
						break;
					} case "Administrador": {
						System.out.println("Bem vindo " + nome + "!");
						MenuAdministrador.mostrarMenu();
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + tipo);
					}	
					
					
			} else {
				System.out.println("Falha no login, tente novamente.");
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
	}
	
}
