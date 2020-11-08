package TurismoPrincipal.Promociones;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;

public class PromocionAbsoluta extends Promocion {
    private Integer descuentoEnMonedas;
    private Integer precioConDescuento = 0;
    
    public PromocionAbsoluta(String nombre, Atraccion[] atraccionesIncluidas, Integer descuentoEnMonedas, ETiposActividades tipoActividad) {
        super(nombre, atraccionesIncluidas, tipoActividad);
        this.descuentoEnMonedas = descuentoEnMonedas;
        
        precioConDescuento = calcularDescuento();
    }

    private Integer calcularDescuento() {
    	Integer precio = 0;
    	for(Atraccion atraccion: super.getAtraccionesIncluidas()) {
    		precio += atraccion.getCostoVisita();
    	}
    	return precio - descuentoEnMonedas;
    }
    
    public Integer costo() {
    	return precioConDescuento;
    }
    
    public Boolean esDisponible() {
    	for(Atraccion atraccion: super.getAtraccionesIncluidas()) {
    		if(!atraccion.esDisponible()) {
    			return false;
    		}
    	}
    	return true;
    }

}
