package Implementacion_UML;

import java.util.ArrayList;

abstract class Coche {
	//Atributos
	private String marca;
	private Integer numero;
	private float precio_coste;
	private float precio_venta;
	private Carroceria carro;
	private Motor motor;
	private ArrayList<Ruedas> rueda = new ArrayList<>();
	private ArrayList<Reparacion> reparacion = new ArrayList<>();
	
	
	//Constructor
	public Coche(String marca, Integer numero, float precio_coste, float precio_venta) {
		this.marca = marca;
		this.numero = numero;
		this.precio_coste = precio_coste;
		this.precio_venta = precio_venta;
	}
	
	public Coche(String marca, Integer numero, float precio_coste, float precio_venta, Carroceria carro, Motor motor,ArrayList<Ruedas> rueda) {
		super();
		this.marca = marca;
		this.numero = numero;
		this.precio_coste = precio_coste;
		this.precio_venta = precio_venta;
		this.carro = carro;
		this.motor = motor;
		this.rueda = rueda;
		this.reparacion = reparacion;
	}


	//Getters
	public String getMarca() {
		return marca;
	}

	public Integer getNumero() {
		return numero;
	}
	
	public float getPrecio_coste() {
		return precio_coste;
	}
	
	public float getPrecio_venta() {
		return precio_venta;
	}
	
	public ArrayList<Reparacion> getReparaciones() {
		return reparacion;
	}
	
	
	//Setters
	public void setMarca(String nuevaMarca) {
		marca = nuevaMarca;
	}
	
	public void setNumero(Integer nuevaNumero) {
		numero = nuevaNumero;
	}
	
	public void setPrecio_coste(float nuevoPrecio_coste) {
		precio_coste = nuevoPrecio_coste;
	}
	
	public void setPrecio_venta(float nuevoPrecio_venta) {
		precio_venta = nuevoPrecio_venta;
	}
	
	public Coche setCarroceria(Carroceria carro) {
		this.carro = carro;
		return this;
	}
	
	public Coche setMotor(Motor motor) {
		this.motor = motor;
		return this;
	}
	
	//Metodos para agregar al ArrayList
	
	public Coche addRuedas(Ruedas rueda) {
		if (this.rueda.size() < 5) {
			this.rueda.add(rueda);
		}
		return this;
	}
	
	public void agregarRueda(Ruedas rueda) {
		this.rueda.add(rueda);
	}
	
	public Coche addReparaciones(Reparacion reparacion) {
		this.reparacion.add(reparacion);
		return this;
	}
	
	public void agregarReparacion(Reparacion reparacion) {
		this.reparacion.add(reparacion);
	}
	
	@Override
	public String toString() {
		return "Coche{" +
				"marca='" + marca + '\n' +
				"numero=" + numero + '\n' +
				"precioCoste=" + precio_coste + '\n' +
				"precioVenta=" + precio_venta + '\n' +
				"carroceria=" + carro + '\n' +
				"motor=" + motor + '\n' +
				"ruedas=" + rueda.size() + '\n' +
				"reparaciones=" + reparacion.size() +
				'}';
	}
	
}
	
	class Carroceria {
		//Atributos
		private String color;
		private String condicion;
	
		//Constructor
		public Carroceria(String color, String condicion) {
			super();
			this.color = color;
			this.condicion = condicion;
		}
	
		//Getters
		public String getColor() {
			return color;
		}
		public String getCondicion() {
			return condicion;
		}
	
		//Setters
		public void setColor(String color) {
			this.color = color;
		}
		public void setCondicion(String condicion) {
			this.condicion = condicion;
		}
		
		
		//Mostrar
		@Override
		public String toString() {
			return "Carroceria{color=" + color + ", condicion=" + condicion + "}";
		}
	}


	class Motor {
		//Atributo
		private String num_Bastidor;
	
		//Constructor
		public Motor(String num_Bastidor) {
			this.num_Bastidor = num_Bastidor;
		}
	
		//Getters
		public String getNum_Bastidor() {
			return num_Bastidor;
		}
	
		//Setters
		public void setNum_Bastidor(String num_Bastidor) {
			this.num_Bastidor = num_Bastidor;
		}
		
		@Override
		public String toString() {
			return "Motor{numeroBastidor=" + num_Bastidor + "}";
		}
		
	}
	
	class Ruedas {
		//Atributos
		private float tamaño;
		private String condicion;
		
		//Constructor
		public Ruedas(float tamaño, String condicion) {
			this.tamaño = tamaño;
			this.condicion = condicion;
		}
		
		//Getters
		public float getTamaño() {
			return tamaño;
		}

		public String getCondicion() {
			return condicion;
		}
		
		//Setters
		public void setTamaño(float tamaño) {
			this.tamaño = tamaño;
		}

		public void setCondición(String condicion) {
			this.condicion = condicion;
		}
		
		@Override
		public String toString() {
			return "Rueda{tamaño=" + tamaño + ",condicion=" + condicion + "}";
		}
		
	}