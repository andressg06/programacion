package Ejercicio_13;

public class Alimento {
	
	//Atributos
	private String nombre;
	private double lipidos;
	private double hidratos;
	private double proteinas;
	private boolean animal;
	private char vitaminas;
	private char minerales;
	
	//Constructores
	public Alimento(String nombre) {
		this.nombre = nombre;
	}

	public Alimento(String nombre, double lipidos, double hidratos, double proteinas, boolean animal, char vitaminas, char minerales) {
		this.nombre = nombre;
		this.lipidos = lipidos;
		this.hidratos = hidratos;
		this.proteinas = proteinas;
		this.animal = animal;
		this.vitaminas = vitaminas;
		this.minerales = minerales;
	}
	
	//Metodos
	public boolean esDietetico() {
		if (lipidos < 20.0 && vitaminas != 'B') {
			return true;
		} return false;
	}
	
	public void muestraAlimento() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Lipidos: " + lipidos);
		System.out.println("Hidratos: " + hidratos);
		System.out.println("Proteinas: " + proteinas);
		System.out.println("¿Es de origen Animal?: " + animal);
		System.out.println("Vitaminas: " + vitaminas);
		System.out.println("Minerales: " + minerales);
	}
	
	
}
