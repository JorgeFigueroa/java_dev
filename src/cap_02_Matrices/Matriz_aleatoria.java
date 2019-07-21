package cap_02_Matrices;

public class Matriz_aleatoria {

	public static void main(String[] args) {
		/*
		 * Crear una matriz de 5x5 y llenarla con numeros aleatorios entre el 0 y el 9.
		 * mostrar la matriz y la suma y promedio de todos sus elementos
		 */

		int matriz[][] = new int[5][5];
		matrizRamdomSuma(matriz);

	}

	public static void matrizRamdomSuma(int[][] matriz) {
		int suma = 0;
		double prom = 0;
		
		for (int f = 0; f < 5; f++) {
			for (int c = 0; c < 5; c++) {
				matriz[f][c] = (int) (Math.random() * 10 + 0);
				suma = suma + matriz[f][c];
				System.out.print(matriz[f][c] + " - ");
			}
			System.out.println("");
		}
		prom = ((double) suma / 25);

		System.out.println("Suma es: " + suma);
		System.out.println("Promedio es: " + prom);

	}

}
