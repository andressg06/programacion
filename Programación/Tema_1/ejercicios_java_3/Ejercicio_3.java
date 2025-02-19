package ejercicios_java_3;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca su puntuación (del 1 al 4)");
		num = leer1.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Novato");
			break;
		case 2:
			System.out.println("Intermedio");
			break;
		case 3:
			System.out.println("Avanzado");
			break;
		case 4:
			System.out.println("Experto");
			break;
		default:
			System.out.println("Caracter no valido");
			leer1.close();
			return;
		}

		leer1.close();
		
	}

}
