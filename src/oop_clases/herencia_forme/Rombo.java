package oop_clases.herencia_forme;

/**
 */
public class Rombo extends Hereda_Forma2D
{
    private int dia1;
    private int dia2;
    public Rombo(int d1, int d2){
        this.dia1 = d1;
        this.dia2 = d2;
    }

    public void disegna(){
        System.out.println("sono un Rombo x= " +x+" y= "+y);
    }

    public double calcArea(){
        double area = 6;
        return area;
    }
}
