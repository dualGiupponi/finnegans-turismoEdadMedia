package storage;

import java.util.ArrayList;

import TurismoPrincipal.Usuario;

public class ListadoUsuarios {
	ArrayList<Usuario> lista;

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

}
