package oop_demo.auto;
/**
 * Aggiungi qui una descrizione della classe Luogo
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Luogo
{
    private String nome;

    /** Costruttore degli oggetti di classe  Luogo*/
    public Luogo(String nome)
    {
        this.nome = nome;
    }
    
    public String toString(){
        return nome;
    }
}
