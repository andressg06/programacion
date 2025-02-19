package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,suma_menores,suma_mayores;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un numero limite:");
		num = leer.nextInt();
		
		for (int x = 1; x <= num; x++) {
			suma_menores = 0;
			suma_mayores = 0;
			
			for (int i = 1; i < x; i++) {
				suma_menores = suma_menores + i;
			}
			
			int j = x + 1;
			while (suma_mayores < suma_menores) {
				suma_mayores = suma_mayores + j;
				j++;
			}
			
			if (suma_menores == suma_mayores) {
				System.out.println(x + " es un centro numerico");
			}
		}
		
		leer.close();
		

	}

}
