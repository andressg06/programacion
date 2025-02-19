package Ejercicio_9;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Direccion direccion1 = new Direccion("Calle Jabugo", 39, "2ºIzquierda", "Sevilla");
		Direccion direccion2 = new Direccion("Calle Samaniego", 48, "4ºD", "Sevilla");
		Direccion direccion3 = new Direccion("Calle Zabulon", 8, "", "Mairena del Alcor");
		
		Empleado empleado1 = new Empleado("Andres Garcia", 1200, direccion1);
		Empleado empleado2 = new Empleado("Abraham Exposito", 1200, direccion2);
		Empleado empleado3 = new Empleado("Ainhoa Vidal", 1300, direccion3);
		
		System.out.println("EMPLEADO 1: ");
		empleado1.mostrarDatos();
		System.out.println("EMPLEADO 2: ");
		empleado2.mostrarDatos();
		System.out.println("EMPLEADO 3: ");
		empleado3.mostrarDatos();
	}

}
