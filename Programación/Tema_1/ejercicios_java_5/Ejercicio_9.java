package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1,num2,num,suma,resta,multi,divi;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		num1 = leer.nextInt();
		
		System.out.println("Introduzca otro numero");
		num2 = leer.nextInt();
		
		num = 0;
		
		while (num != 5) {
		
		System.out.println("1.- Sumar los números");
		System.out.println("2.- Restar los números");
		System.out.println("3.- Multiplicar los números");
		System.out.println("4.- Dividir los números");
		System.out.println("5.- Salir del programa");
		num = leer.nextInt();
		
			switch(num) {
			case 1:
				suma = num1 + num2;
				System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
			break;
			case 2:
				resta = num1 - num2;
				System.out.println("La resta entre " + num1 + " y " + num2 + " es: " + resta);
			break;
			case 3:
				multi = num1 * num2;
				System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multi);
			break;
			case 4:
				while (num2 == 0) {
						System.out.println("Introduce otro divisor que no sea 0");
						num2 = leer.nextInt();
					}
				divi = num1 / num2;
				System.out.println("La división de " + num1 + " y " + num2 + " es: " + divi);	
			break;
			case 5:
				return;
			}
		}
		leer.close();
	}

}
