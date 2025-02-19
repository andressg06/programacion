package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_3 {
	
	static boolean esPrimo (int num) {
		if (num <= 1) {
			return false;
		}
		for (int i=2;i <= Math.sqrt(num);i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,i,primos = 0;
		
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca un numero, como maximo 100");
		num = leer1.nextInt();
		
		if (num<=100 && num >= 0) {
			for (i = 2; i <= num; i++) {
				if (esPrimo(i)) {
					primos++;
				}
			leer1.close();
			}	
		}
		
		System.out.println("Hay " + primos + " numeros primos");
		
		leer1.close();
	}
}
