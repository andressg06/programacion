package Tarea_2;

import java.util.Scanner;

public class Ejercicio_5 {
	
	static double calcularRaizSuma (int num1, int num2) {
		int suma = num1 + num2;
		double raiz = Math.sqrt(suma);
		return raiz;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num1 = leer.nextInt();
		
		System.out.println("Introduzca otro numero");
		int num2 = leer.nextInt();
		
		System.out.println("La raiz cuadrada de la suma de los numeros es: " + calcularRaizSuma(num1, num2));
		
		leer.close();

	}

}
