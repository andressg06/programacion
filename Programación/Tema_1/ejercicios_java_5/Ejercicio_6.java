package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int infe,supe,n,suma,conta;
		
		Scanner leer = new Scanner (System.in);
		
		infe = 1;
		supe = 0;
		n = 1;
		suma = 0;
		conta = 0;
		
		while (infe > supe) {
			System.out.println("Introduzca un limite inferior");
			infe = leer.nextInt();
			
			System.out.println("Introduzca un limite superior");
			supe = leer.nextInt();
			
			if (infe > supe) {
				System.out.println("El limite inferior es mayor que el limite superior");
			
			}
		}
		
		while (n != 0) {
			
			System.out.println("Introduce un numero");
			n = leer.nextInt();
			
			if (n >= infe && n <= supe) {
				suma = suma + n;
				if (n == infe || n == supe) {
					if (n == infe) {
						System.out.println(n + " es igual al limite inferior");
					} else {
						System.out.println(n + " es igual al limite superior");
					}
				}
			} else {
				conta = conta + 1;
			}
		
		}
		
		System.out.println("La suma de los numeros que estan dentro del intervalo es " + suma);
		System.out.println("Fuera del intervalo hay " + conta + " numeros");
		
		leer.close();
	}

}
