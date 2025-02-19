package Ejercicio_15;

public class Cuenta {
	
	//Atributo
	private String nombre;
	private int num_cuenta;
	private float saldo;
	
	
	//Constructores
	public Cuenta(String nombre, int num_cuenta, float saldo) {
		this.nombre = nombre;
		this.num_cuenta = num_cuenta;
		this.saldo = saldo;
	}

	public Cuenta(String nombre, int num_cuenta) {
		this.nombre = nombre;
		this.num_cuenta = num_cuenta;
		saldo = 0;
	}
	
	
	//Metodo
	public void ingresar(float c) {
		saldo = saldo + c;
	}
	
	public void extraer(float c) {
		saldo = saldo - c;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	
	
	
	
	

}
