package Ejercicio_Grupal;

public class Coche extends Vehiculo {
	private String marca;

	public Coche(String matricula, String marca) {
		super(matricula);
		this.marca = marca;
	}
	
	@Override
	public void mostrarDetalles() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Marca: " + marca);
	}
}
