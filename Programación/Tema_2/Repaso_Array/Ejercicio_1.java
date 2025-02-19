package Repaso_Array;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_1 {

	static int array (int num) {
		
		Random random = new Random();
		
		int contador = 0;
		int[] numero = new int[10];
		
		for (int i = 0; i < numero.length; i++) {
			numero[i] = random.nextInt(6); 
			if (numero[i] == num) {
				contador ++;
			}
		}
		
		return contador;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int num = leer.nextInt();
		
		System.out.println("Este numero aparece " + array(num) + " veces.");
		
		leer.close();

	}

}
