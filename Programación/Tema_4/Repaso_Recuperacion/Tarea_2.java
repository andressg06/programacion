package Repaso_Recuperacion;

import java.util.*;

public class Tarea_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		
		int[][] Matriz = new int[3][3];
		
		//Entrada de Datos
		for(int i = 0; i < Matriz.length; i++) {
			for(int j = 0; j < Matriz[i].length; j++) {
				System.out.println("Introduce un numero");
				Matriz[i][j] = leer.nextInt();
			}
		}
		
		//Mostrar Matriz
		System.out.println("Matriz Original:");
		for(int i = 0; i < Matriz.length; i++) {
			for(int j = 0; j < Matriz[i].length; j++) {
				System.out.print(Matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		//Plegado Vertical
		for(int j = 0; j < Matriz.length; j++) {
			int temp = Matriz[0][j];
			Matriz[0][j] = Matriz [2][j];
			Matriz[2][j] = temp;
		}
		
		//Mostrar Plegado Vertical
		System.out.println("Matriz después del plegado vertical:");
		for(int i = 0; i < Matriz.length; i++) {
			for(int j = 0; j < Matriz[i].length; j++) {
				System.out.print(Matriz[i][j] + " ");
			}
			System.out.println();
		}
		
		//Plegado Horizontal
		for(int i = 0; i < Matriz.length; i++) {
			int temp = Matriz[i][0];
			Matriz[i][0] = Matriz[i][2];
			Matriz[i][2] = temp;
		}
		
		//Mostrar Plegado Horizontal
		System.out.println("Matriz después del plegado horizontal:");
		for(int i = 0; i < Matriz.length; i++) {
			for(int j = 0; j < Matriz[i].length; j++) {
				System.out.print(Matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
