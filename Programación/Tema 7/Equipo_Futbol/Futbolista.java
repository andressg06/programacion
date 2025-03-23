package Equipo_Futbol;

import java.util.ArrayList;
import java.util.List;

//Clase enumerada para posicion del futbolista
enum Posicion {
	Portero(2000,3000),Defensa(2500,3500), Centrocampista(3500, 4000), Delantero(4000, 5000);
	
	//Atributos
	int salarioMin;
	int salarioMax;
	
	//Constructor
	Posicion(int salarioMin, int salarioMax) {
		this.salarioMin = salarioMin;
		this.salarioMax = salarioMax;
	}
	
	//Get y Set
	public int getSalarioMin() {return salarioMin;}
	public int getSalarioMax() {return salarioMax;}
	
}

public class Futbolista implements Deportista {
	//Atributos
	String nombre;
	Integer edad;
	Posicion posicion;
	int anyosProfesional;
	List<String> equipos;
	int totalTrofeos;
	
	//Constructor
	public Futbolista(String nombre, Integer edad, Posicion posicion, int anyosProfesional, List<String> equipos,
			int totalTrofeos) {
		this.nombre = nombre;
		this.edad = edad;
		this.posicion = posicion;
		this.anyosProfesional = anyosProfesional;
		this.equipos = new ArrayList<>(equipos);
		this.totalTrofeos = totalTrofeos;
	}
	
	//Getters
	public String getNombre() {return nombre;}
	public Integer getEdad() {return edad;}
	public Posicion getPosicion() {return posicion;}

	//Setters
	public void setNombre(String nombre) {this.nombre = nombre;}
	public void setEdad(Integer edad) {this.edad = edad;}
	public void setPosicion(Posicion posicion) {this.posicion = posicion;}
	
	@Override
	public int getAnyosProfesional() { return anyosProfesional; }
	
	@Override 
	public List<String> getListadoEquipos() { return new ArrayList<>(equipos); }
	
	@Override
	public int getTotalTrofeos() { return totalTrofeos; }
	
	@Override
	public String toString() {
		return "Futbolista: " + nombre + " , Edad: " + edad + " , Posicion: " + posicion;
	}
	
}
