package oop_clases.herencia_forme;


/**
 * Classe  Forma2D  forma geometrica astratta
 */
public abstract class Hereda_Forma2D
{
    // variabili d'istanza 
    public int x;
    public int y;

    /**sposta la forma sul piano alle nuove coordinate*/
    public void mouvi(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    /**disena le forme sul piano*/
    abstract void disegna();

    /**calcola l'area della forma */
    public abstract double calcArea();

}
