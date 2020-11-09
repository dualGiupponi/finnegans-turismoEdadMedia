package TurismoPrincipal.Promociones;

import java.util.ArrayList;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;

public class PromocionAbsoluta extends Promocion {
	private Integer precioPaquete;

	public PromocionAbsoluta(String nombre, ETiposActividades tipoActividad, Integer precioPaquete) {
		super(nombre,tipoActividad);
		this.precioPaquete = precioPaquete;
	}
	
	public PromocionAbsoluta(String nombre, ArrayList<Atraccion> atraccionesIncluidas, Integer precioPaquete,
			ETiposActividades tipoActividad) {
		super(nombre, atraccionesIncluidas, tipoActividad);
		this.precioPaquete = precioPaquete;
	}

	public Integer costo() {
		return precioPaquete;
	}
}
