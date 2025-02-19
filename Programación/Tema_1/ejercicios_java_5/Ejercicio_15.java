package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		int num,mayor,mayor2;
		
		mayor = 0;
		mayor2 = 0;
		
		for (int i = 0; i != 10; i++) {
			System.out.println("Introduce una secuencia de números enteros.");
			num = leer.nextInt();
			if (num > mayor) {
				mayor = num;
			} else {
				if (num > mayor2) {
					mayor2 = num;
				}
			}
		}
		
		System.out.println("El numero mayor es " + mayor);
		System.out.println("El segundo numero mayor es " + mayor2);
		
		leer.close();

	}

}
