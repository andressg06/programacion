package Eventos_Deportivos;

import java.util.ArrayList;

public class Equipo {
	String nombre;
	ArrayList<Participante> jugadores;
	int puntos;
	
	public Equipo(String nombre) {
		this.nombre = nombre;
		this.jugadores = new ArrayList<>();
		this.puntos = 0;
	}
	
	public void añadirJugador(Participante jugador) {
		jugadores.add(jugador);
	}
	
	public void eliminarJugador(String nombre, String apellido) throws JugadorNoEncontradoException {
	for (Participante jugador : jugadores) {
		if (jugador.getNombre().equals(nombre) && jugador.getApellido().equals(apellido)) {
			jugadores.remove(jugador);
			return;
		}
	}
	throw new JugadorNoEncontradoException("Jugador no encontrado en el equipo");
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public String toString() {
		return "Equipo: " + nombre + " - Puntos: " + puntos;
	}
}
