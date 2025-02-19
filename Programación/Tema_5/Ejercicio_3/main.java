package Ejercicio_3;

public class main {

	public static void main(String[] args) {
		
		Cuenta cuenta1 = new Cuenta(78254135,1000.0,2.7);
		cuenta1.mostrarCuenta();
		
		cuenta1.ingresar(1000);
		cuenta1.retirar(500);
		cuenta1.actualizarSaldo();
		cuenta1.mostrarCuenta();
	
		Cuenta cuenta2 = new Cuenta(78254135,1000.0,2.7);
		cuenta2.mostrarCuenta();
		
		//cuenta1.ingresar(1000);
		//cuenta1.retirar(500);
		//cuenta1.actualizarSaldo();
		//cuenta1.mostrarCuenta();
		
	}

}
