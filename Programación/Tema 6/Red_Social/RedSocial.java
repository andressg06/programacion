package Red_Social;

import java.util.ArrayList;

public class RedSocial {
	private ArrayList<usuario> amigos;
	
	public RedSocial() {
		this.amigos = new ArrayList<>();
	}
	
	public void agregarAmigo(usuario amigo) {
		amigos.add(amigo);
	}
	
	public void mostrarAmigos() {
		if (amigos.isEmpty()) {
			System.out.println("No tienes amigos en la lista.");
		} else {
			System.out.println("Lista de amigos:");
			for (usuario amigo : amigos) {
				System.out.println(amigo);
			}
		}
	}
		
		public void eliminarAmigosMenores(int edadMinima) {
			for (usuario amigo : amigos) {
				if (amigo.getEdad() < edadMinima) {
				} amigos.remove(amigo);
			}
		}
		
		
		public void buscarAmigo(String nombre) {
			for (usuario amigo : amigos) {
				if (amigo.getNombre().equalsIgnoreCase(nombre)) {
					System.out.println("Amigo encontrado: " + amigo);
					return;
				}
			}
			System.out.println("Amigo no encontrado.");
		}
}
