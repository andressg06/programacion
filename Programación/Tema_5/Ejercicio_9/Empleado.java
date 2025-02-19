package Ejercicio_9;

public class Empleado {
	
	//Atributos
	private String nombre;
	private int salario;
	private Direccion direccion;
	
	//Constructor
	public Empleado(String nombre, int salario, Direccion direccion) {
		this.nombre = nombre;
		this.salario = salario;
		this.direccion = direccion;
	}
	
	//Getters
	public String getNombre() {
		System.out.println("Nombre: " + nombre);
		return nombre;
	}
	
	public int getSalario() {
		System.out.println("Salario: " + salario);
		return salario;
	}
	
	public Direccion getDireccion() {
		System.out.println("Dirección: ");
		direccion.getCalle();
		direccion.getNumero();
		direccion.getPiso();
		direccion.getCiudad();
		return direccion;
	}
	
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public void setSalario(int nuevoSalario) {
		salario = nuevoSalario;
	}
	
	public void setDireccion(Direccion nuevaDireccion) {
		direccion = nuevaDireccion;
	}
	
	public void mostrarDatos() {
		getNombre();
		getSalario();
		getDireccion();
	}
}
