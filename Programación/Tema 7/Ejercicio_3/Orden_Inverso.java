package Ejercicio_3;

import java.util.Iterator;
import java.util.List;

public class Orden_Inverso implements Iterator<String> {
		List<String> lista;
		int posicion;
		
		 public Orden_Inverso(List<String> lista) {
			this.lista = lista;
			this.posicion = lista.size() - 1;
		}
		 
		 public boolean hasNext() {
			 return posicion >= 0;
		 }
		 
		 public String next() {
			 if (hasNext()) {
				 return lista.get(posicion);
			 }
		 }
		 
		 public static void main(String[] args) {
		//	 List<String> palabras = List.
		 }
}
