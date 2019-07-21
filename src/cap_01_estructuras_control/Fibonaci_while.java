package cap_01_estructuras_control;
import java.util.Scanner;

public class Fibonaci_while {

    public static void main(String[] args) {

        System.out.println("numero para la serie fibonacci");
        Scanner leer = new Scanner(System.in);
        int entrada = leer.nextInt();

        int num1 = 0;
        int num2 = 1;
        int temp;


        while (num2 + num1 <= entrada) {
            temp = num1;
            num1 = num2;
            num2 = temp + num1;
            System.out.println(num2);
        }

    }


}
