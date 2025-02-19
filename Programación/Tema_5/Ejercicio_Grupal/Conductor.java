package Ejercicio_Grupal;

public class Conductor {
	private String nombre;

	public Conductor(String nombre) {
		this.nombre = nombre;
	}
	
	public void conducir(Coche coche) {
		System.out.println("El conductor " + nombre + " conduce el coche con matricula " + coche.matricula);
	}
}
