package Ejercicio_13;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Alimento alimento1 = new Alimento("manzana", 19, 30, 40, false, 'A', 'B');
		
		System.out.println(alimento1.esDietetico());
		
		alimento1.muestraAlimento();
		
	}

}
