package Ejercicio_17;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
        Plaza plaza = new Plaza(1);
        int num;

        do {
            System.out.println("--- PLAZA APARCAMIENTO ---");
            System.out.println("1. Aparcar coche");
            System.out.println("2. Sacar coche");
            System.out.println("3. Ver coche aparcado");
            System.out.println("4. Salir de la aplicación");
            System.out.print("Opción: ");
            num = leer.nextInt();
            
            switch (num) {
                case 1:
                    if (!plaza.esDisponible()) {
                        System.out.println("Plaza ya ocupada.");
                    } else {
                        System.out.print("Ingrese la matrícula: ");
                        String matricula = leer.nextLine();
                        System.out.print("Ingrese la marca: ");
                        String marca = leer.nextLine();
                        System.out.print("Ingrese el modelo: ");
                        String modelo = leer.nextLine();
                        Coche coche = new Coche(matricula, marca, modelo);
                        plaza.aparcarCoche(coche);
                    }
                    break;

                case 2:
                    plaza.sacarCoche();
                    break;

                case 3:
                    plaza.verCocheAparcado();
                    break;

                case 4:
                    System.out.println("\n--- ESTADO FINAL DE LA PLAZA ---");
                    plaza.mostrarEstadoPlaza();
                    System.out.println("Saliendo de la aplicación...");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (num != 4);

        leer.close();
		
	}

}
