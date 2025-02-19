package Ejercicio_17;

public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	
	
	public Coche(String matricula, String marca, String modelo) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getmatricula() {
		return matricula;
	}
	
	public String getmarca() {
		return marca;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public void setmatricula(String nuevamatricula) {
		matricula = nuevamatricula;
	}
	
	public void setmarca(String nuevamarca) {
		marca = nuevamarca;
	}
	
	public void setmodelo(String nuevomodelo) {
		modelo = nuevomodelo;
	}
	
	public void mostrarDatos() {
		System.out.println("El coche con matricula " + matricula + " ,es de la marca " + marca + " y modelo" + modelo);
	}
	
}
