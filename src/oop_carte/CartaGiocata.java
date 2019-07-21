package oop_carte;

/**
 * Una Carta Giocata da un giocatore
 */
public class CartaGiocata implements Comparable<CartaGiocata>
{

    private Carta carta;
    private Giocatore giocatore;

    /**
     * Costruttore degli oggetti di classe  CartaGiocata
     */
    public CartaGiocata(Carta carta, Giocatore giocatore)
    {
        this.carta=carta;
        this.giocatore=giocatore;

    }
    public int compareTo(CartaGiocata altra){
        return this.carta.compareTo(altra.carta);
    }

    public String toString(){
        return carta+" -> "+giocatore;
    }

    public Giocatore getGiocatore(){
        return giocatore;
    }

    public Carta getCarta(){
        return carta;
    }

}
