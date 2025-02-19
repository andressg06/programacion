package Ejercicio_Grupal;

abstract class Vehiculo {
	protected String matricula;
	
	
	
	public Vehiculo(String matricula) {
		this.matricula = matricula;
	}

	public abstract void mostrarDetalles();

}
