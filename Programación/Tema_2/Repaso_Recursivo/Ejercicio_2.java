package Repaso_Recursivo;

import java.util.Scanner;

public class Ejercicio_2 {
	
	static void invertir (int num) {
		
		if (num == 0) {
			return;
		}
		
		System.out.print(num % 10);
		
		invertir(num/10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int num = leer.nextInt();
		
		invertir(num);
		
		leer.close();
	}

}
