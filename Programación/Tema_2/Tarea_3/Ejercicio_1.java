package Tarea_3;

import java.util.Scanner;

public class Ejercicio_1 {
	
	static int elevar (int base, int expo) {
		
		if (base <= 0 || expo <= 0) {
			System.out.println("Los numeros deben ser positivos");
		}
		
		if (expo == 1) {
			return base;
		}
		
		return base * elevar(base,expo-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero base positivo");
		int base = leer.nextInt();
		
		System.out.println("Introduzca un exponente positivo");
		int expo = leer.nextInt();
		
		if (base <= 0 || expo <= 0) {
			System.out.println("Los numeros deben ser positivos");
		} else {
		System.out.println("El resultado es " + elevar(base,expo));
		}
		leer.close();

	}
}
