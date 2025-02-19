package Tarea_1;

import java.util.Scanner;

public class Ejercicio_4 {
	
	static int multi(int num1) {
		int i, resultado = 0;
		for (i = 0; i < 11 ; i = i+1) {
		resultado = num1*i;
		System.out.println(num1 + "x" +i+ "=" + resultado);
		}
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num1 = leer1.nextInt();
		
		multi(num1);
		
		leer1.close();

	}

}
