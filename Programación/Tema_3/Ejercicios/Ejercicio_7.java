package Ejercicios;

public class Ejercicio_7 {

	    public static boolean sonDimensionesIguales(int[][] A, int[][] B) {
	        if (A.length != B.length) {
	            return false;
	        }
	        for (int i = 0; i < A.length; i++) {
	            if (A[i].length != B[i].length) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static int[][] compararMatrices(int[][] A, int[][] B) {
	        int filas = A.length;
	        int columnas = A[0].length;
	        int[][] M = new int[filas][columnas];

	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                M[i][j] = Math.max(A[i][j], B[i][j]); // Valor máximo en la posición actual
	            }
	        }
	        return M;
	    }
	    
	    public static void main(String[] args) {
	    	
	        int[][] A = {
	            {1, 2, 3},
	            {6, 7, 8},
	            {10, 8, 15}
	        };

	        int[][] B = {
	            {5, 1, 4},
	            {7, 3, 11},
	            {11, 12, 13}
	        };

	        if (sonDimensionesIguales(A, B)) {
	        	
	            int[][] M = compararMatrices(A, B);

	            System.out.println("Matriz M (valores máximos):");
	            for (int i = 0; i < M.length; i++) {
	                for (int j = 0; j < M[i].length; j++) {
	                    System.out.print(M[i][j] + " ");
	                }
	                System.out.println();
	            }
	        } else {
	            System.out.println("Las matrices no tienen las mismas dimensiones y no se pueden comparar.");
	        }
	    }
	}

