package Tarea_2;

import java.util.Scanner;

public class Ejercicio_7 {
	
	static boolean esBisiesto (int num) {
		
		boolean bisiesto = false;
		int divi1 = num % 4;
		int divi2 = num % 100;
		int divi3 = num % 400;
		
		if (divi1 == 0) {
			if (divi3 == 0) {
				if (divi2 == 0) {
					bisiesto = true;
					return bisiesto;
				}
			} else {
				if (divi2 != 0) {
					bisiesto = true;
					return bisiesto;
				}
			}
		} else {
			bisiesto = false;
			return bisiesto;
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un año");
		int num = leer.nextInt();
		
		System.out.println("El año es bisiesto: " + esBisiesto(num));
		
		leer.close();

	}

}
