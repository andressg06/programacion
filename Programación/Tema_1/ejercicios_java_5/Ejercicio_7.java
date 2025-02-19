package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 0,multi,contador = 0;
		
		Scanner leer = new Scanner(System.in);
		
		
		while (num == 0) {
			System.out.println("Introduce un numero");
			num = leer.nextInt();
			
			if (num == 0) {
				System.out.println("Tiene que introducir un numero mayor que 0");	
			}
		}
		for (int i = 1; i <= num;i++) {
			
			multi = 3 * i;
			System.out.println(multi);
			
			contador = i;
		}
		
		System.out.println("El total de numeros mostrados es " + contador);
		
		leer.close();
	}

}
