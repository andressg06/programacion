package Tarea_3;

import java.util.Scanner;

public class Ejercicio_5 {
	
	static boolean alfabetica (String pala) {
		
		if (pala.length() <= 1) {
			return true;
		}
		
		if (pala.charAt(0) > pala.charAt(1)) {
			return false;
		}
		
		return alfabetica(pala.substring(1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
		String palabra = leer.next();
		
		if (alfabetica(palabra) == true) {
			System.out.println("Esta ordenada");
		} else {
			System.out.println("No esta ordenada");
		}
		
		leer.close();

	}

}
