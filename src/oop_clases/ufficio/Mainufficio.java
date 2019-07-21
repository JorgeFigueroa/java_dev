import java.util.Scanner;

public class Mainufficio
{

    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner( System.in );

        //  creo un array di tipo impiegati
        Impiegato[] arrImp = new Impiegato[10];
        for (int i = 0; i < arrImp.length; i++)
        {
            Impiegato tmp = new Impiegato( "imp" + i, 600 );
            arrImp[i] = tmp;
        }


        // paso al costruttore il array di tipo impiegati
        Ufficio ufficio = new Ufficio( arrImp );
        ufficio.stampaUfficio();


        //  utilizzo il metodo ricerca le paso un string
        System.out.println( "--  ricerca un impiegato " );
        int pos = ufficio.ricerca( tastiera.nextLine() );

        if ( pos != -1 )
        {
            System.out.println( "--  Impiegato presente, aumento stipendio  " );
            ufficio.aumenta( pos, 200 ); // aumento lo stipendio dell'Impiegato in posizione "pos"
        } else
        {
            System.out.println( "--  Non esiste un impiegato con questo nome. " );
        }

        System.out.println( "--  Nuova situazione:  " );
        ufficio.stampaUfficio();
    }
}
