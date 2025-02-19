package Repaso;

import java.util.Scanner;

public class Repaso_Exam {
	//PRIMERA PRUEBA
	static boolean energia (int num) {
		int suma = 0;
		while (num > 0) {
			suma = suma + (num % 10);
			num = num / 10;
		}
		if (suma % 2 == 0) {
			System.out.println("La suma de los digitos es " + suma + ". Es un numero par. ¡Has superado la ronda!");
			return true;
		} else {
			System.out.println("La suma de los digitos es " + suma + ". Es un numero impar. ¡No has superado la ronda!");
			return false;
		}
	}
		
	//SEGUNDA PRUEBA
	static int mcd (int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return mcd (b, a % b);
		}
	}
	
	//TERCERA PRUEBA
	static boolean magico (int num) {
		int contador = 0;
		for (int i = 1 ; i <= num ; i++) {
			if (num % i == 0) {
				contador++;
			}
		}
		if (contador == 3)
		{
			return true;
		}
		else
			System.out.println(num + " no tiene exactamente 3 divisores. Intentalo de nuevo:");
			return false;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("¡Bienvenido al Torneo de la Arena Virtual! Preparate para superar los retos.");
		
		
		//PRIMERA PRUEBA
		System.out.println("--- Ronda de Energía ---");
		int num;
		do {
			System.out.print("Introduce un número entero positivo:");
			num = leer.nextInt();
		} while (energia(num) == false);
		
		
		//SEPARACION
		System.out.println("");
		
		
		//SEGUNDA PRUEBA
		System.out.println("--- El puente del Máximo Común Divisor ---");
		while (true) {
			System.out.print("Introduce dos numeros:");
			int num1 = leer.nextInt();
			int num2 = leer.nextInt();
		
			int mcd = mcd(num1,num2);
			System.out.print("El MCD de " +num1+ " y " +num2+ " es: " +mcd);
			if (mcd > 1) {
				System.out.println(" ¡El puente se abre!");
				break;
			} else {
				System.out.println("El MCD debe ser mayor que 1. Intentalo de nuevo");
			}
		}
		
		
		//SEPARACION
		System.out.println("");
		
		
		//TERCERA PRUEBA
		System.out.println("--- El cubo de los Factores Mágicos ---");
		int num3;
		System.out.print("Introduce un número entero positivo:");
		do {
		num3 = leer.nextInt();
		} while (magico(num3) == false);
		
		System.out.println("¡Correcto! El numero " + num3 + " es mágico");
		System.out.println("¡Felicidades! Ha ganado el Torneo de la Arena Virtual.");
		
		
		
		leer.close();
	}
}
