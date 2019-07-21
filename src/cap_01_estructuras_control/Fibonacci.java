package cap_01_estructuras_control;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("numero para la serie fibonacci");
        Scanner leer = new Scanner(System.in);
        int entrada = leer.nextInt();

        int a = 0, b = 1, c;

        System.out.print(b + " ");

        for (int i = 2; i <= entrada; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }


    }

}
