package cap_01_estructuras_control;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Contador_positi_negati {

	public static void main(String[] args) {
		/*
		 * Se pide ingresar 5 numeros(entre positivos, negativos y ceros). Se pide
		 * mostrar la cantidad de positivos, negativos ceros. Utilizar JoptionPane,
		 * BucleFor y Condicional IF
		 */

		int num = 0, cc = 0, cp = 0, cn = 0;
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("ingresa numero");
			num = entrada.nextInt();

			if (num < 0)
				cn++;
			
			else if (num > 0)
				cp++;
			
			else
				cc++;
		}

		System.out.println("Positivos: " + cp + "\nNegativos: " + cn + "\nCeros: " + cc);

	}
	

}
