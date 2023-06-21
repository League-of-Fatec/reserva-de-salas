package model.usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import model.FabricaConexao;

public class UsuarioAdministrador implements Usuario{

	Scanner entrada = new Scanner(System.in);

	String nome;
	String email;
	String senha;
	

	@Override
	public void cadastrarUsuario() { 
		
		System.out.println("Digite o código que a escola lhe forneceu para cadastro: ");
		
		if(entrada.nextInt() == 321) {
			
			String sql = "INSERT INTO USUARIO (NOME, EMAIL , SENHA, TIPO_USUARIO, CURSO) VALUES (?, ? ,?, ?, NULL)" ;
			PreparedStatement ps = null;
			
			System.out.print("Digite seu nome: ");
			nome = entrada.next();
			System.out.print("Digite seu email: ");
			email = entrada.next();
			System.out.print("Digite sua senha: "); 
			senha = entrada.next();
			
			try {
				ps = FabricaConexao.getConexao().prepareStatement(sql);
				ps.setString( 1, nome);
				ps.setString( 2, email);
				ps.setString( 3, senha);
				ps.setString(4, "Administrador");
				
				ps.execute();
				ps.close();
				
			} catch (SQLException e) { 
				System.out.println("Erro na criação do Administrador. ");
			}
		} else {
			System.out.println("Código invalido, tente novamente.");
		}
		
		
	}
	
}
