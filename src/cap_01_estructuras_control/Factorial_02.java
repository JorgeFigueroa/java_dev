package cap_01_estructuras_control;

/*calcular el factorial de un  numero
*  5!= 1*2*3*4*5
*
* */

import java.lang.System;
import java.util.*;
import java.util.Scanner;

public class Factorial_02 {
    public static void main(String[] args) {

        //5!= 1*2*3*4*5

        Scanner leer = new Scanner(System.in);

        int numero;
        int resultado = 1;

        do {
            System.out.println("indique un numero");
            Scanner sc = new Scanner(System.in);
            numero = sc.nextInt();
        } while (numero < 1);

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
            System.out.println(resultado + " *");
        }
        System.out.println("factorial de  " + numero + " es " + resultado);

    }
}