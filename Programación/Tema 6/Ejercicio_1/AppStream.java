package Ejercicio_1;

import java.util.*;

public class AppStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Selecciona el contenido");
		System.out.println("1. Música");
		System.out.println("2. Película");
		System.out.println("3. Serie");
		System.out.println("4. Podcast");
		int opcion = leer.nextInt();
		leer.nextLine();
		
		System.out.println("Ingrese el título:");
		String titulo = leer.next();
		
		Reproducible contenido = null;
		
		switch (opcion) {
		case 1:
			contenido = new Musica(titulo);
			break;
		case 2:
			contenido = new Pelicula(titulo);
			break;
		case 3:
			contenido = new Serie(titulo);
			break;
		case 4:
			contenido = new Podcast(titulo);
			break;
		default:
			System.out.println("Opción no válida");
			return;
		}
		
		contenido.reproducir();
		
		System.out.println("¿Desea pausar la reproducción? (s/n)");
		String res = leer.next();
		
		if (res.equalsIgnoreCase("s")) {
			contenido.pausar();
		}
		
		System.out.println("Tipo de contenido: " + contenido.obtenerTipoContenido());
	}

}
