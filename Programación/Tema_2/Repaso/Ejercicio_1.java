package Repaso;

import java.util.Scanner;

public class Ejercicio_1 {
	
	static int factorial (int num) {
		
		if (num < 10 && num > 0) {
			return num;
		}
		return (num % 10) + factorial(num/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int numero = leer.nextInt();
		
		System.out.println("La suma de los digitos " +numero + " es: " + factorial(numero));
		
		
		leer.close();
	}

}
