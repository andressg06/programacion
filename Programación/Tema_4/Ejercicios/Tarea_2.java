package Ejercicios;

import java.util.Scanner;

public class Tarea_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner (System.in);
		
		String[] palabras = new String[4];
		String larga = "";
		
		for (int i = 0; i < palabras.length; i++) {
			
			System.out.println("Escribe una palabra");
			palabras[i] = leer.next();
			
		}
		
		for (int i = 0; i < palabras.length; i++) {
			
			String proceso = palabras[i];
			
			if (larga.length() < proceso.length()) {
				larga = proceso;
			}
		}
		
		System.out.println("La palabra mas larga es " +larga);
		
		leer.close();
	}

}
