package Implementacion_UML;

import java.util.*;

public class main {

	public static void main(String[] args) {
		
			Coche miCoche = new Estandar("Toyota", 12345, 15000f, 18000f, 4)
                .setCarroceria(new Carroceria("Rojo", "Nueva"))
                .setMotor(new Motor("ABC123456"))
                .addRuedas(new Ruedas(16, "Nueva"))
                .addRuedas(new Ruedas(16, "Nueva"))
                .addReparaciones(new Reparacion(new Date()));
		
		//Ruedas ruedas = new Ruedas(16,"Nueva");
		//miCoche.agregarRueda(ruedas);
		miCoche.agregarRueda(new Ruedas(16,"Nueva"));
		
		  Carroceria carroceria = new Carroceria("Rojo", "Nueva");

	        // Crear un motor
	        Motor motor = new Motor("457349ADF");
		
		ArrayList<Ruedas> rueda = new ArrayList<>();
        rueda.add(new Ruedas(17.5f, "Nueva"));
        rueda.add(new Ruedas(17.5f, "Nueva"));
        rueda.add(new Ruedas(17.5f, "Nueva"));
        rueda.add(new Ruedas(17.5f, "Renovada"));
        
        Coche monovolumen = new Monovolumen("Hyundai", 1001, 25000,32000,carroceria,motor, rueda, 7);
        
        Carroceria carro = new Carroceria("Rojo", "Nueva");

        // Crear un motor
        Motor moto = new Motor("457349ADF");
	
	ArrayList<Ruedas> ruedas = new ArrayList<>();
    ruedas.add(new Ruedas(17.5f, "Nueva"));
    ruedas.add(new Ruedas(17.5f, "Nueva"));
    ruedas.add(new Ruedas(17.5f, "Nueva"));
    ruedas.add(new Ruedas(17.5f, "Renovada"));
    
    Coche monovolumen2 = new Monovolumen("Hyundai", 1001, 25000,32000,carro,moto, ruedas, 7);
        
		//miCoche.addReparaciones(new Reparacion(new Date()));
		
		System.out.println(miCoche);
		System.out.println(monovolumen);
		
	}
}
