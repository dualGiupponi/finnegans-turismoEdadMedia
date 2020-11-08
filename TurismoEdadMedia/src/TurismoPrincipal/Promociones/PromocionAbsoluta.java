package TurismoPrincipal.Promociones;

import java.util.ArrayList;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;

public class PromocionAbsoluta extends Promocion {
	private Integer descuentoEnMonedas;

	public PromocionAbsoluta(String nombre, ArrayList<Atraccion> atraccionesIncluidas, Integer descuentoEnMonedas,
			ETiposActividades tipoActividad) {
		super(nombre, atraccionesIncluidas, tipoActividad);
		this.descuentoEnMonedas = descuentoEnMonedas;
	}

	public Integer costo() {
		Integer precio = 0;
		for (Atraccion atraccion : super.getAtraccionesIncluidas()) {
			precio += atraccion.getCostoVisita();
		}
		return precio - descuentoEnMonedas;
	}
}
