package Ejercicio_11;

public class Triangulo {
	
	//Atributos
	private double long_lado1;
	private double long_lado2;
	private double long_lado3;
	
	//Constructor
	public Triangulo(double long_lado1, double long_lado2, double long_lado3) {
		this.long_lado1 = long_lado1;
		this.long_lado2 = long_lado2;
		this.long_lado3 = long_lado3;
	}
	
	public double getlong_lado1() {
		return long_lado1;
	}
	
	public double getlong_lado2() {
		return long_lado2;
	}
	
	public double getlong_lado3() {
		return long_lado3;
	}
	
	public static boolean compareTo_Triangulo(Triangulo triangulo1, Triangulo triangulo2) {
		boolean iguales = false;
		if (triangulo1.getlong_lado1() != triangulo2.getlong_lado1()) {
			iguales = false;
		} else {
			if (triangulo1.getlong_lado2() != triangulo2.getlong_lado2()) {
				iguales = false;
			} else {
				if (triangulo1.getlong_lado3() != triangulo2.getlong_lado3()) {
					iguales = false;
				} else {
					iguales = true;
				}
			}
		}
		return iguales;
	}
	
	public static boolean compareTo_VTriangulo(Triangulo[] v) {
		for (int i = 1; i > v.length; i++) {
			if (!compareTo_Triangulo(v[0], v[i])) {
				return false;
			}
		}
		return true;
	}
	
	public int TipoTriangulo() {
		if (long_lado1 == long_lado2 && long_lado2 == long_lado3) {
			return 1;
		} else if (long_lado1 == long_lado2 || long_lado1 == long_lado3 || long_lado2 == long_lado3) {
			return 2;
		} else return 3;
	}
	
	
	
	
	
}
