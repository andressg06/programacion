package Ejercicio_10;

public class Almacen {
	
	//Atributos
	private double chocos;
	private double papas;
	private int clientes;
	
	//Constructor
	public Almacen(double chocos, double papas) {
		this.chocos = chocos;
		this.papas = papas;
	}
	
	public int CalcularClientes() {
		double papas1 = papas;
		double chocos1= chocos;
		for(;papas1 > 1 || chocos1 > 1;) {
			chocos1 = chocos1 - 0.5;
			papas1 = papas1 - 1;
			clientes = clientes + 3;
		}
		System.out.println("Clientes: " + clientes);
		return clientes;
	}
	
	public void addChocos(int añadirChocos) {
		chocos = chocos + añadirChocos;
	}
	
	public void addPapas(int añadirPapas) {
		papas = papas + añadirPapas;
	}
	
	public int getComensales() {
		return clientes;
	}
	
	public void showChocos() {
		System.out.println("Chocos: " + chocos);
	}
	
	public void showPapas() {
		System.out.println("Papas: " + papas);
	}
	
	
}
