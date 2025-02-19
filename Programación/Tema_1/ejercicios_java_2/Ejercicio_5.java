package ejercicios_java_2;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double lado1, lado2, lado3;
		
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Ingresa la longitud del primer lado");
		lado1 = leer1.nextInt();
		
		System.out.println("Ingrese la longitud del segundo lado");
		lado2 = leer1.nextInt();
		
		System.out.println("Ingrese la longitud del tercer lado");
		lado3 = leer1.nextInt();
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if (lado1 == lado2 && lado2 == lado3) {
				System.out.println("El triángulo es equilátero");
			} else {
				if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
					System.out.println("El triángulo es isósceles");
				} else {
					System.out.println("El triángulo es escaleno");
				}
			}
		} else {
			System.out.println("Las longitudes introducidan no pueden formar un triángulo");
		}

		leer1.close();
	}

}
