package Ejercicio_16;

public class Guerrero extends Personajes {
	private String arma;

	public Guerrero(String nombre, String arma, int energia) {
		super(nombre, energia);
		this.arma = arma;
	}
	
	public String combatir(int cantidad) {
		if (cantidad > energia) {
			energia =  0;
		} else {
			energia -= cantidad;
		}
		return "Ataco con " + arma + " gastando " + cantidad + " de energia";
	}
	
	
}
