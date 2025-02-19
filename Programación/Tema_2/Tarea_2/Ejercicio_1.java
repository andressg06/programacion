package Tarea_2;

import java.util.Scanner;

public class Ejercicio_1 {
	
	static double Promedio (double num1, double num2,double num3) {
		double Suma = (num1 + num2 + num3);
		double promedio = Suma / 3;
		return promedio;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner (System.in);
		
		System.out.println("Introduzca un numero");
		double num1=leer.nextInt();
		
		System.out.println("Introduzca otro numero");
		double num2=leer.nextInt();
		
		System.out.println("Introduzca un ultimo numero");
		double num3=leer.nextInt();
		
		System.out.println("El promedio es " + Promedio(num1,num2,num3));
		
		leer.close();

	}

}
