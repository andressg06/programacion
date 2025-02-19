package Ejercicio_1;

public class Pelicula implements Reproducible {
	private String titulo;
	
	public Pelicula(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo pelicula: " + titulo);
	}
	
	@Override
	public void pausar() {
		System.out.println("Pelicula pausada: " + titulo);
	}
	
	@Override
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.PELICULA;
	}
}
