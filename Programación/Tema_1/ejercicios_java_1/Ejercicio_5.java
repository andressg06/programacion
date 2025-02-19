package ejercicios_java_1;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double cateto1, cateto2, hipo;
		
		Scanner leer1 = new Scanner(System.in);
		Scanner leer2 = new Scanner(System.in);
		
		System.out.print("Ingresa los catetos de un triangulo");
		cateto1 = leer1.nextInt();
		cateto2 = leer2.nextInt();
		
		hipo = Math.sqrt(cateto1 * 2 + cateto2 * 2);
		System.out.print("La hipotenusa es " + hipo);
		
		leer1.close();
		leer2.close();
	}

}
