package cap_01_estructuras_control;

import java.util.Scanner;

public class Suma_Promedio_media {

	public static void main(String[] args) {

		/* se Ingresar la nota de alumnos. 
		 * Mostrar el promedio de todas las notas ingresadas
		 */

		System.out.println("cuantas notas");
		int totNotas =  tastiera().nextInt();

		int suma = suma(totNotas);
		promedio_media(suma, totNotas);
	}
	

	public static int suma(int totNotas) {
		int suma = 0;
		for (int i = 1; i < totNotas+1; i++) {
			System.out.println("ingresa nota "+i);
			suma = suma + tastiera().nextInt();
		}
		return suma;
	}
	
	public static void promedio_media(int suma, int totNotas) {
		int prom = suma / totNotas;
		System.out.println("la suma notas: " + suma + " Promedio: " + prom);
	}

	public static Scanner tastiera() {
		return new Scanner(System.in);
	} 
}
