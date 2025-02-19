package Ejercicios;

public class Ejemplo3 {
	String nombre;
	Ejemplo3(String nombre) {
		this.nombre = nombre; }
	
	public static void cambiarNombre (Ejemplo3 persona) {
		persona.nombre = "Paco";
	}
}
