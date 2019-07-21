package oop_clases.herencia_forme;

/**
 * Aggiungi qui una descrizione della classe Linea
 */
public class Linea extends Hereda_Forma2D
{
    private int lunghezza;
    public Linea(int lu){
        this.lunghezza = lu;
    }

    void disegna(){
        System.out.println("sono Linea x= "+x+" y= "+y+ " l="+lunghezza);
    }

    public double calcArea(){
        return 0;
    }
}
