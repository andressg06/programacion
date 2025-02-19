package Ejercicio_1;

public class Musica implements Reproducible {
	private String titulo;
	
	public Musica(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo música: " + titulo);
	}
	
	@Override
	public void pausar() {
		System.out.println("Música pausada: " + titulo);
	}
	
	@Override
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.MUSICA;
	}
}
