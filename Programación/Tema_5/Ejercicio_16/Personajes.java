package Ejercicio_16;

public class Personajes {
	public String nombre;
	public int energia;
	
	public Personajes(String nombre, int energia) {
		this.nombre = nombre;
		this.energia = energia;
	}

	public void alimentarse(int cantidad) {
		energia += cantidad;
	}

}
