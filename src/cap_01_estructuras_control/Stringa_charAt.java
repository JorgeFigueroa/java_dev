package cap_01_estructuras_control;

import java.util.Scanner;
/*Si richiede in input una stringa di caratteri e si fornisce in output il numero di occorrenze del carattere ‘a’*/

public class Stringa_charAt {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		System.out.println("inserisci una stringa");
		String parola = tastiera.nextLine();

		conta_A(parola);

	}
	
	public static void conta_A(String parola) {
		int occorrenze = 0;
		char c;
		for (int i = 0; i < parola.length(); i++) {
			c = parola.charAt(i);
			if (c == 'a')
				occorrenze++;
		}
		System.out.println(parola + " ha " + occorrenze + " a");
		
	}
}