import java.util.Scanner;

/*Esercizio Catalogo
 Scrivere un main per testare la classe in modo da testare i metodi*/
public class MainCatalogo {
    public static void main(String[] args) {

        String[] audios = {"audio1", "audio2", "audio3"};
        String[] audios2 = {"track1", "track2", "track3"};
        String[] audios3 = {"track1", "track2", "track3"};

        Cd cd1 = new Cd("titolo1", "autore1", 1980, audios);
        Cd cd2 = new Cd("titolo2", "autore1", 1980, audios);
        Cd cd3 = new Cd("titolo3", "autore1", 1980, audios2);
        Cd cd4 = new Cd("titolo4", "autore2", 1990, audios2);
        Cd cd5 = new Cd("titolo5", "autore2", 1990, audios3);
        Cd[] listaCd = {cd1, cd2, cd3, cd4, cd5};

        Catalogo catalogo = new Catalogo("catalogo1", listaCd);

        catalogo.stampa();

        /* trova il numero di cd_catalogo di un autore */
        Scanner tastiera = new Scanner(System.in);
        System.out.println("inserisce un autore");
        int numCdAutore = catalogo.trovaNumAutore(tastiera.nextLine());
        System.out.println("tuo autore ha " + numCdAutore + " cd in catalogo ");

        /* trova il numero di cd_catalogo in base all'anno di uscita */
        System.out.println("inserisce un anno");
        int numCdAnno = catalogo.trovaNumAnno(tastiera.nextInt());
        System.out.println("tuo anno ha " + numCdAnno + " cd in catalogo ");

        /* trova il Cd in base al titolo */
        tastiera.nextLine();
        System.out.println("inserisce un titolo");
        Cd numCdTitolo = catalogo.trovaCdtitolo(tastiera.nextLine());
        System.out.println("tuo cd è");
        numCdTitolo.stampa();

        //restituisca l'elenco dei cd_catalogo di un autore
        System.out.println("inserisce un autore");
        Cd[] cdTrovati = catalogo.elencoCdAutore(tastiera.nextLine());
        System.out.println("il tuo autore ha");
        for (int i = 0; i < cdTrovati.length; i++)
            cdTrovati[i].stampa();

        tastiera.close();

    }
}
