package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,pos,contpos,neg,contneg,cero,medianeg,mediapos;
		
		Scanner leer = new Scanner(System.in);
		
		cero = 0;
		pos = 0;
		neg = 0;
		contpos = 0;
		contneg = 0;
		
		for (int i = 1; i < 10; i++) {
			
			System.out.println("Introduzca 10 numeros");
			num = leer.nextInt();
			
			if (num > 0) {
				pos = pos + num;
				contpos++;
			} else {
				if (num < 0) {
					neg = neg + num;
					contneg++;
				} else {
					cero = cero + 1;
				}
			}
		}
		
		medianeg = neg / contneg;
		mediapos = pos / contpos;
		
		System.out.println("La media de los números positivos es " + mediapos);
		System.out.println("La media de los números negativos es " + medianeg);
		System.out.println("El numero de ceros es " + cero);
		
		leer.close();
	}

}
