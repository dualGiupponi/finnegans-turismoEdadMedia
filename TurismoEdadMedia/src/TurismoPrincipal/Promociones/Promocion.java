package TurismoPrincipal.Promociones;

import java.util.ArrayList;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;
import TurismoPrincipal.Interfaces.IPromAtrac;

public abstract class Promocion implements IPromAtrac{
    private String nombre;
    private ArrayList<Atraccion> atraccionesIncluidas;
    private ETiposActividades tipoActividad;

    public Promocion(String nombre, ArrayList<Atraccion> atraccionesIncluidas, ETiposActividades tipoActividad){
        this.setNombre(nombre);
        this.setAtraccionesIncluidas(atraccionesIncluidas);
        this.setTipoActividad(tipoActividad);
    }

    public ETiposActividades tipo() {
    	return this.tipoActividad;
    }
    
    public Boolean esDisponible() {
    	for(Atraccion atraccion: atraccionesIncluidas) {
    		if(!atraccion.esDisponible()) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public Double tiempo() {
    	Double tiempoTotal = 0.0;
    	for(Atraccion atraccion: atraccionesIncluidas) {
    		tiempoTotal += atraccion.getPromedioTiempo();
    	}
    	return tiempoTotal;
    }

    //Getters y Setters
    public ETiposActividades getTipoActividad() {
        return tipoActividad;
    }

    public void setTipoActividad(ETiposActividades tipoActividad) {
        this.tipoActividad = tipoActividad;
    }

    public ArrayList<Atraccion> getAtraccionesIncluidas() {
        return atraccionesIncluidas;
    }

    public void setAtraccionesIncluidas(ArrayList<Atraccion> atraccionesIncluidas) {
        this.atraccionesIncluidas = atraccionesIncluidas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
