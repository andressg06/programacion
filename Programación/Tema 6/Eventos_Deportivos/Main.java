package Eventos_Deportivos;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	            Carrera carrera = new Carrera("Maratón", LocalDate.now(), "Ciudad", 42.195);
	            Participante p1 = new Participante("Juan", "Perez", 25);
	            Participante p2 = new Participante("Maria", "Gomez", 28);
	            carrera.inscribirParticipante(p1);
	            carrera.inscribirParticipante(p2);
	            System.out.println("Ganador de la carrera: " + carrera.obtenerGanador());

	            TorneoDeFutbol torneo = new TorneoDeFutbol("Copa", LocalDate.now(), "Estadio");
	            Equipo equipo1 = new Equipo("Leones");
	            Equipo equipo2 = new Equipo("Tigres");
	            equipo1.añadirJugador(p1);
	            equipo2.añadirJugador(p2);
	            equipo1.setPuntos(10);
	            equipo2.setPuntos(15);
	            torneo.inscribirEquipo(equipo1);
	            torneo.inscribirEquipo(equipo2);
	            System.out.println("Ganador del torneo: " + torneo.obtenerGanador());
	        } catch (ParticipanteNoValidoException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	}

}
