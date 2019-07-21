package oop_carte;

/**
 * Figure delle carte francesi
 */
public enum Figure
{
    ASSO("A"), 

    DUE("2"), 

    TRE("3"), 

    QUATTRO("4"), 

    CINQUE("5"), 

    SEI("6"), 

    SETTE("7"), 

    OTTO("8"),

    NOVE("9"), 

    DIECI("10"), 

    FANTE("J"), 

    DONNA("Q"), 

    RE("K");

    private String nome;

    private Figure(String nome){
        this.nome=nome;
    }

    public String toString(){
        return nome;
    }

}
