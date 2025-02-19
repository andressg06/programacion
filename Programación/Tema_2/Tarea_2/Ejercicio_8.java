package Tarea_2;

import java.util.Scanner;

public class Ejercicio_8 {
	
	static boolean esPalindromo (String inicio) {
		String fin = "";
		
		for (int i = inicio.length() - 1; i >= 0;i--) {
			char caracter = inicio.charAt(i);
			fin = fin + caracter;
			
			if (inicio.equals(fin)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce una palabra palindromo");
		String inicio = leer.next();
		
		System.out.println(esPalindromo(inicio));
		
		leer.close();

	}

}
