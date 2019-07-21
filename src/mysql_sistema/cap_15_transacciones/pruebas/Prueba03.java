package mysql_sistema.cap_15_transacciones.pruebas;

import mysql_sistema.cap_15_transacciones.model.ClienteModel;
import mysql_sistema.cap_15_transacciones.to.ClienteTO;

public class Prueba03 {
	
	public static void main(String[] args) {
		
		// Creación de los objetos
		ClienteTO clienteTO = new ClienteTO();
		ClienteModel cliente = new ClienteModel();
		
		// Preparamos los datos
		clienteTO.setCliecodigo("00021");
		clienteTO.setCliepaterno("GUARACHI");
		clienteTO.setCliematerno("CORONEL");
		clienteTO.setClienombre("ALEJANDRA MARIEL");
		clienteTO.setCliedni("10459823");
		clienteTO.setClieciudad("CHICLAYO");
		clienteTO.setCliedireccion("LUIS GONZALES 1528");
		clienteTO.setClietelefono("234567");
		clienteTO.setClieemail("alejandra@yahoo.es");
		
		//Grabamos en la base de datos
		try {
			cliente.modificar(clienteTO);
			System.out.println("Proceso ejecutado satisfactoriamente.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	} // main

} // Prueba03