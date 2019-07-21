
package cap_02_clases;
import java.util.Random;

public class Aleatorio {

   
    public static void main(String[] args) {
        Random dado = new Random();
        int numero;
        for (int contador = 0;contador < 10;contador++){
            numero = dado.nextInt(6);
            System.out.println(numero + 1);
        }
    }
}
