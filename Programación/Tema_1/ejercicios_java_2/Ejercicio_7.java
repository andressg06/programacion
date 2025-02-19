package ejercicios_java_2;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char membresia;
		double precio,descuento;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Ingrese su tipo de membresía (A,B o C)");
		membresia = leer1.next().toUpperCase().charAt(0);
		
		System.out.println("Ingrese el precio de la compra");
		precio = leer1.nextInt();
		
		switch (membresia) {
		case 'A':
			descuento = 0.30;
			break;
		case 'B':
			descuento = 0.20;
			break;
		case 'C':
			descuento = 0.10;
			break;
		default:
			System.out.println("Membresia invalida");
			leer1.close();
			return;
		}
		
		double descuento2 = precio * descuento;
		double precioFinal = precio - descuento2;
		
		System.out.println("El descuento aplicado es de un " + descuento2 + "%");
		System.out.println("El precio final es de " + precioFinal + " euros" );
		
		leer1.close();

	}

}
