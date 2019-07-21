package cap_01_estructuras_control;
import java.lang.System;
import java.util.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

    	/*calcular el factorial de un  numero
        *  5!= 1*2*3*4*5
    	* */
        Scanner entrada = new Scanner(System.in);
        int numero;
        int resultado = 1;

        System.out.println("indique un numero");
        numero = entrada.nextInt();

        while (numero < 1) {
            System.out.println("indique un numero mayor de 0");
            numero = entrada.nextInt();
        }

        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i;
            System.out.println(resultado);
        }

        System.out.println("factorial de " + numero + " es " + resultado);

    }
}