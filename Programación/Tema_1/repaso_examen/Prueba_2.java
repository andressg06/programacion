package repaso_examen;

import java.util.Random;
import java.util.Scanner;

public class Prueba_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		String num = leer.next();
		
		System.out.println("Introduzca un numero");
		String num2 = leer.next();
		
		int a = Integer.parseInt(num);
		
		double b = Integer.parseInt(num2);
		
		System.out.println(b);
		
		leer.close();

	}
}
