package ejercicios_java_2;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduce la nota del examen");
		num = leer1.nextInt();
		
		if (num >= 90) {
			System.out.println("Excelente");
		} else {
			if (num >= 70 && num <= 89) {
				System.out.println("Bueno");
			} else {
				if (num >= 50 && num <= 69) {
					System.out.println("Regular");
				} else {
					if (num < 50) {
						System.out.println("Reprobado");
					}
				}
			}
		}
		
		leer1.close();

	}

}
