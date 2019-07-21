package cap_02_Matrices;

import java.util.Scanner;

public class Ordenar_vector {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);

		int vec[] = new int[5];
		for (int i = 0; i < vec.length; i++) {
			System.out.print("vec[" + (i + 1) + "]=");
			vec[i] = leer.nextInt();
		}
		
		int[] burbu = ordena_burbuja(vec);
		print(burbu);
		
	}

	public static int[] ordena_burbuja(int[] vec) {
		// ordenar vectores con el metodo burbuja
		int aux;
		for (int i = 0; i < vec.length; i++) {
			for (int j = i + 1; j < 5; j++) {
				if (vec[i] > vec[j]) {
					aux = vec[i];
					vec[i] = vec[j];
					vec[j] = aux;
				}
			}
		}
		return vec;
	}
	
	public static void print (int[] vec) {
		System.out.println("ordenando vectores con metodo burbuja");
		for (int i = 0; i < vec.length; i++) {
			System.out.print("vec[" + (i + 1) + "]=");
			System.out.println(vec[i]);
		}
	}

}
