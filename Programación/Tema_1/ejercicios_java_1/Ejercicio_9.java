package ejercicios_java_1;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int naci, actual, edad;
		Scanner leer1 = new Scanner(System.in);
		Scanner leer2 = new Scanner(System.in);
		
		System.out.println("Dime tu año de nacimiento y el año actual");
		naci = leer1.nextInt();
		actual = leer2.nextInt();
		
		edad = actual - naci;
		System.out.println("Tu edad es " + edad);
		
		leer1.close();
		leer2.close();
	}

}
