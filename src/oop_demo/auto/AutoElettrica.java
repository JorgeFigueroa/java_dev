package oop_demo.auto;
/**

 */
public class AutoElettrica extends Automobile
{
    private int percCarica;
    /**ricarica la batteria di una percentuale data maximo
     * @ param perc la percentuale di ricarica
     */
    public void ricarica (int perc) {
        percCarica += perc;
        if( percCarica <100){
            percCarica =100;
        }
    }
}
