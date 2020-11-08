package storage;

import java.util.ArrayList;

import TurismoPrincipal.Atraccion;

public class ListadoAtracciones {
	ArrayList<Atraccion> lista = new ArrayList<Atraccion>();
	
	public ListadoAtracciones(ArrayList<Atraccion> atracciones) {
		this.lista = atracciones;
	}
	
	
	//CRUD
	public ArrayList<Atraccion> getLista() {
		ArrayList<Atraccion> lista = new ArrayList<Atraccion>();
		for(Atraccion atraccion: this.lista) {
			if(atraccion.esDisponible()) lista.add(atraccion);
		}
		return lista;
	}
	
	public ArrayList<Atraccion> getListaOrdenada(){
		ArrayList<Atraccion> lista = this.getLista();
		
		return lista;
	}
	
	public void agregarAtraccion(Atraccion atraccion) {
		this.lista.add(atraccion);
	}
}
