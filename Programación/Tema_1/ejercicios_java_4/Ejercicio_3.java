package ejercicios_java_4;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,i,serie;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num = leer1.nextInt();
		serie = 0;
		for ( i = 0 ; i < num ; i += serie ) {
			serie++;
			System.out.println(i);
		leer1.close();
		}
		
		leer1.close();

	}

}
