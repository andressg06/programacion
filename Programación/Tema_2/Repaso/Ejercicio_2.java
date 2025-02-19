package Repaso;

import java.util.Scanner;

public class Ejercicio_2 {
	
	static int array (int num) {
		int [] numeros = {1,4,7,2,8,5,3,8,5,1};
		int contador = 0;
		for (int i=0;i < numeros.length; i++) {
			if (numeros[i] == num) {
				contador = contador + 1;
			}
		}
		return contador;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num = leer.nextInt();
		
		System.out.println("El numero de veces que se repite el numero " + num + " es " + array(num) + ".");
		
		leer.close();
	}

}
