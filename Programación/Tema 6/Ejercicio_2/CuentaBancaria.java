package Ejercicio_2;

import java.util.InputMismatchException;

/**
 * Una cuenta bancaria con metodos de depòsito y retiro.
 */
public class CuentaBancaria {
	/** Saldo actual de la cuenta */
	private double saldo;

	
	/**
	 * Constructor de la cuenta bancaria.
	 * 
	 * @param saldo Saldo inicial de la cuenta.
	 */
	public CuentaBancaria(float saldo) {
		super();
		this.saldo = saldo;
	}
	
	
	/**
	 * Depositar una cantidad en la cuenta
	 * 
	 * @param cantidad Dinero a depositar
	 * @throws InputMismatchException Si la cantidad es negativa
	 */
	public void depositar(double cantidad) {
		try	{
			if (cantidad < 0) {
				throw new InputMismatchException();
			} else {
				saldo = saldo + cantidad;
			}
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El valor no debe ser negativo");
		}
	}
	
	/**
	 * Retirar una cantidad de la cuenta.
	 * 
	 * @param cantidad Dinero a retirar.
	 * @throws InputMismatchException Si la cantidad en negativa o mayor que el Saldo
	 */
	public void retirar(double cantidad) {
		try	{
			if (cantidad < 0 || saldo < cantidad) {
				throw new InputMismatchException();
			} else {
				saldo = saldo - cantidad;
			}
		} catch (InputMismatchException e) {
			System.out.println("ERROR: El valor no debe ser negativo o mayor que el saldo");
		}
	}
}