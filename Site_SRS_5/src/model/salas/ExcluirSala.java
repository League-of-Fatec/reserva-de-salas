package model.salas;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.FabricaConexao;

public class ExcluirSala {
	
	public static void excluir(String identificacao) {
		
		String sql = "DELETE FROM sala_de_aula WHERE identificacao = '" + identificacao + "'";
		
		PreparedStatement ps1 = null;
		
		try {
			ps1 = FabricaConexao.getConexao().prepareStatement(sql);
			
			ps1.execute();
			ps1.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		
	}

}
