package cap_01_estructuras_control;
import java.util.Scanner;
/*Si richiedono 2 valori interi, si controlla che il primo sia inferiore al secondo altrimenti si richiede 
nuovamente il secondo, poi si forniscono in output tutti i numeri interi compresi fra i valori inseriti 
(estremi enclusi) */


public class Numericompresi2 {
    public static void main(String args[]) {

        Scanner tastiera = new Scanner(System.in);
        int a = 0;
        int b = 0;

        System.out.println("inserisci un numero");
        a = tastiera.nextInt();

        while (a >= b) {
            System.out.println("inserisci un numero maggiore del primo");
            b = tastiera.nextInt();
        }

        for (int i = a; i <= b; i++)
            System.out.println(i);
    }
}