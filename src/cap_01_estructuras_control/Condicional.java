package cap_01_estructuras_control;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Condicional {
	/*
	 * 1. Se pide ingresar el nombre de un alumno y el curso(java, android, Excel).
	 * Mostrar el nombre, curso, costo(java-800 ,android-900, excel - 600),
	 * dscto(costo * 0.1) y total(costo-dscto).
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("ingresa nombre y curso");
		String name = entrada.next();
		String curso = entrada.next();
		
		ingresar(name, curso);
		
	}

	public static void ingresar(String name, String curso) {

		if (curso.equals("java"))
			System.out.println(name + " java-800");
		
		
		else if (curso.equals("android"))
			System.out.println(name + " android-900");
		
		
		else
			System.out.println(name + " otro curso - 600");

	}

}
