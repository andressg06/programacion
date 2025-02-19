package Tarea_1;

import java.util.Scanner;

public class Ejercicio_5 {
	
	static void par(int num1) {
		
		if (num1%2 == 0) {
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num1 = leer.nextInt();
		
		par(num1);
		
		leer.close();
	}

}
