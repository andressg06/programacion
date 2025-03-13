package Repaso_Recuperacion;

import java.util.*;

public class Tarea_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese el numero de días de compras:");
		int dias = leer.nextInt();
		
		String[][] listaCompra = new String[dias][];
		
		for(int i = 0; i < listaCompra.length; i++) {
			System.out.println("Día " + (i + 1) + ":");
			System.out.println("Ingrese el número de artículos:");
			int num = leer.nextInt();
			
			listaCompra[i]= new String[num];
			
			for (int j = 0; j < num; j++) {
				System.out.println("Ingrese los nombres de los articulos:");
				String nombre = leer.next();
				
				listaCompra[i][j] = nombre;
			}	
		}
		
		System.out.println("Lista de Compras:");
		for(int i = 0; i < listaCompra.length; i++) {
			for (int j = 0; j < listaCompra[i].length; j++) {
				System.out.println("Día " + (i+1) + ":" + listaCompra[i][j] );
			}
		}
		
	}

}
