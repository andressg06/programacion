package ejercicios_java_2;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num = leer1.nextInt();
		
		if (num >= 90 && num <=100) {
			System.out.println("A");
		} else {
			if (num >=80 && num <= 89) {
				System.out.println("B");
			} else 
				if (num >=70 && num <=79) {
					System.out.println("C");
				} else {
					if (num >=60 && num <=69) {
						System.out.println("D");
					} else {
						System.out.println("F");
					}
				}
		
		}
		
		leer1.close();
		
	}

}
