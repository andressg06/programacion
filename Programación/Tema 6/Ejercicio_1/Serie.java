package Ejercicio_1;

public class Serie implements Reproducible {
	private String titulo;
	
	public Serie(String titulo) {
		this.titulo = titulo;
	}
	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo serie: " + titulo);
	}
	
	@Override
	public void pausar() {
		System.out.println("Serie pausada: " + titulo);
	}
	
	@Override
	public TipoContenido obtenerTipoContenido() {
		return TipoContenido.SERIE;
	}
}
