# Turismo en la Edad Media

Proyecto desarrollado en Java para Finnegans en el curso de "Soy Programador"

Objetivos de nuestro programa:
- Sugerir visitas a partir de la ubicación de los visitantes.
- Generar itinerarios a partir de la información de preferencia (de cada uno)

Especificadas solicitadas:
	- Cada atracción cuenta con su costo de visita, promedio de tiempo,
	cupo de visitantes y tipo de atracción(paisaje, aventura, degustación).
	- Cada usuario tiene un presupuesto, tiempo disponible
	y atracción preferida
	- Promociones:
		- Promociones porcentuales (X% de descuento en el costo total).
		- Promociones absolutas ($X por todo el paquete).
		- Promociones AxB (si el usuario compra A,B,C => D gratis).

Perfiles de usuario:
	- Un gusto o preferencia. [Cadena]
	- Presupuesto (medido en monedas) [Entero]
	- Tiempo disponible (Cuestionable) [Doble]

Requerimientos solicitados de implementación:
	- La carga del sistema se hace mediante archivos:
		- Formato específico [JSON, XML, Definido propio]
		- Usuarios, Paquetes, Atracciones.
	- El sistema tiene que dar:
		- Sugerir atracciones que coincida con:
			- Preferencias.
			- Costos.
			- Tiempos.
		- Prioridad de sugerencia:
			- Paquetes.
				- Atracciones:
					- Mayor costo.
					- Mayor Tiempo.
			- Atracción.
				- Mayor Costo.
				- Mayor Tiempo.
			- Paquetes y atracciones excluidos :
				- Mismo criterio de ordenación que el expuesto
				anteriormente.
				- Se muestra cuando se agotan las de su interés.
			- Motivos de exclusión:
				- Paquetes y atracciones ya elegidas.
				- Paquetes y atracciones que no pueden elegirse
				(por costo o por tiempo).
				- Por interés del usuario [Única que se contempla
				Paquetes Excluidos]
		- Si el usuario acepta, se guarda dentro de su sugerencia diaria.
			- Una vez aceptado el paquete, no podrá cancelarse.
		- El proceso corta (para el usuario) cuando no tiene disponible más:
			- Monedas.
			- Tiempo Disponible.
			- Cupo.
		- Cuando termina, se muestra resumen de itinerario.
		- Todo lo expuesto se repite en el próximo usuario.
			- Tener en cuenta cupos para promociones y atracciones.
		- Finalizado el proceso, devolver un archivo de salida:
			- Datos del usuario:
				- Compra.
				- Totales a Pagar.
				- Tiempo a invertir.