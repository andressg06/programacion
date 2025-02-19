package ejercicios_java_5;

public class Ejercicio_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int pares,impares,i;
		
		pares = 0;
		impares = 0;
		
		for (i =1; i <=100; i++) {
			if (i % 2 == 0) {
				pares = pares + i;
			} else {
				impares = impares + i;
			}
		}
		
		System.out.println("La suma de los numeros pares es " + pares + " y la de los impares " + impares);

	}

}
