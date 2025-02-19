package Ejercicio_2;

public class Vehiculo {
	
	//atributos
	private String modelo;
	private double potencia = 0.0;
	private boolean cRuedas = false;
	private String SINO = "no";
	
	//contructor
	public Vehiculo(String modelo) {
		this.modelo = modelo;
	}
	
	//getters
	public void getpotencia() {
		System.out.println("La potencia del vehiculo es " + potencia);
	}
	
	public void getcRuedas() {
		System.out.println("El vehiculo " + SINO + " tiene tracción");
	}
	
	//setters
	public void setpotencia(double nuevapotencia) {
		if (nuevapotencia >= 0)
			potencia = nuevapotencia;
		else potencia = 0;
	}
	
	public void setcRueda(boolean nuevacRueda) {
		cRuedas = nuevacRueda;
		if (cRuedas == false) {
			SINO = "no"; 
		} else {
			if (cRuedas == true) {
				SINO = "si";
			}
		}
	}
	
	//mostrar
	public void imprimir() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Potencia: " + potencia);
		System.out.println("Tracción: " + SINO + " tiene tracción");
	}
	

}
