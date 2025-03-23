package Equipo_Futbol;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Equipo {
	String nombre;
	ArrayList<Futbolista> futbolistas;
	private Map<Posicion, Integer> max;
	
	public Equipo(String nombre) {
		super();
		this.nombre = nombre;
		this.futbolistas = new ArrayList<>();
		this.max = new HashMap<>();
		max.put(Posicion.Portero, 2);
		max.put(Posicion.Defensa, 5);
		max.put(Posicion.Centrocampista, 5);
		max.put(Posicion.Delantero, 4);
	}
	
	public void agregarFutbolista(Futbolista futbolista) throws RegistroFutbolistaException {
		long count = futbolistas.stream().filter(f -> f.getPosicion() == futbolista.getPosicion()).count();
		if (count >= max.get(futbolista.getPosicion())) {
			throw new RegistroFutbolistaException("No se puede agregar más jugadores en la posición de " + futbolista.getPosicion());
		}
		futbolistas.add(futbolista);
	}
	
	public void listarFormacionDelEquipo() {
		futbolistas.sort(Comparator.comparing(Futbolista::getPosicion));
		for (Futbolista f: futbolistas) {
			System.out.println(f);
		}
	}
	
	
	
}
