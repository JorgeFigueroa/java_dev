package oop_clases.herencia_forme;

/**
 */
public class Quadrato extends Rettangolo
{
    public Quadrato (int lato){
        super(lato, lato);
    }

    public void disegna(){
        System.out.println("sono un Quadrato x= " +x+" y= "+y+ " lato " + getBase());
    }

    
}
