package oop_clases.herencia_forme;

/**
 */
public class Rettangolo extends Hereda_Forma2D
{
    // variabili d'istanza
    private int base;
    private int altezza;
    public Rettangolo(int bas, int alte){
        this.base = bas;
        this.altezza = alte;
    }

    public void disegna(){
        System.out.println("sono un Rettangolo x= " +x+" y= "+y+ " b= " + base + " h= "+ altezza);
    }

    public int getBase(){
        return base;
    }

    public double calcArea(){
        return base*altezza;
    }

}
