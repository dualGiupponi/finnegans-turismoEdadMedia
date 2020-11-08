package TurismoPrincipal.Promociones;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;

public class PromocionPorcentual extends Promocion{
	private Integer porcentajeDescuento;
	
    public PromocionPorcentual(String nombre, Atraccion[] atraccionesIncluidas, ETiposActividades tipoActividad, Integer porcentajeDescuento) {
		super(nombre, atraccionesIncluidas, tipoActividad);
		this.porcentajeDescuento = porcentajeDescuento;
	}

    
}
