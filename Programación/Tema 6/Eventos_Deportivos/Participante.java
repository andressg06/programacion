package Eventos_Deportivos;

public class Participante {
	//Atributo
	String nombre;
	String apellido;
	int edad;
	
	//Constructor
	public Participante(String nombre, String apellido, int edad) throws ParticipanteNoValidoException {
		if (nombre == null || apellido == null || edad < 14) {
			throw new ParticipanteNoValidoException("Datos del participante no válidos");	
		}
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	//Getters
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String toString() {
		return "Jugador: " + nombre + " " + apellido + " , " + edad + " años";
	}
	
	
	
	
}
