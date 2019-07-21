package cap_01_estructuras_control;

import java.util.Scanner;

public class ControlSwitch {

    public static void main(String[] args) {
        Scanner diadelasemana = new Scanner(System.in);

        System.out.println("ingresa numero");

        switch (diadelasemana.nextInt()) {
            case 1:
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3:
                System.out.println("Hoy es miercoles");
                break;
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            case 6:
                System.out.println("Hoy es sabado");
                break;
            case 7:
                System.out.println("Hoy es domingo");
                break;
            default:
                System.out.println("no es una dia de la semana");
                break;

        }
        System.out.println("Aqui acaba el programa");

    }
}
