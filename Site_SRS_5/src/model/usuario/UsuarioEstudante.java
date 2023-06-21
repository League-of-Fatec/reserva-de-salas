package model.usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import model.FabricaConexao;

public class UsuarioEstudante implements Usuario{
	
	Scanner entrada = new Scanner(System.in); 

	private int id;
	private String nome; 
	private String email;
	private String senha;
	private String curso;
	

	@Override   
	public void cadastrarUsuario() {
		String sql = "INSERT INTO USUARIO (NOME, EMAIL , SENHA, TIPO_USUARIO, CURSO) VALUES (?, ? ,?, ?, ?)" ;
		PreparedStatement ps = null;
		
		System.out.print("Digite seu nome: "); 
		nome = entrada.next();
		System.out.print("Digite seu email: ");
		email = entrada.next();
		System.out.print("Digite sua senha: "); 
		senha = entrada.next();
		System.out.print("Digite seu curso: ");
		curso = entrada.next();
		  
		try {
			ps = FabricaConexao.getConexao().prepareStatement(sql);
			ps.setString( 1, nome);
			ps.setString( 2, email);
			ps.setString( 3, senha);
			ps.setString(4, "Estudante");
			ps.setString(5, curso);
			  
			ps.execute();
			ps.close();
			
		} catch (SQLException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public int getId() {
		return id;
	}



	public void setId(int i) {
		this.id = i;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}



	
	
	
	@Override
	public String toString() {
		return "Nome: " + nome + " \nEmail: " + email + " \nSenha: " + senha;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}


	public void update(String teste) {
		System.out.println("Aluno Tal chamado para aula tal");
		
	}
	
}
