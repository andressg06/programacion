package ejercicios_java_2;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double ingreso;
		double impuesto = 0;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Ingresa tu ingreso anual");
		ingreso = leer1.nextInt();
		
		if (ingreso < 10000) {
			System.out.println("No se paga impuesto");
		} else {
			if (ingreso >= 10000 && ingreso <= 20000) {
				impuesto = ingreso * 0.10;
			} else {
				if (ingreso >= 20000 && ingreso <= 30000) {
					impuesto = ingreso * 0.15;
				} else {
					if (ingreso > 30000) {
						impuesto = ingreso * 0.20;
					}
				}
			}
		}
		
		System.out.printf("El impuesto a pagar es " + impuesto);

		leer1.close();
		
	}

}
