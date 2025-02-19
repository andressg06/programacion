package Ejercicio_16;

public class Mago extends Personajes {
	private String poder;

	public Mago(String nombre, String poder) {
		super(nombre, 100);
		this.poder = poder;
	}
		public String encantar() {
			if (energia >= 2) {
				energia -= 2;
				return nombre + " uso el poder " + poder;
			} else {
				return nombre + " no tiene energia suficiente para usar su poder";
			}
		}
	
	

}
