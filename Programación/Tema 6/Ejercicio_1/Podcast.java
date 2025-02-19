package Ejercicio_1;

public class Podcast implements Reproducible {
	private String titulo;
	
	public Podcast(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo podcast: " + titulo);
	}
	
	@Override
	public void pausar() {
		System.out.println("Podcast pausada: " + titulo);
	}
	
	@Override
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.PODCAST;
	}
}
