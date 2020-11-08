package TurismoPrincipal.Promociones;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;

public class PromocionAxB extends Promocion{
	private Atraccion atraccionDescontada;
	
	public PromocionAxB(String nombre, Atraccion[] atraccionesIncluidas, ETiposActividades tipoActividad, Atraccion atraccionDescontada) {
		super(nombre, atraccionesIncluidas, tipoActividad);
		// TODO Auto-generated constructor stub
		this.atraccionDescontada = atraccionDescontada;
	}
	
}