package Ejercicio_3;

public class Cuenta {
	
	//atributos
	private static long num_base = 100001;
	private long num_cuenta;
	private long dni;
	private double saldoActual;
	private double interesAnual;
	
	//contructor
	public Cuenta() {
		this.num_cuenta = num_base++;
	}

	public Cuenta(long dni, double saldoActual, double interesAnual) {
		this.num_cuenta = num_base++;
		this.dni = dni;
		this.saldoActual = saldoActual;
		this.interesAnual = interesAnual;
	}
	
	//Getters
	public void getdni() {
		System.out.println(dni);
	}
	
	public void getsaldoActual() {
		System.out.println(saldoActual);
	}
	
	public void getinteresAnual() {
		System.out.println(interesAnual);
	}
	
	//Setters
	public void setnum_cuenta(long nuevonum_cuenta) {
		num_cuenta = nuevonum_cuenta;
	}
	
	public void setdni(long nuevodni) {
		dni = nuevodni;
	}
	
	public void setsaldoAcual(double nuevosaldoActual) {
		saldoActual = nuevosaldoActual;
	}
	
	public void setinteresAnual(double nuevointeresAnual) {
		interesAnual = nuevointeresAnual;
	}
	
	public void actualizarSaldo() {
		double interesdiario = interesAnual / 365;
		saldoActual += interesdiario;
	}
	
	public void ingresar(double cantidad) {
		saldoActual = saldoActual + cantidad;
	}
	
	public void retirar(double cantidad) {
		if (saldoActual > 0) 
			saldoActual = saldoActual - cantidad;
			else
			System.out.println("No hay saldo en la cuenta");
	}
	
	public void mostrarCuenta() {
		System.out.println("Número de cuenta:" + num_cuenta);
		System.out.println("DNI:" + dni);
		System.out.println("Saldo Actual: " + saldoActual);
		System.out.println("Interes Anual:" + interesAnual);
	}
	
	

}
