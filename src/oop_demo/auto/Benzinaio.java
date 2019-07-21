package oop_demo.auto;
public class Benzinaio
{
    // variabili d'istanza
    private int litrideposito;// litri nell deposito
    private double incasso;// incasso totale
    private double prezzo;// prezzo al litro
    private int numRifornimento;

    /**costruttore di oogetti di classe Benzinaio
     * @ param litri - litri iniziali nel deposito
     * @param prezzo - prezzo di vendita
     */
    public Benzinaio(int litri, double prezzcarbu){
        this.litrideposito = litri;
        this.prezzo = prezzcarbu;
    }

    /**effetua un rifornimento per undato numero di litri
     * se il deposito non basta, vende solo quello disponibile
     * @param litri - il numero di litri richiesti
     */
    public void rifornisci(int litri){
        //se manca la disponibilita reduce la richiesta
        if(litri>litrideposito){
            litri = litrideposito;
            litri =0;
        }
        litrideposito = litrideposito - litri;
        incasso = incasso + (litri * prezzo);
        numRifornimento++;
    }

    /** stampa lo stato del benzinaio*/
    public void stampaStato(){
        String s = "Q.ta rimasta:, " +litrideposito+", n.rifornimenti: " +numRifornimento;
        System.out.println(s);
    }
}