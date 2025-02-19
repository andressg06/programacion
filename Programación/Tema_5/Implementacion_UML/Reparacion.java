package Implementacion_UML;

import java.util.Date;

public class Reparacion {
	//Atributos
	private Date fecha;
	
	//Constructor
	public Reparacion(Date fecha) {
		this.fecha = fecha;
	}
	
	//Getters
	public Date getFecha() {
		return fecha;
	}
	
	//Setters
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}	
}
