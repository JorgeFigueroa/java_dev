package cap_01_estructuras_control;

import java.util.Scanner;

/*Si richiede un valore intero positivo e si fornisce in output il suo fattoriale
*/

public class Fattoriale {
    public static void main(String arg[]) {

        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci un numero intero positivo");
        int numero = tastiera.nextInt();
        int fattoriale = 1;

        for (int i = numero; i > 0; i--) {
            fattoriale = fattoriale * i;
        }
        System.out.println("il fattoriale di " + numero + " es: " + fattoriale);

    }
}