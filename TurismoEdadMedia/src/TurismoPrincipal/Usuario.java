package TurismoPrincipal;

import TurismoPrincipal.Enums.ETiposActividades;

public class Usuario {
	private String nombre;
	private ETiposActividades preferencia;
	private Integer presupuesto;
	private Double tiempoDisponible;

	public Usuario(String nombre, ETiposActividades preferencia, Integer presupuesto, Double tiempoDisponible) {
		this.setNombre(nombre);
		this.setPreferencia(preferencia);
		this.setPresupuesto(presupuesto);
		this.setTiempoDisponible(tiempoDisponible);
	}

	// Getters y Setters
	public Double getTiempoDisponible() {
		return tiempoDisponible;
	}

	public void setTiempoDisponible(Double tiempoDisponible) {
		this.tiempoDisponible = tiempoDisponible;
	}

	public Integer getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(Integer presupuesto) {
		this.presupuesto = presupuesto;
	}

	public ETiposActividades getPreferencia() {
		return preferencia;
	}

	public void setPreferencia(ETiposActividades preferencia) {
		this.preferencia = preferencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}