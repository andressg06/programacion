package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero,primera_cifra,segunda_cifra,tercera_cifra,cuarta_cifra;
		
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero de 4 cifras:");
		numero = leer1.nextInt();
		
		if ( numero >= 1000 && numero <= 9999) {
			primera_cifra = numero / 1000;
			segunda_cifra = (numero / 100) % 10;
			tercera_cifra = (numero / 10) % 10;
			cuarta_cifra = numero % 10;
			
			System.out.println("La primera cifra es: " + primera_cifra);
			System.out.println("La segunda cifra es: " + segunda_cifra);
			System.out.println("La tercera cifra es: " + tercera_cifra);
			System.out.println("La cuarta cifra es: " + cuarta_cifra);
 		} else {
 			System.out.println("El numero no tiene 4 cifras");
 		}
		leer1.close();
	}

}
