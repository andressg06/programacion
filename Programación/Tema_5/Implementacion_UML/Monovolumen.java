package Implementacion_UML;

import java.util.ArrayList;

public class Monovolumen extends Coche {
	//Atributo
	private int plazas;
	
	//Constructor
	public Monovolumen(String marca, Integer numero, float precio_coste, float precio_venta, Carroceria carro,
			Motor motor, ArrayList<Ruedas> rueda, int plazas) {
		super(marca, numero, precio_coste, precio_venta, carro, motor, rueda);
		this.plazas = plazas;
	}
	
	//Getters
	public int getPlazas() {
		return plazas;
	}
	
	//Setters
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
}
