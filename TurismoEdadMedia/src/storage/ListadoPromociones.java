package storage;

import java.util.ArrayList;

import TurismoPrincipal.Enums.ETiposActividades;
import TurismoPrincipal.Promociones.Promocion;

public class ListadoPromociones {
	ArrayList<Promocion> lista = new ArrayList<Promocion>();
	
	public ListadoPromociones() {}
	
	public ListadoPromociones(ArrayList<Promocion> listadoPromociones) {
		this.lista = listadoPromociones;
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
		ArrayList<Promocion> listaPromocion = this.getLista();
		return algoritmoOrdenDineroTiempo(listaPromocion);
	}

	public ArrayList<Promocion> getListaOrdenada(ETiposActividades tipoActividad) {
		ArrayList<Promocion> listaPromocion = this.getLista(tipoActividad);
		return algoritmoOrdenDineroTiempo(listaPromocion);
	}

	public void agregarPromocion(Promocion promocion) {
			this.lista.add(promocion);
	}
	
	public void eliminarPromocion(Promocion promocion) {
		int index = this.lista.indexOf(promocion);
		if(index != -1)
			this.lista.remove(index);
	}
	
	//Métodos própios de la clase
	private ArrayList<Promocion> algoritmoOrdenDineroTiempo(ArrayList<Promocion> listaPromociones) {
		Promocion promocionAux;
		Promocion promocionA;
		Promocion promocionB;

		for (int i = 0; i < listaPromociones.size(); i++) {
			for (int j = i + 1; j < listaPromociones.size(); j++) {
				promocionA = listaPromociones.get(i);
				promocionB = listaPromociones.get(j);

				// Cambia A por B en el array
				if (promocionA.costo() < promocionB.costo()) {
					promocionAux = promocionA;
					listaPromociones.set(i, promocionB);
					listaPromociones.set(j, promocionAux);
				} else if (promocionA.costo() == promocionB.costo() && promocionA.tiempo() < promocionB.tiempo()) {
					promocionAux = promocionA;
					listaPromociones.set(i, promocionB);
					listaPromociones.set(j, promocionAux);
				}
				;

			}
		}

		return listaPromociones;
	}
	
}
