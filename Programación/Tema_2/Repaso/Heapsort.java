package Repaso;

public class Heapsort {

	// Construir Max-Heap
	public static void MaxHeap(int[] array) {
		
		int n = array.length;

		// Posicionarse en el ultimo numero del arbol
		for (int i = n / 2 - 1; i >= 0; i--) {
			ordenar(array, n, i);
		}
	}

	// Ordenar el arbol
	private static void ordenar(int[] array, int n, int i) {
		int mayor = i; // Damos por hecho que el actual es el mayor
		int izq = 2 * i + 1; // Índice del hijo izquierdo
		int dere = 2 * i + 2; // Índice del hijo derecho

		// Si el hijo izquierdo es más grande que el actual
		if (izq < n && array[izq] > array[mayor]) {
			mayor = izq;
		}

		// Si el hijo derecho es más grande que el actual
		if (dere < n && array[dere] > array[mayor]) {
			mayor = dere;
		}

		// Si el mayor no es el actual, hacemos un intercambio
		if (mayor != i) {
		    int guardar = array[i];
		    array[i] = array[mayor];
		    array[mayor] = guardar;

		// Recursivamente ordenamos el arbol completo
		ordenar(array, n, mayor);
		}
		
	}
		
		// Heapsort completo
	    public static void heapsort(int[] array) {
	        int n = array.length;

	       
	        MaxHeap(array);

	        // Extraer los numeros
	        for (int i = n - 1; i > 0; i--) {
	            // Mover el mayor al final
	            int temp = array[0];
	            array[0] = array[i];
	            array[i] = temp;

	            
	            ordenar(array, i, 0);
	        }
	    }
	

	// Método principal
	public static void main(String[] args) {
		int[] array = {12,48,56,38,3,99};
		System.out.println("Arreglo original:");
		mostrar(array);

		heapsort(array);

		System.out.println("Arreglo convertido en Max-Heap:");
		mostrar(array);
	}
	
	// Imprimir el resultado por pantalla
	private static void mostrar(int[] array) {
		for (int num : array) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}


