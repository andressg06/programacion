package ejercicios_java_1;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, suma, resta, multi, division;
		Scanner leer1 = new Scanner (System.in);
		Scanner leer2 = new Scanner (System.in);
		
		System.out.println("Introduzca dos numero");
		num1 = leer1.nextInt();
		num2 = leer2.nextInt();
		
		suma = num1 + num2;
		System.out.print("La suma de los dos numeros es " + suma);
		
		resta = num1 - num2;
		System.out.print("La resta de los dos numeros es " + resta);
		
		multi = num1 * num2;
		System.out.print("La multiplicación de los dos numeros es " + multi);
		
		division = num1/num2;
		System.out.print("La division de los dos numeros es " + division);
		
		leer1.close();
		leer2.close();
	}

}
