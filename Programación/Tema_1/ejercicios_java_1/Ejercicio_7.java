package ejercicios_java_1;

import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int horas, minutos, segundos;
		Scanner leer1 = new Scanner(System.in);
			
			System.out.print("Dime una cantidad de horas");
			horas = leer1.nextInt();
			
			minutos = horas * 60;
			segundos = minutos * 60;
			
			System.out.println("En minutos son " + minutos);
			System.out.println("En segundos son " + segundos);
			
			leer1.close();
	}

}
