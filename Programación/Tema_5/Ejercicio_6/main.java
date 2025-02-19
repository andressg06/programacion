package Ejercicio_6;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona persona1 = new Persona();
		persona1.CargarDatos();
		persona1.ImprimirDatos();
		
		Empleado empleado1 = new Empleado();
		empleado1.CargarDatos();
		empleado1.CargarSueldo();
		empleado1.ImprimirDatos();
		empleado1.ImprimirSueldo();
		
	}

}
