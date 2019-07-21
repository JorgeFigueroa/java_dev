package oop_clases.anagrafe_can;

public class AnagrafeCanina
{
    // atributo
    private Cane_patrone[] canePadrone;

    // costruttore
    public AnagrafeCanina(Cane_patrone[] coppiacanePadrone)
    {
        this.canePadrone = coppiacanePadrone;
    }

    /* metodi */
    public void stampaNomeCanePadrone(int i)
    {
        // stampa il nome del cane e il nome del padrone di coppia in posizione i
        // (o "nessun cane e padrone nella posizione i")
        System.out.print( canePadrone[i].getCane().getNome() + " ");
        System.out.print( canePadrone[i].getPadrone().getNome() );
        System.out.println("\n");
    }


    public void stampaListaNomeCanePadrone()
    {
        // stampa la lista di nome cane - nome padrone che compongono l'anagrafe
        for (int i = 0; i < canePadrone.length; i++)
        {
            System.out.print( canePadrone[i].getCane().getNome() +" " );
            System.out.print( canePadrone[i].getPadrone().getNome() +" ");
            System.out.println();
        }
        System.out.println();

    }


    public void stampaNomeCompletoCani()
    {
        // stampa il nome del cane e il cognome del padrone.
        for (int i = 0; i < canePadrone.length; i++)
        {
            System.out.print( canePadrone[i].getCane().getNome() +" ");
            System.out.print( canePadrone[i].getPadrone().getCognome() +" ");
            System.out.println();
        }
        System.out.println();
    }


    public void getNomePadroneDiCane(int idCane)
    {
        String nomePadrone = null;
        for (int i = 0; i < canePadrone.length; i++)
        {
            if ( idCane == canePadrone[i].getCane().getid() )
                nomePadrone = canePadrone[i].getPadrone().getNome();
        }
        System.out.println(nomePadrone +"\n");   
        
    }
    
    

    public void  getNomiCaniConPadrone(String nomePadrone)
    {
    		String NomiCaniConPadrone = null;
        for (int i = 0; i < canePadrone.length; i++)
        {
            if ( nomePadrone.equals( canePadrone[i].getPadrone().getNome() ) )
                NomiCaniConPadrone = canePadrone[i].getCane().getNome();
          
        }
        
       System.out.println(NomiCaniConPadrone); 
    }
    
    
    public String[]  getNomiCaniConPadrone2(String nomePadrone)
    {
        String[] NomiCaniConPadrone = new String[contaNumeroCaniConPadrone( nomePadrone )];
        int j = 0;
        for (int i = 0; i < canePadrone.length; i++)
        {
            if ( nomePadrone.equals( canePadrone[i].getPadrone().getNome() ) )
            {
                NomiCaniConPadrone[j] = canePadrone[i].getCane().getNome();
                j++;
            }
        }

        return NomiCaniConPadrone;
    }


    public int contaNumeroCaniConPadrone(String nomePadrone)
    {
        int cont = 0;
        for (int i = 0; i < canePadrone.length; i++)
        {
            if ( nomePadrone.equals( canePadrone[i].getPadrone().getNome() ) )
            {
                cont++;
            }
        }
        return cont;
    }




}
