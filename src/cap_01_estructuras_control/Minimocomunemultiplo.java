package cap_01_estructuras_control;
import java.util.Scanner;
/*Si richiedono due valori interi e si fornisce in output il minimo comune multiplo*/

public class Minimocomunemultiplo {
    public static void main(String arg[]) {

        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisci due numeri interi");
        int n1 = tastiera.nextInt();
        int n2 = tastiera.nextInt();
        int moltiplicazione = n1 * n2;
        int resto = n1 % n2;

        while (resto != 0) {
            n1 = n2;
            n2 = resto;
            resto = n1 % n2;

        }
        System.out.println("il mcm es :" + (moltiplicazione / n2));


    }
}