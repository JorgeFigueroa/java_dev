package oop_demo;

/**
 * Aggiungi qui una descrizione della classe Persona

 */
public abstract class Persona
{
    private String nome;
    private String cognome;

    public  Persona(String nom, String cogno){
        this.nome=nom;
        this.cognome=cogno;
    }

    public void mangia(){
        System.out.println("che famme");
    }

    public void dormi(){
        System.out.println("ZZZZZZZ");
    }

    public String toString(){
        return nome+" "+cognome;
    }

}
