package cap_01_estructuras_control;
import java.util.Scanner;
// Si richiede la misura della base e dell’altezza di un rettangolo e si fornisce in output il perimetro 

public class Perimetro {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserice la base dell quadrato");
        int base = tastiera.nextInt();

        System.out.println("inserice la altezza dell quadrato");
        int altezza = tastiera.nextInt();
        
        baseXaletza(base, altezza);

    }
    
    public static void baseXaletza(int base, int altezza) {
        System.out.println("il perimetro " + (base + altezza) * 2);
    }
}