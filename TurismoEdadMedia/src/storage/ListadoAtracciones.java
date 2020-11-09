package storage;

import java.util.ArrayList;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;

public class ListadoAtracciones {
	ArrayList<Atraccion> lista = new ArrayList<Atraccion>();

	public ListadoAtracciones() {
	}

	public ListadoAtracciones(ArrayList<Atraccion> atracciones) {
		this.lista = atracciones;
	}

	// CRUD
	public ArrayList<Atraccion> getLista() {
		ArrayList<Atraccion> listaAtracciones = new ArrayList<Atraccion>();
		for (Atraccion atraccion : this.lista) {
			if (atraccion.esDisponible())
				listaAtracciones.add(atraccion);
		}
		return listaAtracciones;
	}

	public ArrayList<Atraccion> getLista(ETiposActividades tipoActividad) {
		ArrayList<Atraccion> listaAtracciones = this.getLista();
		ArrayList<Atraccion> listaFiltrada = new ArrayList<Atraccion>();

		for (Atraccion atraccion : listaAtracciones) {
			if (atraccion.tipo() == tipoActividad)
				listaFiltrada.add(atraccion);
		}

		return listaFiltrada;
	}

	public ArrayList<Atraccion> getListaOrdenada() {
		ArrayList<Atraccion> listaAtracciones = this.getLista();

		return algoritmoOrdenDineroTiempo(listaAtracciones);
	}

	public ArrayList<Atraccion> getListaOrdenada(ETiposActividades tipoActividad) {
		ArrayList<Atraccion> listaAtracciones = this.getLista(tipoActividad);

		return algoritmoOrdenDineroTiempo(listaAtracciones);
	}

	public void agregarAtraccion(Atraccion atraccion) {
		this.lista.add(atraccion);
	}

	public void eliminarAtraccion(Atraccion atraccion) {
		int indice = this.lista.indexOf(atraccion);
		if (indice != -1)
			this.lista.remove(indice);
	}

	// Métodos privados de la clase
	private ArrayList<Atraccion> algoritmoOrdenDineroTiempo(ArrayList<Atraccion> listaAtracciones) {
		Atraccion atraccionAux;
		Atraccion atraccionA;
		Atraccion atraccionB;

		for (int i = 0; i < listaAtracciones.size(); i++) {
			for (int j = i + 1; j < listaAtracciones.size(); j++) {
				atraccionA = listaAtracciones.get(i);
				atraccionB = listaAtracciones.get(j);

				// Cambia A por B en el array
				if (atraccionA.costo() < atraccionB.costo()) {
					atraccionAux = atraccionA;
					listaAtracciones.set(i, atraccionB);
					listaAtracciones.set(j, atraccionAux);
				} else if (atraccionA.costo() == atraccionB.costo() && atraccionA.tiempo() < atraccionB.tiempo()) {
					atraccionAux = atraccionA;
					listaAtracciones.set(i, atraccionB);
					listaAtracciones.set(j, atraccionAux);
				}
				;

			}
		}

		return listaAtracciones;
	}
}
