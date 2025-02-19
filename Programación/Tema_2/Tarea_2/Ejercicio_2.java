package Tarea_2;

import java.util.Scanner;

public class Ejercicio_2 {
	
	static String concatenar (String con1, String con2) {
		String cadena;
		cadena = con1 + con2;
		return cadena;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce una cadena de parametros");
		String con1 = leer.next();
		
		System.out.println("Introduce otra cadena");
		String con2 = leer.next();
		
		System.out.println("Las cadenas concadenadas serian " + concatenar(con1,con2));
		
		leer.close();

	}

}
