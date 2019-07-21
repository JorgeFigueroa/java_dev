package oop_demo;

/**
 * Aggiungi qui una descrizione della classe Alimento
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Alimento
{
    // variabili d'istanza
    private String nome;

    /**
     * Costruttore degli oggetti di classe  Alimento
     */
    public Alimento(String nome)
    {
        this.nome = nome;
    }
    
    public String toString(){
        return nome;
    }
}
