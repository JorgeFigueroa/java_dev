package cap_02_Matrices;

/*array di almeno 6 elementi,
stamparne il contenuto a video, scambiare il valore massimo e quello
minimo all'interno dell'array e ristampare a video il contenuto dell'array
per verificare che lo scambio sia avvenuto correttamente. (Separare il
programma in metodi statici che effettuano le operazioni di scambio e di
stampa e richiamarli opportunamente nel main.*/
public class ScambiaMinMax {

	public static void main(String[] args) {
		int[] a = { 2, 1, 6, 3, 7, 4 };
		
		printArray(a);
		System.out.println();
		scambiaMinMax(a);
		printArray(a);
	}

	public static void scambiaMinMax(int[] a) {
		if ((a == null) || (a.length == 0)) {
		} else {
			int posMin = 0;
			int posMax = 0;
			int i = 0;
			while (i < a.length) { // e` possibile usare anche il "for" in
									// alternativa
				if (a[i] > a[posMax])
					posMax = i;
				if (a[i] < a[posMin])
					posMin = i;
				i++;
			}
			int temp = a[posMax];
			a[posMax] = a[posMin];
			a[posMin] = temp;
		}
	}

	/**
	 * Stampa un array di interi. Se l'array e` null lo segnala.
	 * 
	 * @param a
	 *            l'array di interi
	 */
	public static void printArray(int[] a) {

		if (a == null)
			System.out.println("L'array e` uguale a null!");
		else if (a.length == 0)
			System.out.println("[]");
		else
			for (int i = 0; i < a.length; i++)
				System.out.println("Elemento " + i + ": " + a[i]);
	}

}
