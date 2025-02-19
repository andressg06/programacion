package ejercicios_java_5;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int importecomision,kilo_recorrido,dias_desplazados,dieta;
		double comision,suma,irpf,seg_social,sueldofijo,liquido;
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduce tu sueldo fijo");
		sueldofijo = leer.nextInt();
		
		System.out.println("Introduce las ganancias del importe de las ventas");
		importecomision = leer.nextInt();
		
		System.out.println("Introduce los kilometros recorridos");
		kilo_recorrido = leer.nextInt();
		
		System.out.println("Introduce los dias desplazados");
		dias_desplazados = leer.nextInt();
		
		comision = importecomision * 0.05;
		
		dieta = 60 * dias_desplazados;
		
		suma = sueldofijo + comision + kilo_recorrido + dieta;
		
		seg_social = 150;
		
		irpf = sueldofijo * 0.18;
		
		liquido = suma - irpf - seg_social;
		
		System.out.println("El sueldo fijo es: " + sueldofijo);
		System.out.println("Comisión (5% de las ventas): " + comision);
		System.out.println("Kilometraje: " + kilo_recorrido);
		System.out.println("Dietas: " + dieta);
		System.out.println("Retencion de la Seguridad Social : " + seg_social);
		System.out.println("Retencion de IRPF: " + irpf);
		System.out.println("Sueldo liquido: " + liquido);
		
		leer.close();
	}

}
