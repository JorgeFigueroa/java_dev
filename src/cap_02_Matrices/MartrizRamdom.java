package cap_02_Matrices;

public class MartrizRamdom {

	public static void main(String[] args) {
		/*
		 * Crear una matriz de 4x4 y llenarla Mostrar la matriz
		 */

		int matriz[][] = new int[4][4];
		matrizRamdom(matriz);

	}

	public static void matrizRamdom(int[][] matriz) {
		for (int f = 0; f < 4; f++) {
			for (int c = 0; c < 4; c++) {
				matriz[f][c] = (int) (Math.random() * 10 + 80);
				System.out.print(matriz[f][c] + " - ");
			}
			System.out.println("");
		}
	}

}
