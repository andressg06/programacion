package Ejercicio_6;

import java.util.Scanner;

public class Persona {
	
	//Atributos
	private String nombre;
	private int edad;
	
	public void CargarDatos() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca un nombre");
		nombre = leer.next();
		System.out.println("Introduzca una edad");
		edad = leer.nextInt();
	}
	
	public void ImprimirDatos() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
	}
	
	
	
}
