package ejercicios_java_5;

import java.util.Random;
import java.util.Scanner;

// Crea un programa en Java que genere números aleatorios entre dos valores, min y max,dados por el usuario. El número aleatorio debe estar en el rango [min,max] e incluir ambos extremos.

public class Prueba2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		Scanner leer = new Scanner(System.in);
		
		int min,max;
		
		System.out.println("Escribe un limite inferior");
		min = leer.nextInt();
		
		System.out.println("Escribe un limite superior");
		max = leer.nextInt();
		
		int numran = random.nextInt(min,max + 1);
		
		System.out.println(numran);
		
		leer.close();

	}

}
