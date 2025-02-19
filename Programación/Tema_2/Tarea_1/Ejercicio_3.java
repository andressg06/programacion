package Tarea_1;

import java.util.Scanner;

public class Ejercicio_3 {
	
	static int multi(int num1, int num2) {
		int resultado = num1*num2;
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2;
		
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca dos numeros");
		num1 = leer1.nextInt();
		num2 = leer1.nextInt();
		
		System.out.println("La multiplicacion entre " +num1+ " y " +num2+ " es: " +multi(num1,num2));
		
		leer1.close();

	}

}
