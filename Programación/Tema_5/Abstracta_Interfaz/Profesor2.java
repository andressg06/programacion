package Abstracta_Interfaz;

//Hereda de la interfaz
public class Profesor2 implements Interfaz {
	//Atributo
		private String asignatura;
		private String nombre;
		private String apellido;

		//Constructor
		public Profesor2(String nombre, String apellido, String asignatura) {
			this.nombre = nombre;
			this.apellido = apellido;
			this.asignatura = asignatura;
		}
		
		//Metodo heredado de la interfaz
		@Override
		public void actividad() {
			System.out.println(nombre + " " + apellido + " esta enseñando " + asignatura);
		}
}
