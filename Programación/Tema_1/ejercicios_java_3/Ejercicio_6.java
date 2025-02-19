package ejercicios_java_3;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uniDes;
		String uniIni;
		double num, resultado;
		boolean valido;
		
		
		Scanner leer1 = new Scanner(System.in);
		
		System.out.println("Introduce la unidad de longitud (cm, m, km)");
		uniIni = leer1.next();
		
		System.out.println("Introduce un número");
		num = leer1.nextInt();
		
		System.out.println("Intruce la unidad de longitud a la que quieres cambiarlo (cm, m ,km)");
		uniDes = leer1.next();
		
		switch (uniIni) {
		case "cm":
			resultado = uniDes.equals("m") ? num / 100 :
					uniDes.equals("km") ? num / 100000 : num ;
				break;
		case "m":
			resultado = uniDes.equals("cm") ? num * 100 :
				uniDes.equals("km") ? num / 1000 : num ;
			break;
		case "km":
			resultado = uniDes.equals("m") ? num * 1000 :
				uniDes.equals("cm") ? num * 100000 : num ;
			break;
		default:
			System.out.println("Unidad no valida");
			leer1.close();
			return;
		}
		
		valido = (uniIni.equals(uniDes)) ? false : true;
		
		if (valido) {
			System.out.println("El valor final es " + resultado + " " + uniDes);
		} else {
			System.out.println("Ambas unidades son iguales");
		}
		
		leer1.close();

	}

}
