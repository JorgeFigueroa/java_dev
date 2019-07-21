package cap_02_Matrices;

import java.util.Scanner;

public class Ordenar_matriz {

	public static void main(String[] args) {

		
		int matriz[][] = new int[3][3];
		Scanner leer = new Scanner(System.in);

		// LLenar la matriz
		 System.out.println("ingrese valores para la  matriz");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = leer.nextInt();
			}
			System.out.print(" " + "\n");
		}

		// ordenar matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int x = 0; x < 3; x++) {
					for (int y = 0; y < 3; y++) {
						if (matriz[i][j] < matriz[x][y]) {
							int t = matriz[i][j];
							matriz[i][j] = matriz[x][y];
							matriz[x][y] = t;
						}
					}
				}
			}
		}

		// imprimir la matriz
		System.out.println("-----matriz ordenada----");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.print(" " + "\n");
		}

	}

}
