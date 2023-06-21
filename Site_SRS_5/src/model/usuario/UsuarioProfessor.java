package model.usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import model.FabricaConexao; 

public class UsuarioProfessor implements Usuario{

	Scanner entrada = new Scanner(System.in);

	private String nome;
	private String email;
	private String senha;
	private String curso;
 
	@Override
	public void cadastrarUsuario() { 
		
		System.out.println("Digite o código que a escola lhe forneceu para cadastro: ");
		
		if(entrada.nextInt() == 123) {
			
			String sql = "INSERT INTO USUARIO (NOME, EMAIL , SENHA, TIPO_USUARIO, CURSO) VALUES (?, ? ,?, ?, ?)" ;
			PreparedStatement ps = null;
			
			System.out.print("Digite seu nome: ");
			nome = entrada.next();
			System.out.print("Digite seu email: ");
			email = entrada.next();
			System.out.print("Digite sua senha: "); 
			senha = entrada.next();
			System.out.print("Digite o curso que vai ensinar: ");
			curso = entrada.next();
			
			
			try {
				ps = FabricaConexao.getConexao().prepareStatement(sql);
				ps.setString( 1, nome);
				ps.setString( 2, email);
				ps.setString( 3, senha);
				ps.setString(4, "Professor");
				ps.setString(5, curso);
				
				ps.execute();
				ps.close();
				
			} catch (SQLException e) { 
				System.out.println("Erro na criação do professor");
			}
		} else {
			System.out.println("Código invalido, tente novamente.");
		}
		
		
	}
	
}
