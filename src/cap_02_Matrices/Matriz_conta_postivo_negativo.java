package cap_02_Matrices;

public class Matriz_conta_postivo_negativo {

	public static void main(String[] args) {
		/*
		 * Crear una matriz de 5x5 y llenarla con numeros aleatorios entre el -10 y 10.
		 * Mostrar la matriz y la cantidad de positivos, negativos y ceros.
		 */

		int m[][] = new int[5][5];
		int cp = 0, cn = 0, cc = 0;

		for (int f = 0; f < 5; f++) {
			for (int c = 0; c < 5; c++) {
				m[f][c] = (int) (Math.random() * 21 - 10);
				if (m[f][c] > 0)
					cp++;
				else if (m[f][c] < 0)
					cn++;
				else
					cc++;
				System.out.print(m[f][c] + " | ");
			}
			System.out.println("");
		}

		System.out.println("Positivos --> " + cp);
		System.out.println("Negativos --> " + cn);
		System.out.println("Ceros --> " + cc);

	}

}
