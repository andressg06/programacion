package ejercicios_java_5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random tirada = new Random();
		Scanner leer = new Scanner(System.in);
		
		int n_dados,resultados;
		double suma1 = 0,suma2 = 0,suma3 = 0,suma4 = 0,suma5 = 0,suma6 = 0;
		
		System.out.println("Cuantas veces quieres tirar los dados");
		n_dados = leer.nextInt();
		
		for (int i = 0; i < n_dados; i++) {
			resultados = tirada.nextInt(6) + 1;
			switch (resultados) {
			case 1:
				suma1++;
			break;
			case 2:
				suma2++;
			break;
			case 3:
				suma3++;
			break;
			case 4:
				suma4++;
			break;
			case 5:
				suma5++;
			break;
			case 6:
				suma6++;
			break;
			}
		}
		
		double porcentaje;
		
		porcentaje = (suma1 * 100) / n_dados;
		System.out.println("La cara del numero 1 ha salido un " + porcentaje + "por ciento");
		
		porcentaje = (suma2 * 100) / n_dados;
		System.out.println("La cara del numero 2 ha salido un " + porcentaje + "por ciento");
		
		porcentaje = (suma3 * 100) / n_dados;
		System.out.println("La cara del numero 3 ha salido un " + porcentaje + "por ciento");
		
		porcentaje = (suma4 * 100) / n_dados;
		System.out.println("La cara del numero 4 ha salido un " + porcentaje + "por ciento");
		
		porcentaje = (suma5 * 100) / n_dados;
		System.out.println("La cara del numero 5 ha salido un " + porcentaje + "por ciento");
		
		porcentaje = (suma6 * 100) / n_dados;
		System.out.println("La cara del numero 6 ha salido un " + porcentaje + "por ciento");
		
		
		
		
		leer.close();
	}

}
