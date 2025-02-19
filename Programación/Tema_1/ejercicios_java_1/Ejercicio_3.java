package ejercicios_java_1;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio;
		double area;
		
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingresa el ratio del circulo");
		radio= leer.nextInt();
		
		area = Math.PI * (2 * radio);
		System.out.print("El area del circulo es " +area);
		
		leer.close();
	}
}
