package Ejercicio_1;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class ListaPalabras implements Iterable<String> {
	private List<String> palabras;

    // Constructor
    public ListaPalabras() {
        this.palabras = new ArrayList<>();
    }

    // Método para agregar una palabra a la lista
    public void agregarPalabra(String palabra) {
        palabras.add(palabra);
    }

    // Método para obtener el iterador
    @Override
    public Iterator<String> iterator() {
        return palabras.iterator();
    }
}
