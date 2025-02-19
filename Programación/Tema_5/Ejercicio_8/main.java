package Ejercicio_8;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alumno alumno1 = new Alumno("Andres Garcia", 18);
		Alumno alumno2 = new Alumno("Abraham Exposito", 17);
		Alumno alumno3 = new Alumno("Maria Soriano", 17);
		Asignatura asignatura1 = new Asignatura("Matematicas", 9);
		Asignatura asignatura2 = new Asignatura("Lengua",7);
		Asignatura asignatura3 = new Asignatura("Fisica", 6);
		
		alumno1.setAsignatura(asignatura1);
		alumno2.setAsignatura(asignatura2);
		alumno3.setAsignatura(asignatura3);
		
		alumno1.mostrarDatos();
		
	}

}
