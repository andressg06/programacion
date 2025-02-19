package Cuenta;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	
	public Cliente(String nombre, String apellido, String direccion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
	}
	
	public Cliente() {
		
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nuevonombre) {
		nombre = nuevonombre;
	}
	
	public String getapellido() {
		return apellido;
	}
	
	public void setapellido(String nuevoapellido) {
		apellido = nuevoapellido;
	}
	
	public String getdireccion() {
		return direccion;
	}
	
	public void setdireccion(String nuevadireccion) {
		direccion = nuevadireccion;
	}
	
	public String mostrarnombreCompleto() {
		return nombre + " " + apellido;
	}
	
	public String mostrardireccion() {
		return direccion;
	}
	
}
