package TurismoPrincipal.Promociones;

import java.util.ArrayList;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;

public class PromocionAxB extends Promocion{
	private Atraccion atraccionDescontada;
	
	public PromocionAxB(String nombre, ArrayList<Atraccion> atraccionesIncluidas, ETiposActividades tipoActividad, Atraccion atraccionDescontada) {
		super(nombre, atraccionesIncluidas, tipoActividad);
		// TODO Auto-generated constructor stub
		this.atraccionDescontada = atraccionDescontada;
	}
	
	public Integer costo() {
		Integer precio = 0;
    	for(Atraccion atraccion: super.getAtraccionesIncluidas()) {
    		precio += atraccion.getCostoVisita();
    	}
    	return precio - atraccionDescontada.getCostoVisita();
	}
	
}