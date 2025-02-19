package Examen;

import java.util.Random;
import java.util.Scanner;

public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creacion de metodos
		Scanner leer = new Scanner(System.in);
		Random aleatorio = new Random();
		
		//Creacion de variables
		int televisores = 50, portatiles = 300, moviles = 100,num_random;
		
		//Bucle for para hacer cada dia de la semana
		for (int i = 1;i <= 30; i++) {
			
			//Cada 7 dias se suman los productos reabastecidos
			int semana = 7;
			if (i == semana) {
				televisores = televisores + 10;
				portatiles = portatiles + 8;
				moviles = moviles + 20;
				semana =+ 7;
			}
			
			//Se restan los productos que se venden cada dia
			televisores = televisores - 2;
			portatiles = portatiles - 3;
			moviles = moviles - 5;
			
			//Eventos Especiales
			num_random = aleatorio.nextInt(100);
			if (num_random >= 20) {
				if (num_random > 0 && num_random <= 10) {
					televisores = televisores + 5;
				} else {
					if (num_random > 10 && num_random <= 15) {
						portatiles = portatiles - 8;
					} else {
						if (num_random > 15 && num_random <=20) {
							moviles = moviles + 3;
						}
					}
				}
			}
			
			//Mensaje de cada dia
			if (i == semana) {
				System.out.println("Día " + i + ": Reabastecimiento semanal. Televisores = " +televisores + ", Portatiles = " +portatiles + ", Móviles = " +moviles);
			}
			System.out.println("Día " + i + ": Televisores = " +televisores + ", Portatiles = " +portatiles + ", Móviles = " +moviles);
			
			//Si algun producto tiene menos de 5 unidades
			if (portatiles <= 5 && portatiles > 0) {
				System.out.println("Inventario critico de " + portatiles);
			} else {
				if (moviles <= 5 && moviles > 0) {
					System.out.println("Inventario critico de " + moviles);
				} else {
					if (televisores <= 5 && televisores > 0){
						System.out.println("Inventario critico de " +televisores);
					}
				}
			}
		}
	leer.close();
	}
}
