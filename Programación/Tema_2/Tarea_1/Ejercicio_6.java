package Tarea_1;

import java.util.Scanner;

public class Ejercicio_6 {
	
	static void menu(int num1, int num2,int num3) {
		int resultado = 0;
		switch(num1) {
		case 1:
			resultado = num2 + num3;
			System.out.println(num2+ "+" +num3+ "=" +resultado);
			break;
		case 2:
			resultado = num2 - num3;
			System.out.println(num2+ "-" +num3+ "=" +resultado);
			break;
		case 3:
			resultado = num2 * num3;
			System.out.println(num2 + "x" +num3+ "=" +resultado);
			break;
		case 4:
			resultado = num2 / num3;
			System.out.println(num2+ "/" + num3+ "=" +resultado);
			break;
		case 5:
			return;
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num3;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Menu de opciones: "
				+ "1. Para sumar "
				+ "2. Para restas "
				+ "3. Para multiplicar "
				+ "4. Para dividir "
				+ "5. Para salir");
		num1 = leer.nextInt();	
		num2 = 0;
		num3 = 0;
		
		
		if (num1 != 5) {
			System.out.println("Introduzca un numero");
			num2 = leer.nextInt();
			
			System.out.println("Introduzca un numero menor que el anterior");
			num3 = leer.nextInt();
		} else {}
		
		menu(num1,num2,num3);
		
		leer.close();
		
	}

}
