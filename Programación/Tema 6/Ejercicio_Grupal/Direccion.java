package Ejercicio_Grupal;

/**
 * Clase Direccion
 * 
 */
public class Direccion {
	/** Calle en la que reside el estudiante */
	private String calle;
	/** Ciudad de residencia del estudiante */
	private String ciudad;
	/** Codigo postal de la residencia del estudiante */
	private int cod_postal;
	/** Pais de residencia del estudiante */
	private String pais;
	
	/**
	 * Constructor predeterminado de la Direccion
	 */
	public Direccion() {
	}
	
	/**
	 * Constructor parametrizado de la Direccion
	 * 
	 * @param calle Calle del estudiante
	 * @param ciudad Ciudad de residencia del estudiante
	 * @param cod_postal Codigo postal de la residencia del estudiante
	 * @param pais Pais de residencia del estudiante
	 */
	public Direccion(String calle, String ciudad, int cod_postal, String pais) {
		this.calle = calle;
		this.ciudad = ciudad;
		this.cod_postal = cod_postal;
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", cod_postal=" + cod_postal + ", pais=" + pais
				+ "]";
	}
}
