package Ejercicios;

public class Televisor {
	
	//Atributos
	private int canal;
	private int volumen;
	private int color;
	
	//Constructores
	public Televisor() {canal = 1; volumen = 5; color = 7;}
	public Televisor(int valorCanal, int valorVolumen, int valorColor) {
		setCanal (valorCanal); setVolumen (valorVolumen); setColor (valorColor);
	}
	
	//Subir y Bajar
	public void subirCanal() {setCanal(canal + 1); getCanal();}
	public void bajarCanal() {setCanal(canal - 1); getCanal();}
	
	public void subirVolumen() {setVolumen(volumen + 1); getVolumen();}
	public void bajarVolumen() {setVolumen (volumen - 1); getVolumen();}
	
	public void subirColor() {setColor(color + 1); getColor();}
	public void bajarColor() {setColor(color - 1); getColor();}
	
	//Mostrar por pantalla
	public void getColor() {System.out.println("Color: " + color);}
	public void getVolumen() {System.out.println("Volumen: " + volumen);}
	public void getCanal() {System.out.println("Canal: " + canal);}
	
	//Operaciones
	public void setColor (int valorColor) {
		if (valorColor < 1)
			color = 1;
		else
			if (valorColor > 7)
				color = 7;
			else
				color = valorColor;
	}
	
	public void setVolumen (int valorVolumen){
		if (valorVolumen < 0)
			volumen = 0;
		else
			if (valorVolumen > 15)
				volumen = 15;
			else
				volumen = valorVolumen;
	}
	
	public void setCanal (int valorCanal) {
		if (valorCanal < 0) 
			canal = 10;
		else
			if (valorCanal >10)
				canal = 0;
			else
				canal = valorCanal;
	}
	
}
