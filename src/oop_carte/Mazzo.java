package oop_carte;

import java.util.*;

/**
 * Un mazzo da 52 carte francesi
 */
public class Mazzo
{

    private ArrayList<Carta> carte = new ArrayList<Carta>();

    /**
     * Costruttore degli oggetti di classe Mazzo.
     * Crea le 52 carte iniziali e le aggiunge alla lista.
     */
    public Mazzo()
    {
        for(Semi seme : Semi.values()){
            for(Figure figura : Figure.values()){
                Carta c = new Carta(figura, seme);
                carte.add(c);
            }
        }
    }

    /**
     * Stampa tutte le carte attualmente contenute nel mazzo
     */
    public void scopri(){
        for(Carta c : carte){
            System.out.println(c);
        }
    }

    /**
     * Mischia le carte attualmente contenute nel mazzo
     */
    public void mischia(){
        Collections.shuffle(carte);
    }

    /**
     * Estrae una carta a caso dal mazzo.
     * @return la carta estratta
     * Se il mazzo è vuoto ritorna null
     */
    public Carta estraiRandom(){
        Carta c=null;
        if(carte.size()>0){
            int random = new Random().nextInt(carte.size());
            c=carte.get(random);
            carte.remove(random);
        }
        return c;
    }

    /**
     * Estrae una carta dalla cima del mazzo.
     * @return la carta estratta
     */
    public Carta estraiTop(){
        Carta c=null;
        if(carte.size()>0){
            c=carte.get(0);
            carte.remove(0);
        }
        return c;
    }

    /**
     * Estrae un dato numero di carte dalla cima del mazzo.
     * @param quante il numero di carte da estrarre
     * @return le carte estratte
     */
    public Carta[] estraiTop(int quante){

        // se non bastano le carte, abbasso il numero richiesto
        if(this.carte.size()<quante){
            quante=this.carte.size();
        }
        
        // estraggo le carte richieste e le metto nell'array di output
        Carta[] carte = new Carta[quante];
        for(int i=0; i<quante; i++){
            Carta c = estraiTop();
            carte[i]=c;
        }
        
        return carte; 
    }
    
    /**
     * Riordina le carte nel mazzo per seme e sotto per figura.
     */
    public void ordina(){
        Collections.sort(carte);
    }
    
    /**
     * Ritorna il numero di carte presenti nel mazzo.
     * @return il numero di carte
     */
    public int size(){
        return carte.size();
    }
      

}
