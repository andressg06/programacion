package Ejercicio_1;

public class AppLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaPalabras lista = new ListaPalabras();
        lista.agregarPalabra("Hola");
        lista.agregarPalabra("Mundo");
        lista.agregarPalabra("Java");

        // Iterar sobre la lista usando un for-each
        for (String palabra : lista) {
            System.out.println(palabra);
        }
	}

}
