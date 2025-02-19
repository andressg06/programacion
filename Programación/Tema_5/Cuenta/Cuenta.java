package Cuenta;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class Cuenta {
	private long num_cuenta;
	private double saldo;
	private double interesAnual;
	private Cliente cliente;
	private LinkedList<Movimiento> movimientos = new LinkedList<Cuenta.Movimiento>();
	
	public Cuenta() {}
	
	public Cuenta(long num_cuenta, double saldo, double interesAnual, Cliente cliente) {
			this.num_cuenta = num_cuenta;
			this.saldo = saldo;
			this.interesAnual = interesAnual;
			this.cliente = cliente;
	}
	
	public long getnum_cuenta() {
		return num_cuenta;
	}
	
	public void setnum_cuenta(long nuevonum_cuenta) {
		num_cuenta = nuevonum_cuenta;
	}
	
	public double getsaldo() {
		return saldo;
	}
	
	public void setsaldo(double nuevosaldo) {
		saldo = nuevosaldo;
	}
	
	public double getinteresAnual() {
		return interesAnual;
	}
	
	public void setinteresAnual(double nuevointeresAnual) {
		interesAnual = nuevointeresAnual;
	}
	
	public LinkedList<Movimiento> getMovimientos() {
		return movimientos;
	}
	
	public void ingreso(int cantidad) {
		saldo += cantidad;
		Date fecha = new Date(2025, 01, 27);
		Movimiento mov = new Movimiento(fecha, '+', cantidad, saldo);
		movimientos.add(mov);
	}
	
	public void reintegro(int cantidad) {
		saldo -= cantidad;
		Date fecha = new Date(2025, 01, 27);
		Movimiento mov = new Movimiento(fecha, '-', cantidad, saldo);
		movimientos.add(mov);
	}
	
	public Cliente getTitular() {
		return cliente;
	}
	
	public boolean enRojos() {
		if (saldo < 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void mostrarCuenta() {
		System.out.println("Numero de cuenta: " + num_cuenta);
		System.out.println("Nombre: " + cliente.mostrarnombreCompleto());
		System.out.println("Saldo: " + saldo + " euros");
		System.out.println("Interes Anual: " + interesAnual);
	}
	
	public class Movimiento {
		private Date fecha;
		private char tipo;
		private double importe;
		private double saldo;
	
		public Movimiento(Date fecha, char tipo, double importe, double saldo) {
			this.fecha = fecha;
			this.tipo = tipo;
			this.importe = importe;
			this.saldo = saldo;
		}
		
		public Date getfecha() {
			return fecha;
		}
		
		public void setfecha(Date nuevafecha) {
			fecha = nuevafecha;
		}
		
		public char gettipo() {
			return tipo;
		}
		
		public void settipo(char nuevotipo) {
			tipo = nuevotipo;
		}
		
		public double getimporte() {
			return importe;
		}
		
		public void setimporte(double nuevoimporte) {
			importe = nuevoimporte;
		}
		
		public double getsaldo() {
			return saldo;
		}
		
		public void setsaldo(double nuevosaldo) {
			saldo = nuevosaldo;
		}
		
		public void mostrarMovimiento() {
			System.out.println("Importe: " + tipo + getimporte());
			System.out.println("Saldo: " + saldo);
		}
	
	}
	
}
