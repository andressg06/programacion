package Ejercicios;

import java.util.Date;
import java.util.LinkedList;

public class Cuenta {
	
	//Atributos
	private long numero;
	private Cliente titular;
	private float saldo;
	private float interesAnual;
	private LinkedList movimientos;
	
	static private class Movimiento {
		Date fecha;
		char tipo;
		float importe;
		float saldoMov;
		
		public Movimiento (Date fecha, char tipo, float importe, float saldo) {
			this.fecha = fecha;
			this.importe = importe;
			saldoMov = saldo;
			this.tipo = tipo;
		}
	}
	
	//Constructor
	public Cuenta(long numero, Cliente titular, float interesAnual) {
		this.numero = numero;
		this.titular = titular;
		this.interesAnual = interesAnual;
		saldo = 0;
		movimientos = new LinkedList();
	}
	
	public void ingreso(float cantidad) {
		movimientos.add(new Movimiento (new Date(), 'I', cantidad, saldo += cantidad));
	}
	
	public void reintegro(float cantidad ) {
		movimientos.add(new Movimiento (new Date(), 'R', cantidad, saldo -= cantidad));
	}
	
	public void ingreso_Intereses() {
		ingreso (interesAnual * saldo / 1200);
	}
	
	Cliente leerTitular() {return titular;}

}
