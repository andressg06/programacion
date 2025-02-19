package Ejercicio_11;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangulo t1 = new Triangulo(5, 7, 2);
		Triangulo t2 = new Triangulo(5, 8, 2);
		Triangulo t3 = new Triangulo(7, 3, 5);
		Triangulo t4 = new Triangulo(5, 7, 2);
		
		System.out.println("Tipo: " + t1.TipoTriangulo());
		
		System.out.println("T1 y T2 : " + Triangulo.compareTo_Triangulo(t1,t3));
		
		Triangulo[] triangulos = {t1,t4,t2};
		System.out.println("Son iguales: " + Triangulo.compareTo_VTriangulo(triangulos));
	}

}
