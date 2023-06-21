
package model.usuario;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.FabricaConexao;

public class ExcluirUsuario {
	
	public static void excluir(int id) {
		
		String sql = "DELETE FROM usuario WHERE id = '" + id + "'";
		
		PreparedStatement ps1 = null;
		
		try {
			ps1 = FabricaConexao.getConexao().prepareStatement(sql);
			
			ps1.execute();
			ps1.close();
			
			System.out.println("Usuario excluido com sucesso!");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				
		
	}
	

}
