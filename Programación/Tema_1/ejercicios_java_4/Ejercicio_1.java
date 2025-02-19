package ejercicios_java_4;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, inver = 0,cuenta;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num = leer1.nextInt();
		
		for (;num != 0; num /= 10) {
			cuenta = num % 10;
			inver = inver * 10 + cuenta;
			leer1.close();
		}

		System.out.println("El numero invertido es " + inver );
		leer1.close();
	}

}
