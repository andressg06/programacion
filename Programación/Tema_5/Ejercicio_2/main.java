package Ejercicio_2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo coche1 = new Vehiculo("Seat");
		
		coche1.getcRuedas();
		coche1.getpotencia();
		
		coche1.setcRueda(true);
		coche1.setpotencia(15.2);
		
		coche1.getpotencia();
		coche1.getcRuedas();
		
		coche1.imprimir();

	}

}
