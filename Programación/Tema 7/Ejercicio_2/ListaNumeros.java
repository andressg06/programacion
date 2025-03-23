package Ejercicio_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaNumeros {
	
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		
		System.out.println(numeros);
		
		Iterator<Integer> it = numeros.iterator();
		
		while (it.hasNext()) {
			if (it.next() % 2 != 0) {
				it.remove();
			}
		}
		
		System.out.println(numeros);

	}
}
