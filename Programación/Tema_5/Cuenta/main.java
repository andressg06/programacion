package Cuenta;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

import Cuenta.Cuenta.Movimiento;

public class main {
	
	static Scanner leer = new Scanner(System.in);
	static LinkedList<Cliente> listaClientes = new LinkedList<Cliente>();
	static LinkedList<Cuenta> listaCuentas = new LinkedList<Cuenta>(); 
	
	static int Generador = 0;
	static int contClientes = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		menu();
		
	}
	
	public static void menu() {
		
		boolean cuentaExistente = false;
		Cliente c1 = new Cliente();
		
		System.out.println("******MENU******");
		System.out.println("1.- Mantenimiento de Clientes");
		System.out.println("2.- Mantenimiento de Cuentas");
		System.out.println("0.- Salir");
		int num = leer.nextInt();
		
		if (num == 1) {
			mantenimientoClientes();
		} else if (num == 2) {
			System.out.println("Introduzca el nombre del titular");
			String nombre = leer.next();
			System.out.println("Introduzca el apellido del titular");
			String apellido = leer.next();
			String cliente = nombre + " " + apellido;
			for (Cliente c : listaClientes) {
				if (c.mostrarnombreCompleto().equals(cliente)) {
					cuentaExistente = true;
					c1 = c;
				}
			}
			if (cuentaExistente) {
				menuMantenimiento(c1);
			} else {
				System.out.println("No hay ninguna cuenta con este titular");
				System.out.println("Saliendo al menu");
				menu();
			}
		}
		
	}
		public static void menuMantenimiento(Cliente cliente) {
			Cuenta cuenta = new Cuenta();
			for (Cuenta cuentaf : listaCuentas) {
				if (cuentaf.getTitular().equals(cliente)) {
					cuenta = cuentaf;
				}
			}
			
			System.out.println("*********Cuenta********");
			System.out.println("1.- Ingresar");
			System.out.println("2.- Reintegro");
			System.out.println("3.- Ingresar Interés Anual");
			System.out.println("4.- En Rojos");
			System.out.println("5.- Leer Saldo");
			System.out.println("6.- Datos Titular");
			System.out.println("7.- Salvar");
			System.out.println("8.- Lista Movimientos");
			int num = leer.nextInt();
			
			switch(num) {
			case 1:
				Ingreso(cuenta);
				menuMantenimiento(cliente);
				break;
			case 2:
				Reintegro(cuenta);
				menuMantenimiento(cliente);
				break;
			case 3:
				System.out.println("De cuanto sera el interes anual");
				float nuevoInteres = leer.nextFloat();
				cuenta.setinteresAnual(nuevoInteres);
				menuMantenimiento(cliente);
				break;
			case 4:
				boolean rojos = cuenta.enRojos();
				if(rojos) {
					System.out.println("La cuenta esta en numeros rojos");
				}else {
					System.out.println("La cuenta no esta en numeros rojos");
				}
				menuMantenimiento(cliente);
				break;
			case 5:
				System.out.println("Tienes "+cuenta.getsaldo()+" euros");
				menuMantenimiento(cliente);
				break;
			case 6:
				System.out.println("El titular es "+cliente.mostrarnombreCompleto()+" que vive en "+ cliente.mostrardireccion());
				menuMantenimiento(cliente);
				break;
			case 7:
				System.out.println("Los cambios han sido realizados con exito");
				menu();
				break;
			case 8:
				for(Movimiento m: cuenta.getMovimientos()) {
					m.mostrarMovimiento();
				}
				menuMantenimiento(cliente);
				break;
			default:
				System.out.println("Valor invalido");
				menuMantenimiento(cliente);
				break;
			}
		}
		
		public static void Ingreso(Cuenta c) {
			System.out.println("¿Cuanto desea ingresar?");
			float ingreso = leer.nextFloat();
			leer.nextLine();
			c.ingreso((int)ingreso);
		}
		
		public static void Reintegro(Cuenta c) {
			System.out.println("¿Cuanto desea retirar?");
			float retirada=leer.nextFloat();
			leer.nextLine();
			c.reintegro((int)retirada);
		}
		
		public static void mantenimientoClientes() {
			System.out.println("*******MENÚ DE MANTENIMIENTO DE CLIENTES*******");
			System.out.println("1.- Altas");
			System.out.println("2.- Bajas.");
			System.out.println("3.- Modificaciones");
			System.out.println("4.- Listado.");
			int num = leer.nextInt();
			if (num == 1) {
				alta();
			} else if (num == 2) {
				baja();
			} else if (num == 3) {
				modificar();
			} else if (num == 4) {
				listarClientes();
			} else {
				System.out.println("Entrada inválida.");
				menu();
			}
		}
		
		public static void alta() {
			String nCliente;
			String aCliente;
			String dCliente;
			
			System.out.println("Introduzca el nombre:");
			nCliente = leer.next();
			System.out.println("Introduzca el apellido:");
			aCliente = leer.next();
			System.out.println("Introduzca la dirección:");
			dCliente = leer.nextLine();
			
			Cliente cliente = new Cliente(nCliente, aCliente, dCliente);
			contClientes++;
			listaClientes.add(cliente);
			System.out.println(listaClientes.get(contClientes - 1).mostrarnombreCompleto());
			Cuenta cuenta = new Cuenta(Generador,0,0,cliente);
			Generador++;
			listaCuentas.add(cuenta);
			menu();
		}
		
		static public void baja() {
			String remove_nombre;
			String remove_apellido;
			String remove_cliente;
			boolean clienteEncontrado = false;

			System.out.println("Introduzca el nombre");
			remove_nombre = leer.next();
			System.out.println("Introduzca el apellido");
			remove_apellido = leer.next();
			remove_cliente = remove_nombre + " " + remove_apellido;
			for (Cliente c : listaClientes) {
				if (c.mostrarnombreCompleto().equals(remove_cliente)) {
					for(Cuenta cuenta: listaCuentas) {
						if(cuenta.getTitular().equals(c)) {
							listaCuentas.remove(cuenta);
						}
					}
					listaClientes.remove(c);
					clienteEncontrado = true;
				}
			}
			if (clienteEncontrado) {
				System.out.println("El cliente " + remove_cliente + " ha sido eliminado");
			} else {
				System.out.println("El cliente " + remove_cliente + " no se ha encontrado");
			}

			menu();
		}
		
		public static void modificar() {

			String modificarnombre;
			String modificarapellido;
			String modificarcliente;
			Cliente modificando;
			int index = 0;
			boolean clienteModificado = false;
			;

			String nombreNuevo;

			System.out.println("Introduzca el nombre");
			modificarnombre = leer.next();
			System.out.println("Introduzca el apellido");
			modificarapellido = leer.next();
			System.out.println("Solo modificaras el nombre de pila, introduce el nuevo:");
			nombreNuevo = leer.next();
			leer.nextLine();
			modificarcliente = modificarnombre + " " + modificarapellido;
			for (Cliente c : listaClientes) {
				index++;
				if (c.mostrarnombreCompleto().equals(modificarcliente)) {
					modificando = listaClientes.get(index - 1);
					modificando.setnombre(nombreNuevo);
					clienteModificado = true;
				}
			}
			if (clienteModificado) {
				System.out.println("Cliente modificado con éxito");
			} else {
				System.out.println("Ese cliente no se reconoce");
			}
			menu();
		}
		
		public static void listarClientes() {
			for (Cliente c : listaClientes) {
				System.out.println(c.mostrarnombreCompleto());
			}
			menu();
		}
		
}
