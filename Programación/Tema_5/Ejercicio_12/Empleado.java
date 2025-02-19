package Ejercicio_12;

public class Empleado {
	
	//Atributos
	private String nombre;
	private int num_h;
	private int tarifa;
	private int sueldo_bruto;
	
	//Constructor
	public Empleado(String nombre, int num_h, int tarifa) {
		this.nombre = nombre;
		this.num_h = num_h;
		this.tarifa = tarifa;
	}
	
	//Getters
	public String getNombre() {
		return nombre;
	}
	
	public int getNum_h() {
		return num_h;
	}
	
	public int getTarifa() {
		return tarifa;
	}
	
	//Setters
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public void setNum_h(int nuevoNum_h) {
		num_h = nuevoNum_h;
	}
	
	public void setTarifa(int nuevaTarifa) {
		tarifa = nuevaTarifa;
	}
	
	//Metodos
	public int CalcularSueldo() {
		int horas = num_h;
		if (horas <= 40) {
			sueldo_bruto = horas * tarifa;
		} else {
			sueldo_bruto = 40 * tarifa;
			horas = horas - 40;
			sueldo_bruto = (int) (sueldo_bruto + (horas * (tarifa * 0.5)));
		}
		return sueldo_bruto;
	}
	
	public void MostrarDatos() {
		System.out.println(nombre + " trabajó " + num_h + " horas, cobra " + tarifa + " euros la hora por lo que le corresponde un sueldo de " + sueldo_bruto + " euros.");
	}
	
	
	
}
