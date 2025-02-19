package ejercicios_java_5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Scanner leer = new Scanner(System.in);
		
		int num = 0,contador = 0;
		int numran = random.nextInt(100) + 1;
		
		for(int i = 0;num != numran; i++ ) {
			
			System.out.println("Adivina el numero, es un numero del 1 al 100");
			num = leer.nextInt();
			
			if (num > numran) {
				System.out.println("El numero que tienes que adivinar es menor");
			} else {
				System.out.println("El numero que tienes que adivinar es mayor");
			}
		contador = i;
		}
		System.out.println("Correcto!! Has adivinado el numero");
		System.out.println("El numero de intentos han sido: " + contador);
		
		leer.close();
	}

}
