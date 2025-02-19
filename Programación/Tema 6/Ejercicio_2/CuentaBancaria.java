package Ejercicio_2;

import java.util.InputMismatchException;

public class CuentaBancaria {
	private double saldo;

	public CuentaBancaria(float saldo) {
		super();
		this.saldo = saldo;
	}
	
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