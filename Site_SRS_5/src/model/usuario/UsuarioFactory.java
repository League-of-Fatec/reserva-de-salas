package model.usuario;

public class UsuarioFactory {
	
	public static void cadastrarUsuario(Autoridade autoridade) {
		
		Usuario usuario; 
		
		if(autoridade.equals(Autoridade.ESTUDANTE)) { 
			 
			usuario = new UsuarioEstudante();
			usuario.cadastrarUsuario(); 
		 
		} else if(autoridade.equals(Autoridade.PROFESSOR)) {
			usuario = new UsuarioProfessor();
			usuario.cadastrarUsuario();
			
			
		} else if(autoridade.equals(Autoridade.ADMINISTRADOR)) {
			usuario = new UsuarioAdministrador();
			usuario.cadastrarUsuario();
			
		} else {
			System.out.println("Erro na seleção de usuario em Usuario Factory.");
		} 
		
	}

}
