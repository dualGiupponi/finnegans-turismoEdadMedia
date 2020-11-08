package TurismoPrincipal;

import TurismoPrincipal.Enums.ETiposActividades;
import TurismoPrincipal.Interfaces.IPromAtrac;

public class Atraccion implements IPromAtrac{
    private String nombre;
    private Integer costoVisita;
    private Integer cantidadVisitantes = 0;
    private Double promedioTiempo;
    private Integer cupoVisitante;
    private ETiposActividades tipoAtraccion;

    public Atraccion(String nombre, Integer costoVisita,  Double promedioTiempo,
            Integer cupoVisitante, ETiposActividades tipoAtraccion) {
        this.setNombre(nombre);
        this.setCostoVisita(costoVisita);
        this.setPromedioTiempo(promedioTiempo);
        this.setCupoVisitante(cupoVisitante);
        this.setTipoAtraccion(tipoAtraccion);
    }

    public Integer costo(){
        return this.getCostoVisita();
    }

    public Double tiempo(){
        return this.getPromedioTiempo();
    }

    public ETiposActividades tipo(){
        return this.getTipoAtraccion();
    }

    public Boolean esDisponible(){
        return (this.cupoVisitante - this.cantidadVisitantes) > 0;
    }

    //Getters y Setters
    public ETiposActividades getTipoAtraccion() {
        return tipoAtraccion;
    }

    public void setTipoAtraccion(ETiposActividades tipoAtraccion) {
        this.tipoAtraccion = tipoAtraccion;
    }

    public Integer getCupoVisitante() {
        return cupoVisitante;
    }

    public void setCupoVisitante(Integer cupoVisitante) {
        this.cupoVisitante = cupoVisitante;
    }

    public Double getPromedioTiempo() {
        return promedioTiempo;
    }

    public void setPromedioTiempo(Double promedioTiempo) {
        this.promedioTiempo = promedioTiempo;
    }

    public Integer getcantidadVisitantes() {
        return cantidadVisitantes;
    }

    public void setcantidadVisitantes(Integer cantidadVisitantes) {
        this.cantidadVisitantes = cantidadVisitantes;
    }

    public Integer getCostoVisita() {
        return costoVisita;
    }

    public void setCostoVisita(Integer costoVisita) {
        this.costoVisita = costoVisita;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
