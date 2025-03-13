package Ejercicio_Grupal;
/**
 * Profesores de la Uiversidad
 * 
 */
public class Profesor extends Persona {
	/** Despacho del profesor */
	private String despacho;

	/**
	 * @param nombre
	 * @param apellidos
	 * @param nIF
	 * @param direccion
	 */
	public Profesor(String nombre, String apellidos, String nIF, Direccion direccion) {
		super(nombre, apellidos, nIF, direccion);
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param nIF
	 * @param direccion
	 * @param despacho
	 */
	public Profesor(String nombre, String apellidos, String nIF, Direccion direccion, String despacho) {
		super(nombre, apellidos, nIF, direccion);
		this.despacho = despacho;
	}

	/**
	 * @return the despacho
	 */
	public String getDespacho() {
		return despacho;
	}

	/**
	 * @param despacho the despacho to set
	 */
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	@Override
	public String toString() {
		return "Profesor [despacho=" + despacho + "]";
	}
	
	public void identificate() {
		System.out.println("Soy un Profesor");
	}
	
}
