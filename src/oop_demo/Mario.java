package oop_demo;

/**
 * Aggiungi qui una descrizione della classe Mario
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Mario extends Persona implements Idraulico
{
    /**
     * Costruttore degli oggetti di classe  Mario
     */
    public Mario()
    {
        super("mario","rossi");
    }

    public void instalaSanitario(){
        System.out.println("sanitario riparato");
    }

    public void riparaPerdita(){
        System.out.println("perdita riparato");
    }

    public void sturaLavandino(){
        System.out.println("lavandino sturato");
    }

}
