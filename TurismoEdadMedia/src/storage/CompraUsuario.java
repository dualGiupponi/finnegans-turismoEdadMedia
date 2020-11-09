package storage;

import java.util.ArrayList;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Usuario;
import TurismoPrincipal.Promociones.Promocion;

public class CompraUsuario {
	//Listados generales
	ListadoPromociones listadoPromocion;
	ListadoAtracciones listadoAtraccion;
	
	//Almaceno lo comprado por el usuario
	ArrayList<Promocion> compraPromociones = new ArrayList<Promocion>();
	ArrayList<Atraccion> compraAtracciones = new ArrayList<Atraccion>();
	
	//Usuario
	Usuario usuario;
	
	public CompraUsuario(Usuario usuario, ListadoPromociones listaPromociones, ListadoAtracciones listaAtracciones) {
		this.usuario = usuario;
		this.listadoAtraccion = listaAtracciones;
		this.listadoPromocion = listaPromociones;
	}
	
	public ArrayList<Promocion> promocionesParaUsuario(){
		ArrayList<Promocion> promocionesPersonalizadas = this.listadoPromocion.getListaOrdenada(usuario.getPreferencia());
		ArrayList<Promocion> promocionesFiltradas = new ArrayList<Promocion>();
		
		for(Promocion promocion: promocionesPersonalizadas) {
			if(promocion.costo() <= this.usuario.getPresupuesto() && promocion.tiempo() <= usuario.getTiempoDisponible())
				promocionesFiltradas.add(promocion);
		}
		
		return promocionesFiltradas;
	}
	
	public ArrayList<Atraccion> atraccionesParaUsuario(){
		ArrayList<Atraccion> atraccionesPersonalizadas = listadoAtraccion.getListaOrdenada(usuario.getPreferencia());
		ArrayList<Atraccion> atraccionesFiltradas = new ArrayList<Atraccion>();
		
		for(Atraccion atraccion: atraccionesPersonalizadas) {
			if(atraccion.costo() <= this.usuario.getPresupuesto() && atraccion.tiempo() <= this.usuario.getTiempoDisponible())
				atraccionesFiltradas.add(atraccion);
		}
		
		return atraccionesFiltradas;
	}
	
	public void confirmarCompraPromocion(Promocion promocion) {
		//Hago la traccion al usuario.
		Double tiempoPostCompra = this.usuario.getTiempoDisponible();
		Integer presupuestoPostCompra = this.usuario.getPresupuesto();
		
		tiempoPostCompra -= promocion.tiempo();
		presupuestoPostCompra -= promocion.costo();
		
		this.usuario.setPresupuesto(presupuestoPostCompra);
		this.usuario.setTiempoDisponible(tiempoPostCompra);
		
		//Agrego el visitante a la atraccion y quito la promo de la lista
		this.compraPromociones.add(promocion);
		for(Atraccion atraccion: promocion.getAtraccionesIncluidas()) {
			atraccion.agregarVisitante();
		}
		this.listadoPromocion.eliminarPromocion(promocion);
	}
	
	public void confirmarCompraAtraccion(Atraccion atraccion) {
		//Hago la traccion al usuario.
		Double tiempoPostCompra = this.usuario.getTiempoDisponible();
		Integer presupuestoPostCompra = this.usuario.getPresupuesto();
				
		tiempoPostCompra -= atraccion.tiempo();
		presupuestoPostCompra -= atraccion.costo();
				
		this.usuario.setPresupuesto(presupuestoPostCompra);
		this.usuario.setTiempoDisponible(tiempoPostCompra);
				
		//Agrego el visitante a la atraccion y quito la promo de la lista
		this.compraAtracciones.add(atraccion);
		atraccion.agregarVisitante();
		this.listadoAtraccion.eliminarAtraccion(atraccion);
	}
	
	public String resumenCompra() {
		String resumen = "";
		
		Integer costoTotal = 0;
		Double tiempoTotal = 0.0;
		
		//Encabezado del resumen
		resumen += "Usuario: "+this.usuario.getNombre() + "\n\n";
		
		//Listado de promociones:
		resumen += "Promociones compradas: \n";
		for(Promocion promocion: this.compraPromociones) {
			costoTotal += promocion.costo();
			tiempoTotal += promocion.tiempo();
			
			resumen += " - "+promocion.getNombre()+". Costo: "+promocion.costo() + " Monedas. Tiempo de Visita: " + promocion.tiempo() +" horas.\n";
		}
		
		//Listado de atracciones
		resumen += "Atracciones compradas: \n";
		for(Atraccion atraccion: this.compraAtracciones) {
			costoTotal += atraccion.costo();
			tiempoTotal += atraccion.tiempo();
			
			resumen += " - "+atraccion.getNombre()+". Costo: "+atraccion.costo() + " monedas. Tiempo de Visita: " + atraccion.tiempo() +" horas\n";
		}
		
		resumen += "Costo total de lo comprado: " + costoTotal + " monedas.\n";
		resumen += "Tiempo aproximado de recorrido: " + tiempoTotal.toString() + " horas.";
		
		return resumen;
	};
}
