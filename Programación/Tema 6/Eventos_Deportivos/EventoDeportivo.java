package Eventos_Deportivos;

import java.time.LocalDate;
import java.util.*;

abstract class EventoDeportivo implements Ganador{
	//Atributos
	String nombre;
	LocalDate fecha;
	String lugar;
	ArrayList<Participante> participantes;
	
	//Constructor
	public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.participantes = new ArrayList<>();
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getLugar() {
		return lugar;
	}
	
	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public void inscribirParticipante(Participante participante) {
		participantes.add(participante);
	}
	
	public abstract Participante obtenerGanador();
}
