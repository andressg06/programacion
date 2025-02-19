package Abstracta_Interfaz;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno1 = new Alumno("Andrés","García","DAM");
		Profesor profesor1 = new Profesor("Noelia","Cardoso","DAM");
		
		alumno1.actividad();
		profesor1.actividad();
		
		Alumno2 alumno2 = new Alumno2("Andrés","García","DAW");
		Profesor2 profesor2 = new Profesor2("Noelia","Cardoso","DAW");
		
		alumno2.actividad();
		profesor2.actividad();
		
	}

}
