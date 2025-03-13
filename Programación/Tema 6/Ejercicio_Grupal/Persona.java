package Ejercicio_Grupal;

/**
 * Clase Persona
 * 
 */
public class Persona implements Humano {
	/** Nombre de la persona */
	private String nombre;
	/** Apellidos de la persona */
	private String apellidos;
	/** DNI de la persona */
	private String NIF;
	/** Direccion de la persona definido en otra clase */
	private Direccion direccion;
	
	
	/**
	 * @param nombre
	 * @param apellidos
	 * @param nIF
	 * @param direccion
	 */
	public Persona(String nombre, String apellidos, String nIF, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		NIF = nIF;
		this.direccion = direccion;
	}
	
	
	//Getters
	/**
	 * @return el nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * @return the nIF
	 */
	public String getNIF() {
		return NIF;
	}
	
	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}
	
	//Setters
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	/**
	 * @param nIF the nIF to set
	 */
	public void setNIF(String nIF) {
		NIF = nIF;
	}
	
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Metodo para identificar que persona es
	 * 
	 */
	public void identificate() {
		System.out.println("Soy una Persona");
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", NIF=" + NIF + ", direccion=" + direccion
				+ "]";
	}
		
}
