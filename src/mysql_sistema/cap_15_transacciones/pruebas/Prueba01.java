package mysql_sistema.cap_15_transacciones.pruebas;
// Este clase sirve para probar la generación del contador

import mysql_sistema.cap_15_transacciones.model.ContadorModel;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Prueba01 {

	public static void main(String[] args) {
		try {

			System.out.println(ContadorModel.getContador("cliente"));
		} catch (Exception ex) {
			Logger.getLogger(Prueba01.class.getName()).log(Level.SEVERE, null, ex);
		}

	}
}