package Ejercicio_15;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		Cuenta cuenta1 = null;
		
		
		int num;
	do {
		System.out.println("***MENU***");
		System.out.println("1. Crear cuenta vacía.");
		System.out.println("2. Crear cuenta con saldo inicial");
		System.out.println("3. Ingresar dinero.");
		System.out.println("4. Sacar dinero.");
		System.out.println("5. Ver dinero");
		System.out.println("6. Salir");
		num = leer.nextInt();
		
		switch (num) {
		case 1: 
			cuenta1 = new Cuenta("Andrés",13847294,0);
		break;
		case 2: 
			System.out.println("¿Qque cantidad inicial desea ingresar?");
			float inicial = leer.nextInt();
			cuenta1 = new Cuenta("Andrés",13847294,inicial);
		break;
		case 3: 
			if (cuenta1 != null) {
				System.out.println("¿Que cantidad desea ingresar?");
				float ingreso = leer.nextFloat();
				cuenta1.ingresar(ingreso);
			} else {
				System.out.println("Primero debes crear una cuenta");
				}
		break;
		case 4:
			if (cuenta1 != null) {
				System.out.println("¿Que cantidad desea retirar?");
				float retirar = leer.nextFloat();
				cuenta1.extraer(retirar);
			} else {
				System.out.println("Primero debes crear una cuenta");
			}
		break;
		case 5:
			cuenta1.getSaldo();
		break;
		case 6:
			System.out.println("Saliendo del programa");
		break;
		default: System.out.println("Opción no valida");
		
		leer.close();
		}
	} while (num != 6);

	}
}
