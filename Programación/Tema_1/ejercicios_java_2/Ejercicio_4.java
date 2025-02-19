package ejercicios_java_2;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num1 = leer1.nextInt();
		
		System.out.println("Introduzca otro numero");
		num2 = leer1.nextInt();
		
		System.out.println("Introduzca un ultimo numero");
		num3 = leer1.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println( num1 + " es el numero mayor");
			} else {
				if (num3 > num2) {
					System.out.println( num3 + " es el numero mayor");
				} else {
					if (num2 > num1) {
						System.out.println( num2 + " es el numero mayor");
					}
				}
			}
		} else {
			if (num2 > num3) {
				System.out.println( num2 + " es el numero mayor");
			} else {
				if (num3 > num1) {
					System.out.println( num3 + " es el numero mayor");
				}
			}
		}
			
		leer1.close();

	}

}
