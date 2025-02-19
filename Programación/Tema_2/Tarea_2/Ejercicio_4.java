package Tarea_2;

import java.util.Scanner;

public class Ejercicio_4 {
	
	static String generarEstrellas (int num) {
			String estrella = "";
		for(int i = 0; i != num; i++) {
			estrella = "*" + estrella;
		}
		
		return estrella;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num = leer.nextInt();
		
		System.out.println(generarEstrellas(num));
		
		leer.close();

	}

}
