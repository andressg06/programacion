package repaso_examen;

import java.util.Scanner;

public class prueba_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		int edad;
		
		System.out.println("Introduzca su edad");
		edad = leer.nextInt();
		
		if (edad < 12) {
			System.out.println("Niño");
		} else {
			if (edad >= 12 && edad <= 17) {
				System.out.println("Adolescente");
			} else {
				
			}
			
		}

	}

}
