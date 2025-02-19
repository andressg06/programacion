package Ejercicios;

import java.util.Date;

public class Movimiento {
	
	//Atributos
	Date fecha;
	char tipo;
	float importe;
	float saldo;
	
	//Constructor
	public Movimiento(Date fecha, char tipo, float importe, float saldo) {
		this.fecha = fecha;
		this.tipo = tipo;
		this.importe = importe;
		this.saldo = saldo;
	}
	
	
}
