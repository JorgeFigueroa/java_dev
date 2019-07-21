package oop_clases.herencia_forme;

/**
 * Aggiungi qui una descrizione della classe Cerchio
 */
public class  Cerchio extends Ellisse
{
    public Cerchio(int raggio){
        super(raggio*2, raggio*2);
    }

    public void disegna(){
        System.out.println("sono Cerchio x= "+x+" y= "+y+"raggio=" +getRaggio());

    }

    public int getRaggio(){
        return getAsse1();
    }
}
