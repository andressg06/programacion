package ejercicios_java_1;

import java.util.Scanner;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num;
		double abajo;
		double arriba;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero decimal");
		num = leer1.nextInt();
		
		arriba = Math.ceil(num);
		abajo = Math.floor(num);
		System.out.println("El numero redondeado hacia arriba es " + arriba + " y abajo es " + abajo );
		
		leer1.close();
	}

}
