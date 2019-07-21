package cap_02_Matrices;

import java.util.Scanner;
/* input 5 valori numerici e si immettono in un array,
output la somma dei valori presenti nell'array.
*/

public class Array_Suma
{
	public static void main(String arg[]){

		int[] array = { 2, 1, 6, 3, 6 };
		sumaArray(array);
	}
	
	public static void sumaArray(int[] array) {
		int suma = 0;
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]+" + ");
			suma += array[i];
		}
		System.out.println("la suma es :"+suma);
		
	}
	
	
}