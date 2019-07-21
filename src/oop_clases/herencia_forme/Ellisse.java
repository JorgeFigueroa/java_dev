package oop_clases.herencia_forme;


/**
 * Aggiungi qui una descrizione della classe Ellisse
 */
public class Ellisse extends Hereda_Forma2D
{
    // variabili d'istanza
    private int an1;
    private int an2;
    public Ellisse(int a1, int a2){
        this.an1 = a1;
        this.an2 = a2;
    }

    public void disegna(){
        System.out.println("sono Ellisse x= "+x+" y= "+y+"an1="+an1+ "an2="+an2);
    }

    public int getAsse1(){
        return an1;
    }

    public double calcArea(){
        return (an1/2)*(an2/2)*Math.PI;
    }
}
