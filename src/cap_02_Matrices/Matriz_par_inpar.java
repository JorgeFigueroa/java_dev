package cap_02_Matrices;

public class Matriz_par_inpar {
	/*
	 * 
	 * 5. Crear una matriz de 5x5 y llenarla con numeros aleatorios entre el 1 y el
	 * 9.Se pide mostrar la matriz y la cantidad de numeros pares e impares.
	 * 
	 */
	public static void main(String[] args) {

		int m[][] = new int[5][5];
		int cp = 0, ci = 0;

		for (int f = 0; f < 5; f++) {

			for (int c = 0; c < 5; c++) {
				m[f][c] = (int) (Math.random() * 9 - 1);

				if (m[f][c] % 2 == 0)
					cp++;
				else
					ci++;
				System.out.print(m[f][c] + " - ");
			}
			System.out.println(" ");
		}

		System.out.println("\nPares: " + cp + "\nImpares: " + ci);

	}

}
