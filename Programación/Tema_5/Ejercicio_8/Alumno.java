package Ejercicio_8;

public class Alumno {
	
	//Atributos
	private String nombre;
	private int edad;
	private Asignatura asignatura;
	
	//Constructor
	public Alumno(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public String getNombre() {
		System.out.println("El nombre es " + nombre);
		return nombre;
	}
	
	public void setNombre(int nuevaEdad) {
		edad = nuevaEdad;
	}
	
	public int getEdad() {
		System.out.println("La edad es " + edad);
		return edad;
	}
	
	public void setEdad(int nuevaEdad) {
		edad = nuevaEdad;
	}
	
	public Asignatura getAsignatura() {
		return asignatura;
	}
	
	public void setAsignatura(Asignatura asignatura) {
		this.asignatura = asignatura;
	}
	
	public void mostrarDatos() {
		getNombre();
		getEdad();
		asignatura.ConsultarAsignatura();
		asignatura.getNota();
		asignatura.valoracion();
	}

}
