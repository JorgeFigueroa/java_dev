package oop_clases.bici;


import java.util.Scanner;
/*----------------------------------------------------------------
*
*  Estensione Es. Bicicletta:
*  Definire oggetto bici.Persona che modelli le caratteristiche del proprietario di una Bicicletta (es. nome, cognome, eta)
*  Fare in modo che l'attributo proprietario della classe Bicicletta non sia piu rappresentato da una stringa ma da un oggetto di tipo bici.Persona
*
*----------------------------------------------------------------*/

public class MainBici {
    public static void main(String arg[]) {

        Scanner tastiera = new Scanner(System.in);

        // Instanze degli  oggetti bici.Persona e bici.Bici
        Persona perso1 = new Persona("lucas", "pato");
        Persona perso2 = new Persona("jorge", "figueroa", 35, 'm');
        Bici biciA = new Bici("decatholn", perso1, 20, 2);
        Bici biciB = new Bici("BMX", perso2);
        Bici biciC = new Bici("shimano", perso2, 20, 2);


        //  Richiesta incremento velocita
        System.out.println("---- Richiesta incremento velocita ----");
        int i = 1;
        while (i <= 2) {
            System.out.print("velocita BiciA ");
            biciA.setAumentaVelocita(tastiera.nextInt());
            System.out.print("velocita BiciB ");
            biciB.setAumentaVelocita(tastiera.nextInt());
            System.out.print("velocita BiciC ");
            biciC.setAumentaVelocita(tastiera.nextInt());
            i++;
        }
        System.out.println("");


        //  Stampa lo stato delle bici.Bici
        System.out.println("---- stato delle bici.Bici ----");
        System.out.print("BiciA - ");
        biciA.stampaStato();
        System.out.print("BiciB - ");
        biciB.stampaStato();
        System.out.print("BiciC - ");
        biciC.stampaStato();
        System.out.println("");


        //  calcola la bici che ha velocita maggiore e stampalo stato
        System.out.println("---- bici con velocita maggiore ----");
        if (biciA.getVelocita() > biciB.getVelocita() & biciA.getVelocita() > biciC.getVelocita()) {
            System.out.print("BiciA - ");
            biciA.stampaStato();
        } else if (biciB.getVelocita() > biciA.getVelocita() & biciB.getVelocita() > biciC.getVelocita()) {
            System.out.print("BiciB - ");
            biciB.stampaStato();
        } else {
            System.out.print("BiciC - ");
            biciC.stampaStato();
        }
        
        tastiera.close();

    }
}