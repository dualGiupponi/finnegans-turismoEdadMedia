package TurismoPrincipal.Promociones;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;

public class PromocionAbsoluta extends Promocion {
    private Integer descuentoEnMonedas;

    public PromocionAbsoluta(String nombre, Atraccion[] atraccionesIncluidas, Integer descuentoEnMonedas, ETiposActividades tipoActividad) {
        super(nombre, atraccionesIncluidas, tipoActividad);
        this.descuentoEnMonedas = descuentoEnMonedas;
    }



}
