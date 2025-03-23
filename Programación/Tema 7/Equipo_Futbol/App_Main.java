package Equipo_Futbol;

import java.util.Arrays;

public class App_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
            Equipo equipo = new Equipo("Los Campeones");
            equipo.agregarFutbolista(new Futbolista("Juan Perez", 28, Posicion.Portero, 5, Arrays.asList("Real Madrid", "Barcelona"), 10));
            equipo.agregarFutbolista(new Futbolista("Carlos Gomez", 30, Posicion.Defensa, 7, Arrays.asList("Atletico"), 8));
            equipo.agregarFutbolista(new Futbolista("Luis Fernández", 26, Posicion.Centrocampista, 4, Arrays.asList("Sevilla"), 5));
            equipo.agregarFutbolista(new Futbolista("Pedro López", 25, Posicion.Delantero, 6, Arrays.asList("Valencia"), 12));
            equipo.agregarFutbolista(new Futbolista("Andrés Torres", 27, Posicion.Defensa, 5, Arrays.asList("Villarreal"), 7));
            equipo.agregarFutbolista(new Futbolista("Roberto Silva", 29, Posicion.Defensa, 6, Arrays.asList("Espanyol"), 9));
            equipo.agregarFutbolista(new Futbolista("Diego Martínez", 24, Posicion.Defensa, 3, Arrays.asList("Betis"), 3));
            equipo.agregarFutbolista(new Futbolista("Fernando Ruiz", 31, Posicion.Defensa, 8, Arrays.asList("Celta"), 11));
            equipo.agregarFutbolista(new Futbolista("Javier Muñoz", 23, Posicion.Defensa, 2, Arrays.asList("Getafe"), 2));
            
            equipo.agregarFutbolista(new Futbolista("Marcelo Diaz", 32, Posicion.Defensa, 10, Arrays.asList("Alavés"), 15));
            
        } catch (RegistroFutbolistaException e) {
            System.out.println("Error: " + e.getMessage());
        }
		
		System.out.println("Formación del equipo:");
		Equipo equipo = new Equipo("Los Campeones");
		equipo.listarFormacionDelEquipo();

	}
}
