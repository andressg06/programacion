package Abstracta_Interfaz;

abstract class Abstracta {
	//Atributos de instancia
	protected String nombre;
	protected String apellido;
	
	
	//Constructor
	public Abstracta(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Metodo con implementacion
	public void presentarse() {
		System.out.println("Soy " + nombre);
	}
	
	//Metodo abstracto
	abstract void actividad();
	
}
