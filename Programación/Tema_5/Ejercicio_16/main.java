package Ejercicio_16;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Guerrero guerrero1 = new Guerrero("Abraham", "mazo", 30);
		Mago mago1 = new Mago("Daniel", "Rayos");
		
		System.out.println(mago1.encantar());
		
		guerrero1.combatir(20);
		
		guerrero1.alimentarse(10);
		
	}

}
