package Tarea_1;

import java.util.Scanner;

public class Ejercicio_1 {
	
	static String saludo(String nombre) {
		return "Saludos, " +nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un nombre");
		nombre = leer1.next();
		
		System.out.println(saludo(nombre));
		
		leer1.close();

	}

}
