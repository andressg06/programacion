package Abstracta_Interfaz;

//Hereda de la interfaz
public class Alumno2 implements Interfaz {
	//Atributo
		private String grado;
		private String nombre;
		private String apellido;

		//Constructor
		public Alumno2(String nombre, String apellido, String grado) {
			this.nombre = nombre;
			this.grado = grado;
			this.apellido = apellido;
		}
		
		//Metodo heredado de la interfaz
		@Override
		public void actividad() {
			System.out.println(nombre + " " + apellido + " esta estudiando " + grado );
		}
}
