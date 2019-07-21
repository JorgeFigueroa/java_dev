package cap_01_estructuras_control;

import java.util.Scanner;

public class Descuento_incrementos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserici un numero");
        int cantidad = scanner.nextInt();

        System.out.println("la cantidad es " + cantidad);

        descuentos(cantidad);
        incrementos(cantidad);
    }

    public static void descuentos(int cantidad) {
        double descuento = cantidad - (cantidad * 0.05);
        System.out.println("descuento 5% es " + descuento);
    }

    public static void incrementos(int cant1) {
        double incremento = cant1 + (cant1 * 0.10);
        System.out.println("el incremento 10% es " + incremento);
    }

}
