package oop_clases.herencia_forme;

/**
 */
public class Pentagono extends Hereda_Forma2D
{
    private int lato;
    private int perimetro;
    Pentagono(int la , int peri){
        this.lato = la;
        this.perimetro = peri; 
    }

    public void disegna(){
        System.out.println("sono un Pentagono x= " +x+" y= "+y+"area= "+ calcArea());
    }

    public double calcArea(){
        return (lato*5)*lato*0.688/2;
    }
}
