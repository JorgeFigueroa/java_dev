
package cap_01_estructuras_control;
import java.util.Scanner;

public class Trycatch {

    public static void main(String[] args) {
       int numero;
       String cadena = "hola";
             
       
        try{
            numero = Integer.parseInt(cadena);
             System.out.println(" es un numero");
        }catch(NumberFormatException ex){
            System.out.println("No es un numero, es una cadena " + ex);
        }
    }
}
