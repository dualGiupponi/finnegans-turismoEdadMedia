package TurismoPrincipal.Promociones;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;
import TurismoPrincipal.Interfaces.IPromAtrac;

public abstract class Promocion implements IPromAtrac{
    private String nombre;
    private Atraccion[] atraccionesIncluidas;
    private ETiposActividades tipoActividad;

    public Promocion(String nombre, Atraccion[] atraccionesIncluidas, ETiposActividades tipoActividad){
        this.setNombre(nombre);
        this.setAtraccionesIncluidas(atraccionesIncluidas);
        this.setTipoActividad(tipoActividad);
    }


    //Getters y Setters
    public ETiposActividades getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(ETiposActividades tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public Atraccion[] getAtraccionesIncluidas() {
        return atraccionesIncluidas;
    }

    public void setAtraccionesIncluidas(Atraccion[] atraccionesIncluidas) {
        this.atraccionesIncluidas = atraccionesIncluidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
