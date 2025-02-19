package Ejercicio_6;

import java.util.Scanner;

public class Empleado extends Persona {
	private double sueldo;
	
	public void CargarSueldo() {
		Scanner leer = new Scanner(System.in);
		System.out.println("Cual es el sueldo: " + sueldo);
		sueldo = leer.nextDouble();
	}
	
	public void ImprimirSueldo() {
		System.out.println("Sueldo: " + sueldo);
	}
	
	
}
