package Ejercicios;

import java.util.Scanner;

public class Tarea_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner (System.in);
		
		int[] array1 = new int[4];
		int[] array2 = new int [4];
		
		int num = Math.max(array1.length, array2.length);
		
		int[] array3 = new int[num];
		
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduzca un numero");
			array1[i] = leer.nextInt();
		}
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Introduzca un numero");
			array2[i] = leer.nextInt();
		}
		
		for (int i = 0; i < num; i++) {
			if (i < array1.length && i <array2.length) {
				if (array1[i] > array2[i]) {
					array3[i] = array1[i];
				} else {
					if (array2[i] > array1[i] || array2[i] == array1[i]) {
						array3[i] = array2[i];
					}
				}
			}
		}
		
		System.out.println("Array final:");
		
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i]);
		}
		
		leer.close();
	}

}
