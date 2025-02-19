package Ejercicio_14;

public class Marte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marciano et1 = new Marciano("Hutt");
		Marciano et2 = new Marciano("Wookie");
		Marciano et3 = new Marciano("Raftar");
		
		et2.muere();
		
		Marciano et4 = new Marciano("Twi'lek");
		
		et2.muere();
		
		Marciano[] marcianos = {et1,et2,et3,et4};
		for (int i = 0; i < marcianos.length; i++) {
			marcianos[i].estaVivo();
		}
		
	}

}
