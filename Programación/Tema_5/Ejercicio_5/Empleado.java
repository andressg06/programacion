package Ejercicio_5;

public class Empleado {
	
	//Atributos
	private long NIF;
	private double sueldo_base;
	private double pago_hextra;
	private double h_extrames;
	private double IRPF;
	private boolean casado;
	private int num_hijos;
	
	//Constructores
	public Empleado() {}
	
	public Empleado(long NIF) {
		this.NIF = NIF;
	}
	
	//Getters
	public void getNIF() {
		System.out.println("El NIF es: " + NIF);
	}
	
	public void getsueldo_base() {
		System.out.println("El sueldo base es: " + sueldo_base);
	}
	
	public void getpago_hextra() {
		System.out.println("El pago por horas extras es: " + pago_hextra);
	}
	
	public void getIRPF() {
		System.out.println("El porcentaje de IRPF es: " + IRPF);
	}
	
	public void getcasado() {
		String SINO;
		if (casado = false) {
			SINO = "No";
		} else {
			SINO = "Si";
		}
		System.out.println(SINO + " esta casado");
	}
	
	public void getnum_hijos() {
		System.out.println("Tiene " + num_hijos + " hijos");
	}
	
	//Setters
	public void setNIF( long nuevoNIF) {
		NIF = nuevoNIF;
	}
	
	public void setsueldo_base(double nuevosueldo_base) {
		sueldo_base = nuevosueldo_base;
	}
	
	public void setpago_hextra(double nuevopago_hextra) {
		pago_hextra = nuevopago_hextra;
	}
	
	public void seth_extrames(double nuevoh_extrames) {
		h_extrames = nuevoh_extrames;
	}
	
	public void setIRPF(double nuevoIRPF) {
		IRPF = nuevoIRPF;
	}
	
	public void setcasado(boolean nuevocasado) {
		casado = nuevocasado;
	}
	
	public void setnum_hijos(int nuevonum_hijos) {
		num_hijos = nuevonum_hijos;
	}
	
	public double CalculoH_Extras() {
		double h_extras = h_extrames * pago_hextra;
		System.out.println("El pago es de " + h_extras + " euros.");
		return h_extras;
	}
	
	public double CalcularSueldoBruto() {
		double sueldo_bruto = sueldo_base + CalculoH_Extras();
		System.out.println("El sueldo bruto es: " + sueldo_bruto);
		return sueldo_bruto;
	}
	
	public double CalcularRetenciones() {
		double retencion = IRPF;
		if (casado) {
			retencion = retencion - 2;
		}
		retencion = retencion - num_hijos;
		retencion = CalcularSueldoBruto() * (retencion / 100);
		System.out.println("La retención del IRPF es: " + retencion);
		return retencion;
	}
	
	public void println() {
		System.out.println("NIF del empleado:" + NIF);
		System.out.println("Casado: " + casado);
		System.out.println("Numero de Hijos: " + num_hijos);
	}
	
	public void printAll() {
		System.out.println("NIF del empleado:" + NIF);
		System.out.println("Casado: " + casado);
		System.out.println("Numero de Hijos: " + num_hijos);
		System.out.println("Sueldo base: " + sueldo_base);
		System.out.println("Complemento por horas extras: " + CalculoH_Extras());
		System.out.println("El sueldo bruto es: " + CalcularSueldoBruto());
		System.out.println("La retencion del IRPF es: " + CalcularRetenciones());
		System.out.println("El sueldo neto es: " + (CalcularSueldoBruto() - sueldo_base));
	}
	
	
}
