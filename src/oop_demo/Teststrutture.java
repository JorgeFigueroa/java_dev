package oop_demo;

/**
 * Classe per testare el funzionamento delle strutture di controllo in java
 * contiene metodi per verificare il funzionamento
 * delle strutture for while e switch
 */
public class Teststrutture
{
    /**
     * Test della struttura for
     * essegue un dato numero di iterazione e stampa il contator
     * @param volte e il numero di iterazioni
     */
    public static void testFor (int volte){
        for (int i=0; i<volte; i++)
        {
            System.out.println("for "+ i);
        }
        System.out.println("fine for");     
    }

    /**
     * Test della struttura while
     * essegue un dato numero di iterazione e stampa il contatore
     */

    public static void testWhile (){
        int numero=1;
        int volte=25;
        while (numero<volte)
        {
            System.out.println("while "+ numero++);
        }
        System.out.println("fine while");
    }

    /**
     * Test della struttura Switch
     */
    public static void testSwitch (){
        int giorno = 3;
        String settimana;
        switch (giorno) {
            case 1: settimana = "lunedi";
            break;
            case 2: settimana = "martedi";
            break;
            case 3: settimana = "mercoledi";
            break;
            case 4: settimana = "giovedi";
            break;
            case 5: settimana = "venerdi";
            break;
            case 6: settimana = "sabato";
            break;
            case 7: settimana = "domenica";
            break;
            default: settimana = "giorno non valido"; 
        }
        System.out.println(settimana);
    }

    /**
     * Test della struttura Array
     * crea un array di stringe e esegue una iterazione  con
     * il ciclo for clasico e con un ciclo for di collezione
     */
    public static void testArray (){
        String[] lista = {"lunedi","martedi","mercoledi","giovedi","venerdi","sabato","domenica"};
        for (int i=0; i<lista.length; i++)
        {
            String nome=lista[i];
            System.out.println("AAA "+ nome);
        }

        for (String giorni : lista)
        {
            System.out.println("percorre array "+ giorni );
        }
    }
}