package AppBank;

import java.util.LinkedList;
import java.util.List;

public class Modelo {
	
	private List<Usuario> usuarios = new LinkedList<Usuario>();

	public void cadastrarUsuario(Usuario usuario){
		usuarios.add(usuario);
	}
	public List<Usuario> buscarUsuarioPorUser(String user){
		List<Usuario> userEncontrados = new LinkedList<Usuario>();
		for(Usuario usuario: this.usuarios){
			if(usuario.getUser().equals(user)) userEncontrados.add(usuario);
		}
		return userEncontrados;
		
	}
	
	public List<Usuario> getUsuarios(){
		return this.usuarios;
	}
	
}
