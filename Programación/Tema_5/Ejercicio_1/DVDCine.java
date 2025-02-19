package Ejercicio_1;

public class DVDCine {
	
	//atributos
	private String titulo;
	private String director;
	private String actores;
	private String genero;
	private int duracion;
	private String resumen;
	
	//contructor
	public DVDCine(String titulo, String director, String actores, String genero, int duracion, String resumen) {
		this.titulo = titulo;
		this.director = director;
		this.actores = actores;
		this.genero = genero;
		this.duracion = duracion;
		this.resumen = resumen;
	}
	
	//metodos
	public void muestraDVDCine() {
		System.out.println(titulo + " De: " + director);
		System.out.println("Con: " + actores);
		System.out.println(genero + " - " + duracion + " min.");
		System.out.println("Resumen: " + resumen);
	}
	
	public boolean esThriller() {
		if (genero == "Thriller") {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean tieneResumen() {
		if (resumen == "") {
			return false;
		} else {
			return true;
		}
	}
	
	public String muestraDuracion() {
		return duracion + " min .";
	}
	
}
