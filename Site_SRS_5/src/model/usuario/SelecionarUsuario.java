package model.usuario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.FabricaConexao;


public class SelecionarUsuario {
	
	public static void selecionarGeral() {
		
		String sql = "SELECT nome, email, curso FROM usuario";
		PreparedStatement ps1 = null;
		
		try {
			ps1 = FabricaConexao.getConexao().prepareStatement(sql);
			ResultSet resultado = ps1.executeQuery();
			
			System.out.println("----------------------------------");

			while(resultado.next()) {
				String nome = resultado.getString("nome");
				String turma = resultado.getString("curso");
				String email = resultado.getString("email");
				
				System.out.println("Nome: " + nome + "  | Turma: " + turma + "\nEmail: " + email + "\n----------------------------------");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	
		}
		
	}
	
	public static void selecionarPorTipo(String quem){ 
		
		
		String sql = "SELECT nome, email, curso FROM usuario WHERE tipo_usuario = '" + quem +"'";
		PreparedStatement ps1 = null;
		
		try {
			ps1 = FabricaConexao.getConexao().prepareStatement(sql);
			ResultSet resultado = ps1.executeQuery(); 
			 
			System.out.println("----------------------------------");

			while(resultado.next()) {
				String nome = resultado.getString("nome");
				String turma = resultado.getString("curso");
				String email = resultado.getString("email");
				
				System.out.println("Nome: " + nome + "  | Turma: " + turma + "\nEmail: " + email + "\n----------------------------------");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
//		String turma = escolherTurma.escolher();
//		String sql = "SELECT nome FROM usuario WHERE curso = '" + turma +"'"; 	
//		
//		List<Usuario> listaEstudantes = new ArrayList<>(); 
//		 
//		PreparedStatement ps = null; 
//		ResultSet resultado = null;
//		 
//		try { 
//			ps = FabricaConexao.getConexao().prepareStatement(sql);
//			
//			resultado = ps.executeQuery();
//			
//			
//			while(resultado.next()) {
//				
//				UsuarioEstudante aluno = new UsuarioEstudante();
//				  
//				//Pegando as informações do usuario do BD
////				aluno.setId(resultado.getInt("id"));
//				aluno.setNome(resultado.getString("nome")); 
////				aluno.setEmail(resultado.getString("email")); 
////				aluno.setSenha(resultado.getString("senha")); 
//				
//				listaEstudantes.add(aluno);
//			}
//		} catch (SQLException e) {
//			System.out.println("Erro no SelecionarUsuario, na parte de pegar os dados.");
////			e.printStackTrace();
//		}
//		
//		
//		
//		return listaEstudantes;
//		
	}

}
