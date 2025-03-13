package Repaso_Recuperacion;

import java.util.*;

public class Tarea_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		//Creacion de Array y Matriz y atributos
		int[] Array = new int[6];
		int[][] Matriz = new int[2][3];
		int suma = 0;
		int numero = 1;
		
		//Pedimos los datos al usuario
		System.out.println("Introduzca 6 números enteros");
		for (int i=0; i < Array.length; i++) {
			System.out.println("Número " + numero + " :");
			Array[i] = leer.nextInt();
			numero++;
		}
		
		//Convertimos el Array en Matriz
		int array = 0;
		for(int i = 0; i < Matriz.length; i++) {
			for(int j = 0; j < Matriz[i].length; j++) {
				Matriz[i][j] = Array[array];
				array++;
			}
		}
		
		//Suma de los numeros de la Matriz
		for(int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz[i].length; j++) {
				suma = suma + Matriz[i][j];
			}
		}
		
		//Mostrar la matriz
		System.out.println("Matriz 2x3:");
		for(int i = 0; i < Matriz.length; i++) {
			for (int j = 0; j < Matriz[i].length; j++) {
				System.out.print(Matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Suma de los elementos: " + suma);
		
		leer.close();
				
	}
}
