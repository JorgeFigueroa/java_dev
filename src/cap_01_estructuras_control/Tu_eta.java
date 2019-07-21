package cap_01_estructuras_control;

import java.util.Calendar;
import java.util.Scanner;
/*input l’anno di nascita e l’anno attuale 
output l’età*/

public class Tu_eta {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);

		System.out.println("l’anno di nascita");
		int anno_nascita = tastiera.nextInt();
		
		tuEdad(anno_nascita);

	}

	public static void tuEdad(int anno_nascita) {
		int anno_attuale = Calendar.getInstance().get(Calendar.YEAR);
		
		System.out.println("la mia eta " + (anno_attuale - anno_nascita));

	}
}
