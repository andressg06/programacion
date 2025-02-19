package Repaso;

import java.util.Scanner;

public class Repaso_4 {
	
	static void Imprimir (int N) {
		
		
		if (N == 1) {
			System.out.println(1);
		} else {
			Imprimir(N-1);
			System.out.println(N);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce un numero");
		int n = leer.nextInt();
		
		Imprimir(n);
		
		leer.close();

	}

}
