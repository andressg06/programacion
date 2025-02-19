package Tarea_1;

import java.util.Scanner;

public class Ejercicio_2 {

	static int cubo(int num) {
		num = num*3;
		int resultado = num * 3;
		return resultado;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num = leer1.nextInt();
		
		System.out.println("El cubo de " +num+ " es " +cubo(num));
		
		leer1.close();

	}

}
