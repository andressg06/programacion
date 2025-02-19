package ejercicios_java_3;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduce un numero (del 1 al 7)");
		num = leer1.nextInt();
		
		switch (num) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Caracter no valido");
			leer1.close();
			return;
		}
		
		leer1.close();

	}

}
