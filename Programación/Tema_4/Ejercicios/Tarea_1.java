package Ejercicios;

import java.util.Scanner;

public class Tarea_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner (System.in);
		
		int[] enteros = {7,8,5,1,6,9,4,6,1,2,1,5,9};
		
		System.out.println("Introduzca un valor");
		int num = leer.nextInt();
		int contador = 0;
		
		for (int i = 0; i < enteros.length; i++) {
			
			if (enteros[i] == num) {
				contador++;
			}
		}
		
		System.out.println("El numero " +num+ " aparece un total de " +contador+ " veces.");
		leer.close();

	}

}
