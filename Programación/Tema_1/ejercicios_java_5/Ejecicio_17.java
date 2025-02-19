package ejercicios_java_5;

import java.util.Scanner;

public class Ejecicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int baliza,cantidad,num,mayores = 0,suma = 0,menores = 0,igual = 0;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce el número baliza");
		baliza = leer.nextInt();
		
		System.out.println("Introduce la cantidad de numeros que vas a comparar");
		cantidad = leer.nextInt();
		
		for (int i = 0; i != cantidad;i++) {
		
			System.out.println("Introduce un numero");
			num = leer.nextInt();
		
			if (num > baliza) {
				mayores ++;
				suma = suma + num;
			} else {
				if (num == baliza) {
					igual ++;
				} else {
					menores ++;
				}
			}
		}
		
		System.out.println("Hay " + mayores + " números mayores que la baliza, " + menores + " menores y " + igual + " iguales. La suma de los numeros mayores es " + suma );
		
		leer.close();
	}

}
