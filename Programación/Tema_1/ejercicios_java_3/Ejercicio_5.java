package ejercicios_java_3;

import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		double descuento;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca el precio del producto");
		num = leer1.nextInt();
		
		descuento = num > 100 ? num-(num*0.10) : num-(num*0.05);
		System.out.println("El total a pagar es " + descuento);
		
		leer1.close();

	}

}
