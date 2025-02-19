package ejercicios_java_4;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,cuen;
		boolean esPrimo;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num = leer1.nextInt();
		
		for (i=2 ; i != num ; i++) {
			esPrimo = true;
			
			for (cuen = 2; cuen <= Math.sqrt(i); cuen++) {
				if (i % cuen == 0) {
					esPrimo = false;
					break;
				}
			}
			
			if (esPrimo ) {
				System.out.println(i);
			}
		}
		leer1.close();
	}

}
