package Repaso_Array;

import java.util.Scanner;

public class Ejercicio_3 {
	
	static void primer (String palabra, char letra) {
		char a;
		
		a = palabra.charAt(0);
		
		if (letra == a) {
			System.out.println(palabra);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		String[] palabra = new String[4]; 
		char letra;
		
		
		for (int i=0; i < palabra.length; i++) {
			System.out.println("Introduzca una palabra");
			palabra[i] = leer.next();
		}
		
		System.out.println("Introduzca una letra");
		letra = leer.next().charAt(0);
		
		for (int i=0; i < palabra.length; i++) {
			primer(palabra[i],letra);
		}
		
		leer.close();
	}

}
