package cap_02_Matrices;

import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class Par_impar {
	
	public static void main(String[] args) {

		int[] array = { 2, 1, 6, 3, 6 };
		contador_pares_impares(array);

	}
	

	static void lista_pari() {
		/*
		 * Si richiedono 2 valori interi, si controlla che il primo sia inferiore al
		 * secondo altrimenti si richiede nuovamente il secondo, poi si forniscono in
		 * output tutti i numeri pari compresi fra i valori inseriti (estremi esclusi)
		 */
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("inserice valore1");
		int valore1 =  tastiera.nextInt();
		valore1 = valore1 + 1;

		System.out.println("inserice valore2");
		int valore2 =  tastiera.nextInt();

		while (valore1 > valore2) {
			System.out.println("inserice valore2 maggiore di valore1");
			valore2 =  tastiera.nextInt();
		}


		for (int i = valore1; i < valore2; i++) {
			if (i % 2 == 0) 
				System.out.println("numeri pari " + i);

		}

	}

	static void contador_pares_impares(int[] num) {
		/*
		 * Se pide crear un arreglo de 10 elementos y llenarlo. mostrar todo el arreglo
		 * y la cantidad de numeros pares e impares
		 */

		int cp = 0, ci = 0;
		String texto = "";

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0)
				cp++;
			else
				ci++;
			texto = texto + num[i] + ", ";
		}

		System.out.println(texto + "\nPares: " + cp + "\nImpares: " + ci);

	}
	
}