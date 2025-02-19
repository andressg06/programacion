package Tarea_3;

import java.util.Scanner;

public class Ejercicio_2 {
	
	static void reves (int base) {
		
		if (base == 0) {
			return;
		}
		
		System.out.print(base % 10);
		
		reves(base/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduce un numero");
		int num = leer.nextInt();
		
		if (num >= 0) {
			reves(num);
		} else {
			System.out.println("Debe ser un numero positivo");
		}
		
		leer.close();

	}

}
