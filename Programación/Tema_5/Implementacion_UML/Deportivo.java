package Implementacion_UML;

import java.util.ArrayList;

public class Deportivo extends Coche{
	
	//Constructor
	public Deportivo(String marca, Integer numero, float precio_coste, float precio_venta, Carroceria carro,
			Motor motor, ArrayList<Ruedas> rueda) {
		super(marca, numero, precio_coste, precio_venta, carro, motor, rueda);
	}
}
