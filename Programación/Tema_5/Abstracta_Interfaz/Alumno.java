package Abstracta_Interfaz;

//Hereda de la clase abstracta
public class Alumno extends Abstracta {
	//Atributo
	private String grado;

	//Constructor
	public Alumno(String nombre, String apellido, String grado) {
		super(nombre, apellido);
		this.grado = grado;
	}
	
	//Metodo heredado de la clase abstracta
	@Override
	public void actividad() {
		System.out.println(nombre + " " + apellido + " esta estudiando " + grado );
	}
}
