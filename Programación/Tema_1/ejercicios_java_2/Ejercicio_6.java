package ejercicios_java_2;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num = leer1.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0 ) {
				System.out.println("El numero es positivo y par");
			} else {
				System.out.println("El numero es positivo e impar");
			}
		} else {
			if (num < 0) {
				System.out.println("El numero es negativo");
			} else {
				System.out.println("El numero es 0");
			}
		}
		
		leer1.close();
	}

}
