package Ejercicio_9;

public class Direccion {
	
	//Atributos
	private String calle;
	private int numero;
	private String piso;
	private String ciudad;
	
	//Constructor
	public Direccion(String calle, int numero, String piso, String ciudad) {
		this.calle = calle;
		this.numero = numero;
		this.piso = piso;
		this.ciudad = ciudad;
	}
	
	
	//Getters
	public String getCalle() {
		System.out.println("Calle: " + calle);
		return calle;
	}
	
	public int getNumero() {
		System.out.println("Número: " + numero);
		return numero;
	}
	
	public String getPiso() {
		System.out.println("Puerta: " + piso);
		return piso;
	}
	
	public String getCiudad() {
		System.out.println("Ciudad: " + ciudad);
		return ciudad;
	}
	
	
	//Setters
	public void setCalle(String nuevaCalle) {
		calle = nuevaCalle;
	}
	
	public void setNumero(int nuevoNumero) {
		numero = nuevoNumero;
	}
	
	public void setPiso(String nuevoPiso) {
		piso = nuevoPiso;
	}
	
	public void setCiudad(String nuevaCiudad) {
		ciudad = nuevaCiudad;
	}

}
