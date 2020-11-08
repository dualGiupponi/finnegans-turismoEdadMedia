package storage;

import java.util.ArrayList;

import TurismoPrincipal.Enums.ETiposActividades;
import TurismoPrincipal.Promociones.Promocion;

public class ListadoPromociones {
	ArrayList<Promocion> lista;

	public ListadoPromociones(ArrayList<Promocion> listadoPromocion) {
		this.lista = listadoPromocion;
	}

	// CRUD
	public ArrayList<Promocion> getLista() {
		return this.lista;
	}

	public ArrayList<Promocion> getLista(ETiposActividades tipoActividad) {
		ArrayList<Promocion> listado = new ArrayList<Promocion>();
		for (Promocion promocion : this.lista) {
			if (promocion.tipo() == tipoActividad)
				listado.add(promocion);
		}
		return listado;
	}

	public ArrayList<Promocion> getListaOrdenada() {
		return this.lista;
	}

	public ArrayList<Promocion> getListaOrdenada(ETiposActividades tipoActividad) {
		return this.getLista(tipoActividad);
	}

	public void agregarPromocion(Promocion promocion) {
		this.lista.add(promocion);
	}
}
