package ejercicios_java_1;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num, absoluto, resto;
		Scanner leer1 = new Scanner (System.in);
		
		System.out.print("Dime un numero");
		num = leer1.nextInt();
		
		absoluto = Math.abs(num);
		resto = num%2;
		System.out.print("El valor absoluto es " +absoluto);
		System.out.println("El resto de dividir " + num + " entre 2 es " + resto);
		
		leer1.close();
	}

}
