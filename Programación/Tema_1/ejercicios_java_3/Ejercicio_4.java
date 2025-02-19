package ejercicios_java_3;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca su edad");
		num = leer1.nextInt();
		
		String resultado = num >= 18 ? "Puede votar" : "No puede votar";
		
		System.out.println(resultado);
		
		leer1.close();
		
		

	}

}
