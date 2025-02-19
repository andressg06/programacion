package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_13 {

	public static void main(String[] args) 

	{
		
		int dia_salida,hora_salida,minuto_salida,dia_llegada,hora_llegada,minuto_llegada,suma1,suma2,tiempo;
		String mañana_tarde1,mañana_tarde2;

		Scanner leer = new Scanner(System.in);

		System.out.println("Introduzca el día de salida:");
		dia_salida = leer.nextInt();

		System.out.println("Introduzca la hora de salida:");
		hora_salida = leer.nextInt();

		System.out.println("Introduzca el minuto de salida: ");
		minuto_salida = leer.nextInt();
		
		System.out.println("Introduzca si es am o pm: ");
		mañana_tarde1 = leer.nextLine();

		System.out.println("Introduzca el día de su llegada:");
		dia_llegada = leer.nextInt();

		System.out.println("Introduzca la hora de su llegada:");
		hora_llegada = leer.nextInt();

		System.out.println("Introduzca el minuto de su llegada: ");
		minuto_llegada = leer.nextInt();

		System.out.println("Introduzca si es am o pm: ");
		mañana_tarde2 = leer.nextLine();

		if (mañana_tarde1 == ("pm") && hora_salida != 12) {
            hora_salida += 12; 
        } else if (mañana_tarde1 == ("am") && hora_salida == 12) {
        	hora_salida = 0;
        	}
		
        if (mañana_tarde2 == ("pm") && hora_llegada != 12) {
        	hora_llegada += 12; 
        } else if (mañana_tarde2 == ("am") && hora_llegada == 12) {
            hora_llegada = 0; 
            }

        suma1 = (dia_salida * 24 * 60) + (hora_salida * 60) + minuto_salida;
        suma2 = (dia_llegada * 24 * 60) + (hora_llegada * 60) + minuto_llegada;
        
        tiempo = suma2 - suma1;

        if (tiempo < 0) {
        	System.out.println("La fecha no concuerda");
        } else {

        	System.out.println("El tiempo transcurrido es de " + tiempo + " minutos");
        	}
        
        leer.close();

	}
}
