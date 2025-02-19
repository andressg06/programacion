package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double pro,len,base,entor,sist,fol,media;
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Porfavor introduzca la nota de Programación:");
		pro = leer1.nextDouble();
		System.out.println("Introduzca la nota de Lenguajes de Marcas:");
		len = leer1.nextDouble();
		System.out.println("Introduzca la nota de Bases de Datos:");
		base = leer1.nextDouble();
		System.out.println("Introduzca la nota de Entornos de Desarrollo:");
		entor = leer1.nextDouble();
		System.out.println("Introduzca la nota de Sistemas Informáticos:");
		sist = leer1.nextDouble();
		System.out.println("Por ultimo, introduzca la nota de Formación y Orientación Laboral:");
		fol = leer1.nextDouble();
		
		media = (fol+sist+entor+base+len+pro)/6;
		
		System.out.println("Su nota media del curso es de: " +media);
		
		leer1.close();
		
	}

}
