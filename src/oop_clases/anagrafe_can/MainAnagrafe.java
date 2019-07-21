package oop_clases.anagrafe_can;

public class MainAnagrafe
{

    public static void main(String[] args)
    {

        //  instanza
        Cane cane1 = new Cane(0, "boby", 2, 'm' );
        Cane cane2 = new Cane(1, "toto", 3, 'f' );
        Cane cane3 = new Cane(2, "yeye", 5, 'm' );
        patrone patro1 = new patrone( "jorge", "figueroa", "jksdfhjksdfh" );
        patrone patro2 = new patrone( "juan", "perz", "jksdfhjksdfh" );
        patrone patro3 = new patrone( "lucas", "perales", "jksdfhjksdfh" );

        Cane_patrone[] cane_patrone = { new Cane_patrone( cane1, patro1 ), new Cane_patrone( cane2, patro2 ), new Cane_patrone( cane3, patro3 ) };

        AnagrafeCanina anagrafe = new AnagrafeCanina( cane_patrone );


        // UTILIZZO DEI METODI ANAGRAFE
        System.out.println( "NomeCane Padrone" );
        anagrafe.stampaNomeCanePadrone( 1 );

        System.out.println( "NomeCane nomePadrone" );
        anagrafe.stampaListaNomeCanePadrone();

        System.out.println( "NomeCani cognomepadrone" );
        anagrafe.stampaNomeCompletoCani();

        System.out.println( "NomePadrone DelCane" );
        anagrafe.getNomePadroneDiCane( 2 );

        System.out.println( "NomiCani delPadrone" );
        anagrafe.getNomiCaniConPadrone( "lucas" );


    }

}
