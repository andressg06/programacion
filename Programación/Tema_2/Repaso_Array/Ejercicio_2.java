package Repaso_Array;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		String[] array = new String[3];
		
		String contenedor = null;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Introduce una palabra");
			array[i] = leer.next();
			if (i == 0 || array[i].length() > contenedor.length()) {
				contenedor = array[i];
			}
		}
		
		System.out.println(contenedor);
		
		leer.close();
	}

}
