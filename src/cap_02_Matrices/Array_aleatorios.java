package cap_02_Matrices;
public class Array_aleatorios {

	public static void main(String[] args) {
		/*
		 * Crear una funcion de tipo void que reciba como párametro la cantidad de
		 * elementos de un arreglo unidimensional. la funcion creara el arreglo, lo
		 * llenara con numeros aleatorios y mostrara el arreglo.
		 */

		arreglo_random(5);
	}

	static void arreglo_random(int num) {
		int arr[] = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = (int) (Math.random() * 10 + 0);
			System.out.print(arr[i]+", ");
		}
	}

}
