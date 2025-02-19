package Ejercicio_17;

public class Plaza {
	private int num_plaza;
	private Coche cocheAparcado;
	private boolean disponible = true;
	private int contabilizar = 0;
	
	public Plaza(int num_plaza) {
		this.num_plaza = num_plaza;
	}
	
	public int getnum_plaza() {
		return num_plaza;
	}
	
	public Coche getcocheAparcado() {
		return cocheAparcado;
	}
	
	public boolean getdisponible() {
		return disponible;
	}
	
	public int contabilizar() {
		return contabilizar;
	}
	
	public void setnum_plaza(int nuevanum_plaza) {
		num_plaza = nuevanum_plaza;
	}
	
	public void setcocheAparcado(Coche nuevococheAparcado) {
		cocheAparcado = nuevococheAparcado;
	}
	
	public void setdisponible(boolean nuevodisponible) {
		disponible = nuevodisponible;
	}
	
	public void setcontabilizar(int nuevocontabilizar) {
		contabilizar = nuevocontabilizar;
	}
	
	public void mostrarDatos() {
		System.out.println("El numero de plaza es " + num_plaza + " ,el coche aparcado es " + cocheAparcado);
		System.out.println("¿La plaza esta disponible?" + disponible);
		System.out.println("El numero de coches que ha aparcado en esa plaza es " + contabilizar);
	}
	
	public void mostrarCocheAparcado() {
        if (disponible) {
            System.out.println("Plaza libre");
        } else {
            System.out.println("Plaza ocupada: ");
            cocheAparcado.mostrarDatos();
        }
    }
	
	public boolean esDisponible() {
        return disponible;
    }
	
	  public void aparcarCoche(Coche coche) {
	        if (!disponible) {
	            System.out.println("Plaza ya ocupada.");
	            return;
	        }
	  }
	  
	  public void sacarCoche() {
	        if (disponible) {
	            System.out.println("ERROR, NO HAY COCHE EN LA PLAZA DE APARCAMIENTO. LA PLAZA ESTÁ LIBRE.");
	            return;
	        }
	        System.out.println("PLAZA LIBRE. EL COCHE " + cocheAparcado.getmatricula() + " HA SALIDO DE LA PLAZA.");
	        this.cocheAparcado = null;
	        this.disponible = true;
	  }
	  
	  public void verCocheAparcado() {
	        if (disponible) {
	            System.out.println("LA PLAZA ESTÁ LIBRE.");
	        } else {
	            System.out.println("COCHE APARCADO: ");
	            cocheAparcado.mostrarDatos();
	        }
	  }
	  
	  public void mostrarEstadoPlaza() {
	        System.out.println("Número de plaza: " + num_plaza);
	        verCocheAparcado();
	        System.out.println("Total de coches que han aparcado: " + cocheAparcado);
	    }
	  
}
