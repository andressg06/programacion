package ejercicios_java_2;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num = leer1.nextInt();
		
		if (num%2 == 0) {
			System.out.println("El numero es par");
		}
		else {
			System.out.println("El numero es impar");
		}
		leer1.close();
	}

}
