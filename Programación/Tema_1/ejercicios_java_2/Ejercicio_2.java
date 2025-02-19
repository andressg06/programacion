package ejercicios_java_2;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int edad;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca su edad");
		edad = leer1.nextInt();
		
		if (edad<=12) {
			System.out.println("Niño");
		} else {
			if (edad >= 13 && edad <= 17) {
				System.out.println("Adolescente");
			} else {
				if (edad >= 18 && edad <= 64) {
					System.out.println("Adulto");
				} else {
					System.out.println("Adulto mayor");
				}
			}
		}
		leer1.close();
	}
}
