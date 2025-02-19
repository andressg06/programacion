package Ejercicio_4;

public class Cafetera {
	
	//Atributos
	private int capacidadMaxima;
	private int cantidadActual;
	
	//Constructores
	public Cafetera() {
		capacidadMaxima = 1000;
		cantidadActual = 0;
	}
	
	public Cafetera(int capacidadMaxima) {
		cantidadActual = capacidadMaxima;
		this.capacidadMaxima = capacidadMaxima;
	}
	
	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		if (cantidadActual > capacidadMaxima) {
			this.cantidadActual = capacidadMaxima;
		} else
			this.cantidadActual = cantidadActual;
	}
	
	//Getters
	public void getcapacidadMaxima() {
		System.out.println("La cantidad maxima de cafe es " + capacidadMaxima);
	}
	
	public void getcantidadActual() {
		System.out.println("La cantidad actual de cafe es " + cantidadActual);
	}
	
	//Setters
	public void setcapacidadMaxima(int nuevacapacidadMaxima) {
		capacidadMaxima = nuevacapacidadMaxima;
	}
	
	public void setcantidadActual(int nuevacantidadActual) {
		cantidadActual = nuevacantidadActual;
	}
	
	//Metodos
	public void llenarCafetera() {
		cantidadActual = capacidadMaxima;
	}
	
	public void vaciarCafetera() {
		cantidadActual = 0;
	}
	
	public void agregarCafe(int cantidad) {
		cantidadActual = cantidadActual + cantidad;
		if (cantidadActual > capacidadMaxima) {
			cantidadActual = capacidadMaxima;
		}
	}
	
	public void servirTaza(int cantidad) {
		if (cantidadActual >= cantidad) {
			cantidadActual = cantidadActual - cantidad;
			System.out.println("Se ha servido la taza con la cantidad indicada");
		} else {
			cantidad = 0;
			System.out.println("No hay suficiente cafe, se ha servido la cantidad que nos quedaba");
		}
		
	}
}
