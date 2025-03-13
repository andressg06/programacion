package Ejercicio_Grupal;

import java.util.*;

public class Universidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		ArrayList<Persona> personas = new ArrayList<>();
		int opcion;
		
		do {
			System.out.println("1. Agregar Estudiante");
			System.out.println("2. Agregar Profesor");
			System.out.println("3. Mostrar Personas");
			System.out.println("4. Salir");
			System.out.println("Seleccione una opción:");
			
			while (!leer.hasNextInt()) {
				System.out.println("Por favor, ingrese un número vádilo");
				leer.next();
			}
			
			opcion = leer.nextInt();
			leer.nextLine();
			
			switch (opcion) {
			
			case 1:
				try {
					System.out.println("Nombre:");
					String nombre = leer.nextLine();
					System.out.println("Apellidos:");
					String apellidos = leer.nextLine();
					System.out.println("NIF");
					String NIF = leer.nextLine();
					System.out.println("Calle:");
					String calle = leer.nextLine();
					System.out.println("Ciudad:");
					String ciudad = leer.nextLine();
					System.out.println("Codigo Postal:");
					int cod_postal = leer.nextInt();
					System.out.println("Pais:");
					String pais = leer.nextLine();
					System.out.println("ID del Estudiante:");
					int id_estudiante = leer.nextInt();
					
					personas.add(new Estudiante(nombre,apellidos,NIF,new Direccion(calle,ciudad,cod_postal,pais),id_estudiante));
					System.out.println("Estudiante creado con exito");
				} catch (Exception e) {
					System.out.println("Eror al añadir al estudiante: " + e.getMessage());
				}
				break;
				
			case 2:
				try {
					System.out.println("Nombre:");
					String nombre = leer.nextLine();
					System.out.println("Apellidos:");
					String apellidos = leer.nextLine();
					System.out.println("NIF");
					String NIF = leer.nextLine();
					System.out.println("Calle:");
					String calle = leer.nextLine();
					System.out.println("Ciudad:");
					String ciudad = leer.nextLine();
					System.out.println("Codigo Postal:");
					int cod_postal = leer.nextInt();
					System.out.println("Pais:");
					String pais = leer.nextLine();
					System.out.println("Despacho del profesor:");
					String despacho = leer.nextLine();
					
					personas.add(new Profesor(nombre,apellidos,NIF,new Direccion(calle,ciudad,cod_postal,pais),despacho));
					System.out.println("Profesor creado con exito");
				} catch (Exception e) {
					System.out.println("Error al añadir al profesor: " + e.getMessage());
				}
				break;
				
			case 3:
				System.out.println("Lista de Personas:");
				for (Persona p : personas) {
					System.out.println(p);
				}
				break;
				
			case 4:
				System.out.println("Saliendo del menu");
				break;
				
			default:
				System.out.println("Opción invalida");
			}
		} while (opcion != 4);
		leer.close();
	}

}
