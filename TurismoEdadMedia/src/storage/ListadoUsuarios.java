package storage;

import java.util.ArrayList;

import TurismoPrincipal.Usuario;

public class ListadoUsuarios {
	ArrayList<Usuario> lista = new ArrayList<Usuario>();

	public ListadoUsuarios(ArrayList<Usuario> listaUsuarios) {
		this.lista = listaUsuarios;
	}

	// CRUD
	public ArrayList<Usuario> getListado() {
		return this.lista;
	}

	public void agregarUsuario(Usuario usuario) {
		this.lista.add(usuario);
	}
	
	public void eliminarUsuario(Usuario usuario) {
		int index = this.lista.indexOf(usuario);
		if(index != -1)
			this.lista.remove(index);
	}

}
