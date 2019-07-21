package oop_carte;

/**
 * Colori
 */
public enum Colori
{
    WHITE("Bianco"), 


    RED("Rosso"), 


    VERDE("Verde"), 


    BLU("Blu"), 


    NERO("Nero");

    private String nome;

    private Colori(String nome){
        this.nome=nome;
    }

    public String toString(){
        return nome;
    }

}
