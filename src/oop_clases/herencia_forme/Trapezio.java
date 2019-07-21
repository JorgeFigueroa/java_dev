package oop_clases.herencia_forme;

/**
 */
public class Trapezio extends Hereda_Forma2D
{
    // variabili d'istanza
    private int base1;
    private int base2;
    private int alteza;
    public Trapezio(int b1, int b2, int h){
        this.base1 = b1;
        this.base2 = b2;
        this.alteza = h;
    }

    public void disegna(){
        System.out.println("sono un Pentagono x= " +x+" y= "+y+"basem"+base1+"base2"+base2+"alteza"+alteza);
    }

    public double calcArea(){
        return (base1+base2)*alteza/2;
    }

    int getBaseMaggiore(){
        return base1;
    }

}
