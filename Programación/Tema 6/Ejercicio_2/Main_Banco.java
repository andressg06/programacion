package Ejercicio_2;

/**
 * Clase para probar la Cuenta Bancaria.
 */
public class Main_Banco {

	/**
	 * Metodo principal
	 * 
	 *
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crear cuenta bancaria
		CuentaBancaria cuenta = new CuentaBancaria(1500);
		
		//Depositar dinero en la cuenta(va a dar error)
		cuenta.depositar(-10);
		
		//Retirar dinero de la cuenta(va a dar error)
		cuenta.retirar(2000);
		
	}

}
