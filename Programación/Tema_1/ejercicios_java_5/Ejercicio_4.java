package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduzca el numero de dado te ha tocado");
		num = leer.nextInt();
		
		if (num >= 1 && num <= 6) {
			switch(num) {
				case 1:
					System.out.println("Seis");
					break;
				case 2:
					System.out.println("Cinco");
					break;
				case 3:
					System.out.println("Cuatro");
					break;
				case 4:
					System.out.println("Tres");
					break;
				case 5:
					System.out.println("Dos");
					break;
				case 6:
					System.out.println("Uno");
					break;
			}
		} else {
			System.out.println("ERROR: número incorrecto");
		}
		leer.close();
	}

}
