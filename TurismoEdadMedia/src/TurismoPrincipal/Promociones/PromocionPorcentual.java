package TurismoPrincipal.Promociones;

import java.util.ArrayList;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;

public class PromocionPorcentual extends Promocion {
	private Integer porcentajeDescuento;
	
	public PromocionPorcentual(String nombre, ETiposActividades tipoActividad, Integer porcentajeDescuento) {
		super(nombre, tipoActividad);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	public PromocionPorcentual(String nombre, ArrayList<Atraccion> atraccionesIncluidas,
			ETiposActividades tipoActividad, Integer porcentajeDescuento) {
		super(nombre, atraccionesIncluidas, tipoActividad);
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public Integer costo() {
		Double precio = 0.0;
		for (Atraccion atraccion : super.getAtraccionesIncluidas()) {
			precio += atraccion.getCostoVisita();
		}
		return (int) (precio * (100 - porcentajeDescuento) / 100.0);
	}
}
