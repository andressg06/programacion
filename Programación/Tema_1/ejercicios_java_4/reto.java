package ejercicios_java_4;

import java.util.Scanner;

public class reto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String texto;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduzca una frase");
		texto = leer1.next();
		
		int num = 0;
		char textoNuevo = texto.charAt(num);
		
		System.out.println(textoNuevo);
		
		leer1.close();
		

	}

}
