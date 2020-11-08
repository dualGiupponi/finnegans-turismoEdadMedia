package storage;

import java.util.List;

import TurismoPrincipal.Usuario;

public class ListadoUsuarios {
	List<Usuario> lista;
	
	public ListadoUsuarios(List<Usuario> listaUsuarios) {
		this.lista = listaUsuarios;
	}
	
	public List<Usuario> getListado(){
		return this.lista;
	}
}
