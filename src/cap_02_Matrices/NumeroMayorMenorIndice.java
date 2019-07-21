package cap_02_Matrices;

import java.util.Scanner;

public class NumeroMayorMenorIndice {

	public static void main(String[] args) {
	
		int[] array = { 2, 1, 6, 3, 8 };

		numeroMayorIndice(array);
		numeroMinimoIndex(array);

	}

	
	static void numeroMayorIndice(int[] array) {
		/*
		 * crea un array di una dimensione si richiedono i valori da inserire output il
		 * valore massimo del array e su posizion.
		 */
		int nunMax = Integer.MIN_VALUE;
		int indexArray = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > nunMax) {
				nunMax = array[i];
				indexArray = i;
			}
		}

		System.out.println("il numero maggiore è " + nunMax + " indice " + indexArray);
	}

	
	static void numeroMinimoIndex(int[] array) {
		int numMin = Integer.MAX_VALUE;
		int indexArray = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < numMin) {
				numMin = array[i];
				indexArray = i;
			}

		}
		System.out.println("il numero menor è " + numMin + " indice " + indexArray);

	}

}
