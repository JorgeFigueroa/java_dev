package oop_carte;

import java.util.*;


/**
 * Aggiungi qui una descrizione della classe Giocatore
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Giocatore implements Comparable <Giocatore>
{

    private String nome;
    private ArrayList<Carta> carte = new ArrayList<Carta>();

    /**
     * Costruttore degli oggetti di classe  Giocatore
     */
    public Giocatore(String nome)
    {
        this.nome=nome;
    }

    /**
     * Pesca un certo numero di carte da un mazzo e 
     * le aggiunge in coda al mazzetto.
     * @param m il mazzo dal quale pescare
     * @param quante  il numero di carte da pescare
     */
    public void pesca(Mazzo m, int quante)
    {
        Carta[] estratte = m.estraiTop(quante);
        for(Carta c : estratte){
            carte.add(c);
        }
    }

    /**
     * Gioca la prima carta del mazzetto.
     * Se il mazzetto è vuoto ritorna null
     * @return la carta giocata
     */
    public Carta gioca(){
        Carta c=null;
        if(carte.size()>0){
            c=carte.get(0);
            carte.remove(0);
        }
        return c;
    }

    /**
     * Aggiunge una carta in fondo al mazzetto.
     * @param c la carta da aggiungere
     */
    public void add(Carta c){
        carte.add(c);
    }
    
    public String getNome(){
        return nome;
    }

    /**
     * Restituisce il numero di carte che ha il giocatore
     */
    public int getNumCarte(){
        return carte.size();
    }

    public String toString(){
        return nome+", "+carte.size()+" carte";
    }
    
    /**
     * Elimina tutte le carte nel mazzetto
     */
    public void svuotaCarte(){
        carte.clear();
    }
    
    public int compareTo(Giocatore altro){
        Integer numQueste = carte.size();
        Integer numAltre = altro.carte.size();
        return -numQueste.compareTo(numAltre);
    }

}
