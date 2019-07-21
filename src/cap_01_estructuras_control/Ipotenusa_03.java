package cap_01_estructuras_control;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

//Si richiede la misura dei cateti di un triangolo rettangolo e si fornisce in output la misura dell’ipotenusa
public class Ipotenusa_03 {

    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        System.out.println("inserice cateto1");
        int cat1 = tastiera.nextInt();

        System.out.println("inserice cateto2");
        int cat2 = tastiera.nextInt();

        double ipotenusa = Math.sqrt(cat1 * cat1 + cat2 * cat2);
        double arrotondamento = round(ipotenusa, 2);
       // double arrotondamento = Math.round(ipotenusa * 100) / 100;
        System.out.println("la ipotenusa " + arrotondamento);

    }

    private static double round(double value, int places) {
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
