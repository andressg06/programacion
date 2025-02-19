package Tarea_3;

import java.util.Scanner;

public class Ejercicio_4 {
	
	static String binario (int num) {
		
		if (num == 0 || num == 1) {
			return String.valueOf(num);
		}
		
		return binario (num /2) + (num % 2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num = leer.nextInt();
		
		System.out.println("El numero " + num + " en binario es: " + binario(num));
		
		leer.close();

	}

}
