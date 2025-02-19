package Abstracta_Interfaz;

//Hereda de la clase abstracta
public class Profesor extends Abstracta {
	//Atributo
	private String asignatura;

	//Constructor
	public Profesor(String nombre, String apellido, String asignatura) {
		super(nombre, apellido);
		this.asignatura = asignatura;
	}
	
	//Metodo heredado de la clase abstracta
	@Override
	public void actividad() {
		System.out.println(nombre + " " + apellido + " esta enseñando " + asignatura);
	}
}
