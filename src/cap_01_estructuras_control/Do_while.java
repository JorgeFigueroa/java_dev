package cap_01_estructuras_control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Do_while {
	/*
	 * Se pide ingresar n numeros positivos. Se terminara el ingreso de datos
	 * cuando se ingrese un cero
	 */
	public static void main(String[] args) {
		int num = 0;
		 Scanner tastiera = new Scanner(System.in);

		do {
			System.out.println(" ingresar numeros positivos ");
			num = tastiera.nextInt();
		} while (num != 0);

	}
	

}
