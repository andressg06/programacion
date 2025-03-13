package Red_Social;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 RedSocial redSocial = new RedSocial();

	        redSocial.agregarAmigo(new usuario("Juan", 25));
	        redSocial.agregarAmigo(new usuario("Maria", 19));
	        redSocial.agregarAmigo(new usuario("Pedro", 30));
	        redSocial.agregarAmigo(new usuario("Laura", 16));
	        redSocial.agregarAmigo(new usuario("Carlos", 22));
	        redSocial.agregarAmigo(new usuario("Ana", 14));

	        System.out.println("Lista de amigos antes de eliminar:");
	        redSocial.mostrarAmigos();

	        int edadMinima = 18;
	        redSocial.eliminarAmigosMenores(edadMinima);
	        
	        System.out.println("\nLista de amigos después de eliminar menores de " + edadMinima + " años:");
	        redSocial.mostrarAmigos();

	        System.out.println("\nBuscando a Pedro:");
	        redSocial.buscarAmigo("Pedro");
	    }	
	}
