package oop_demo;

/**
 * Aggiungi qui una descrizione della classe Paolo
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Paolo extends Persona implements Sviluppatore, Idraulico
{
    public Paolo()
    {
        super("pablo","berlan");
    }

    public void dichiaraMetodo(){
        System.out.println("dichiara metodo");
    }

    public void inizializaVariabile(){
        System.out.println("inizializa variabile");
    }

    public void sviluppaGestionale(){
        System.out.println("sviluppa gestionale");
    }

    public void instalaSanitario(){
        System.out.println("ho instalato sanitario ");
    }

    public void riparaPerdita(){
        System.out.println("perdita e stata riparato");
    }

    public void sturaLavandino(){
        System.out.println("lavandino sturato il lavandino");
    }
}
