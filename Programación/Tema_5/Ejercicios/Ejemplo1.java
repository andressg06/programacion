package Ejercicios;

public class Ejemplo1 {
	
	private static int operaciones = 0;
	
	public static int suma(int a,int b) {
		operaciones++;
		return a + b;
	}
	
	public static int getOperaciones() {
		return operaciones;
	}
}
