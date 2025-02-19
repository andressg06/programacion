package Ejercicios;

import java.util.Scanner;

public class Tarea_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		String[] palabras = new String[4];
		String caracter;
		
		for (int i = 0; i < palabras.length; i++) {
			
			System.out.println("Introduzca una palabra");
			palabras[i] = leer.next();
		}
		
		System.out.println("Introduzca una letra");
		caracter = leer.next();
		char letra = caracter.charAt(0);
		
		for (int i = 0; i < palabras.length; i++) {
			
			char letra2 = palabras[i].charAt(0);
			
			if (letra == letra2) {
				System.out.println(palabras[i]);
			}
		}
		
		leer.close();
	}

}
