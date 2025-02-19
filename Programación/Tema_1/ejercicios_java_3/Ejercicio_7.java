package ejercicios_java_3;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		double impuesto;
		String nivel;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Selecciona tu categoria (1,2,3,4)");
		num = leer1.nextInt();
		
		switch (num) {
		case 1:
			impuesto = 0.10;
			break;
		case 2:
			impuesto = 0.15;
			break;
		case 3:
			impuesto = 0.20;
			break;
		case 4:
			impuesto = 0.25;
			break;
		default:
			System.out.println("Categoria no valida");
			leer1.close();
			return;
		}
		
		nivel = impuesto <= 0.10 ? "Bajo" :
			impuesto <= 0.20 ? "Medio" : "Alto" ;
		
		System.out.println("Para la categoria " + num + ", el impuesto es de " + (impuesto * 100) + "%");
		System.out.println("El nivel de impuesto es " + nivel );
		
		leer1.close();
		
	}

}
