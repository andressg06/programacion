package Eventos_Deportivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class TorneoDeFutbol extends EventoDeportivo {
	ArrayList<Equipo> equipos;

	public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar) {
		super(nombre, fecha, lugar);
		this.equipos = new ArrayList<>();
	}
	
	public void inscribirEquipo(Equipo equipo) {
		equipos.add(equipo);
	}
	
	@Override
	public Participante obtenerGanador() {
		return participantes.isEmpty() ? null : participantes.get(0);
	}
	
}
