package Ejercicio_14;

public class Marciano {
	private boolean vivo = false;
	private String nombre;
	private static int numMarcianos = 0;
	
	public Marciano(String nombre) {
		this.nombre = nombre;
		vivo = true;
		numMarcianos = numMarcianos + 1;
		nace();
		cuentaMarcianos();
	}
	
	public void nace() {
		System.out.println("Hola, he nacido y soy el marciano " + nombre);
	}
	
	public void muere() {
		if (vivo == true) {
		vivo = false;
		numMarcianos = numMarcianos - 1;
		System.out.println("El marciano " + nombre + " ha muerto");
		} else {
			System.out.println("El marciano ya esta muerto");
		}
	}
	
	public void estaVivo() {
		String vivo_no;
		if (vivo == true) {
			vivo_no = "esta vivo";
		} else {
			vivo_no = "no esta vivo";
		}
		System.out.println(nombre + " " + vivo_no);
	}
	
	public static void cuentaMarcianos() {
		System.out.println("Hay " + numMarcianos + " marcianos vivos");
	}
	
	
}
