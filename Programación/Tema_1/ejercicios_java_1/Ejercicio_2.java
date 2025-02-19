package ejercicios_java_1;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double grados;
		double resultado;
		Scanner leer = new Scanner(System.in);
		
		System.out.print("Introduce los grados Celsius");
		grados = leer.nextInt();
		resultado = (grados*9/5) +32;
		
		System.out.printf("Los grados en Fahrenheit son " + resultado);
		
		leer.close();
	}

}
