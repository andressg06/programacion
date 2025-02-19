package Ejercicio_12;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleado empleado1 = new Empleado("Andrés", 45, 14);
		Empleado empleado2 = new Empleado("Sandra", 40, 10);
		Empleado empleado3 = new Empleado("Gracia", 35, 10);
		
		empleado1.CalcularSueldo();
		empleado2.CalcularSueldo();
		empleado3.CalcularSueldo();
		
		empleado1.MostrarDatos();
		empleado2.MostrarDatos();
		empleado3.MostrarDatos();
		
	}

}
