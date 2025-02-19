package Repaso_Recursivo;

import java.util.Scanner;

public class Ejercicio_1 {
	
	static int elevar (int num1, int num2) {
		
		if (num2 == 1) {
			return num1;
		}
		
		
		return num1 * elevar(num1,num2-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num1 = leer.nextInt();
		
		System.out.println("Introduce el numero por el que lo quieres elevar");
		int num2 = leer.nextInt();
		
		System.out.println("El resultado de elevar "+ num1 + " a " + num2 + " es: " + elevar(num1,num2));
		
		leer.close();
	}

}
