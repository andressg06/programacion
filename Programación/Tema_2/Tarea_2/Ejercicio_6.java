package Tarea_2;

import java.util.Scanner;

public class Ejercicio_6 {
	
	static boolean esNumeroValido (String cadena) {

		for (int i = 0; i < cadena.length();i++) {
			char caracter = cadena.charAt(i);
			if (caracter < '0' || caracter > '9') {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		String num = leer.next();
		
		System.out.println(esNumeroValido(num));
		
		leer.close();

	}

}
