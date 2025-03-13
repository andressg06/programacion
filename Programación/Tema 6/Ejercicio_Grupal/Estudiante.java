package Ejercicio_Grupal;
	
	/**
	 * Estudiantes de la universidad
	 * 
	 */
public class Estudiante extends Persona {
	/**
	 * Identificación del estudiante
	 */
	private int id_estudiante;

	/**
	 * Constructor predeterminado
	 */
	public Estudiante(String nombre, String apellidos, String nIF, Direccion direccion) {
		super(nombre, apellidos, nIF, direccion);
	}

	
	/**
	 * Constructor parametrizado
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param nIF
	 * @param direccion
	 * @param id_estudiante
	 */
	public Estudiante(String nombre, String apellidos, String nIF, Direccion direccion, int id_estudiante) {
		super(nombre, apellidos, nIF, direccion);
		this.id_estudiante = id_estudiante;
	}


	/**
	 * @return the id_estudiante
	 */
	public int getId_estudiante() {
		return id_estudiante;
	}


	/**
	 * @param id_estudiante the id_estudiante to set
	 */
	public void setId_estudiante(int id_estudiante) {
		this.id_estudiante = id_estudiante;
	}
	
	@Override
	public String toString() {
		return "Estudiante [id_estudiante=" + id_estudiante + "]";
	}
	
	public void identificate() {
		System.out.println("Soy un Estudiante");
	}
	
	
	
}
