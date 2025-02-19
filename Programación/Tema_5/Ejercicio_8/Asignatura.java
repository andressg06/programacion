package Ejercicio_8;

public class Asignatura {
	//Atributos
	private String nombre;
	private double nota;
		
	//Constructor
	public Asignatura(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
		
	//Getters
	public void getNota() {
		System.out.println("La nota es " + nota);
	}
		
	//Setters
	public void setNota(int nuevanota) {
		nota = nuevanota;
	}
		
	public void valoracion() {
		if (nota >= 5) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Suspenso");
		}
	}
		
	public void ConsultarAsignatura() {
		System.out.println("La asignatura es " + nombre);
	}
}
