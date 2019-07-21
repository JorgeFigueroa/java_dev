package oop_clases.bici;

public class Persona {

    //  atributi
    String nome;
    String cognome;
    int eta;
    char sesso;

    //  costruttori
    public Persona(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
    }

    public Persona(String nome, String cognome, int eta, char sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.sesso = sesso;
    }

    //  metodi get restituice il valore del atributo
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public int getEta() {
        return eta;
    }


    //  metodi set cambia valori dei atributi parametro ricevuto
    public String setNome(String nome) {
        return this.nome = nome;
    }

    public String setCognome(String cognome) {
        return this.cognome = cognome;
    }

    public int setEta(int eta) {
        return this.eta = eta;
    }

    //  stampa stato delle bici
    public void stampaStato() {
        System.out.println(getNome() + " " + getCognome() + " " + getEta());
    }


}