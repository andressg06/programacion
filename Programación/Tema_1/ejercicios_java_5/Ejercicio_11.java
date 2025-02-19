package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_11 {
	
	static int divisores (int num) {
		int suma = 0;
		for (int i = 1; i <= num / 2; i++) {
			if ( num % i == 0) {
				suma = suma + i;
			}	
		}
		return suma;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2;
		String continuar;
		
		Scanner leer = new Scanner(System.in);
		
		continuar = "si";
		
		while (continuar.equalsIgnoreCase("si")) {
		
			System.out.println("Introduzca un numero");
			num1 = leer.nextInt();
		
			System.out.println("Introduce otro numero");
			num2= leer.nextInt();
		
			int divisor1 = divisores(num1);
			int divisor2 = divisores(num2);
		
			if (divisor1 == num2 && divisor2 == num1) {
				System.out.println("Los numeros son amigos");
			} else {
				System.out.println("Los numeros no son amigos");
			}
			
			System.out.println("Quieres continuar (si/no)");
			continuar = leer.next();
		}
		leer.close();
	}

}
