 package Implementacion_UML;

import java.util.ArrayList;

public class Estandar extends Coche {
	//Atributos
	private Integer puertas;

	//Constructor
	public Estandar(String marca, Integer numero, float precio_coste, float precio_venta, Carroceria carro, Motor motor,
			ArrayList<Ruedas> rueda, Integer puertas) {
		super(marca, numero, precio_coste, precio_venta, carro, motor, rueda);
		this.puertas = puertas;
	}
	public Estandar(String marca, Integer numero, float precio_coste, float precio_venta, Integer puertas) {
		super(marca, numero, precio_coste, precio_venta);
		this.puertas = puertas;
	}



	//Getters
	public int getPuertas() {
		return puertas;
	}
	
	//Setters
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
}
