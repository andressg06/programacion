package Tarea_2;

import java.util.Scanner;

public class Ejercicio_3 {
	
	static double convertirACelsius (double grado) {
		double resultado = (grado * 9 / 5) + 32;
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un valor en grados Celsius");
		double grado = leer.nextDouble();
		
		System.out.println("En Fahrenheit seria: " +convertirACelsius(grado));
		
		leer.close();

	}

}
