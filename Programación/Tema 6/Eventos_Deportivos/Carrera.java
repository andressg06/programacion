package Eventos_Deportivos;

import java.time.LocalDate;
import java.util.Date;

public class Carrera extends EventoDeportivo{
	double distancia;

	public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
		super(nombre, fecha, lugar);
		this.distancia = distancia;
	}
	
	@Override
	public Participante obtenerGanador() {
		return participantes.isEmpty() ? null : participantes.get(0);
	}
	
}
