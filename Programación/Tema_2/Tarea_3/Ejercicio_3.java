package Tarea_3;

import java.util.Scanner;

public class Ejercicio_3 {
	
	static boolean binario (int num) {
		
		if (num == 0 || num == 1) {
			return true;
		}
		
		if (num % 10 != 0 && num % 10 != 1) {
			return false;
		}
		
		return binario (num/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce un numero binario");
		int num = leer.nextInt();
		
		if (binario(num) == true) {
			System.out.println("Es binario");
		} else {
			System.out.println("No es binario");
		}
		
		leer.close();
	}
}
