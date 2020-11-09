package main;

import java.util.ArrayList;

import TurismoPrincipal.Atraccion;
import TurismoPrincipal.Enums.ETiposActividades;
import TurismoPrincipal.Promociones.PromocionAbsoluta;
import TurismoPrincipal.Promociones.PromocionAxB;
import TurismoPrincipal.Promociones.PromocionPorcentual;
import storage.ListadoAtracciones;
import storage.ListadoPromociones;

public class App {
	public static void main(String[] args) {
		// Creacion de atracciones.

		Atraccion Moria = new Atraccion("Moria", 10, 2.0, 6, ETiposActividades.Aventura);
		Atraccion MinasTirith = new Atraccion("Minas Tirith", 5, 2.5, 25, ETiposActividades.Paisaje);
		Atraccion LaComarca = new Atraccion("La Comarca", 3, 6.5, 150, ETiposActividades.Degustacion);
		Atraccion Mordor = new Atraccion("Mordor", 25, 3.0, 4, ETiposActividades.Aventura);
		Atraccion AbismoDeHelm = new Atraccion("Abismo de Helm", 5, 2.0, 15, ETiposActividades.Paisaje);
		Atraccion Lothlorien = new Atraccion("Lothlórien", 35, 1.0, 30, ETiposActividades.Degustacion);
		Atraccion Erebor = new Atraccion("Erebor", 12, 3.0, 32, ETiposActividades.Paisaje);
		Atraccion BosqueNegro = new Atraccion("Bosque Negro", 3, 4.0, 12, ETiposActividades.Aventura);

		// Creacion de listado de Aventuras
		ListadoAtracciones listaAtracciones = new ListadoAtracciones();

		// Carga de las atracciones
		listaAtracciones.agregarAtraccion(Moria);
		listaAtracciones.agregarAtraccion(MinasTirith);
		listaAtracciones.agregarAtraccion(LaComarca);
		listaAtracciones.agregarAtraccion(Mordor);
		listaAtracciones.agregarAtraccion(AbismoDeHelm);
		listaAtracciones.agregarAtraccion(Lothlorien);
		listaAtracciones.agregarAtraccion(Erebor);
		listaAtracciones.agregarAtraccion(BosqueNegro);

		// Prueba de los algoritmos - Lista de Atracciones
		ArrayList<Atraccion> listaPrueba = listaAtracciones.getLista(ETiposActividades.Aventura);

		listaPrueba = listaAtracciones.getListaOrdenada();

		listaPrueba = listaAtracciones.getListaOrdenada(ETiposActividades.Aventura);
		
		//Prueba de los algoritmos - Lista de Promociones.
		
		PromocionPorcentual packAventura = new PromocionPorcentual("Pack Aventura", ETiposActividades.Aventura, 20);
		packAventura.agregarAtraccion(BosqueNegro);
		packAventura.agregarAtraccion(Mordor);
		
		System.out.println("Costo pack aventura: " + packAventura.costo());
		
		PromocionAbsoluta packDegustacion = new PromocionAbsoluta("Pack Degustación", ETiposActividades.Degustacion, 36);
		packDegustacion.agregarAtraccion(Lothlorien);
		packDegustacion.agregarAtraccion(LaComarca);
		
		System.out.println("Costo pack degustación: " + packDegustacion.costo());
		
		PromocionAxB packPaisajes = new PromocionAxB("Pack Paisajes", ETiposActividades.Paisaje, Erebor);
		packPaisajes.agregarAtraccion(MinasTirith);
		packPaisajes.agregarAtraccion(AbismoDeHelm);
		packPaisajes.agregarAtraccion(Erebor);
		
		System.out.println("Costo pack paisajes: " + packPaisajes.costo());
		
		ListadoPromociones listaPromociones = new ListadoPromociones();
		listaPromociones.agregarPromocion(packAventura);
		listaPromociones.agregarPromocion(packDegustacion);
		listaPromociones.agregarPromocion(packPaisajes);
		
		listaPromociones.getListaOrdenada();
		
		System.out.println("Fin");
	}
}
