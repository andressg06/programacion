package Ejercicio_1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Indique el titulo de la pelicula");
		String titulo = leer.nextLine();
		
		System.out.println("Indique el nombre del director");
		String director = leer.nextLine();
		
		System.out.println("Indique el nombre de los actores que participan en la cinta");
		String actores = leer.nextLine();
		
		System.out.println("Indique el genero de la pelicula");
		String genero = leer.nextLine();
		
		System.out.println("Indique la duracion de la pelicula");
		int duracion = leer.nextInt();
		leer.nextLine();
		
		System.out.println("Haga un breve resumen de la pelicula");
		String resumen = leer.nextLine();
		
		DVDCine c1 = new DVDCine(titulo,director,actores,genero,duracion,resumen);
		
		c1.muestraDVDCine();
		System.out.println(c1.esThriller());
		System.out.println(c1.muestraDuracion());
		
		leer.close();
	}
}
