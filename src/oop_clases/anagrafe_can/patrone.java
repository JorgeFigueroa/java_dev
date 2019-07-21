package oop_clases.anagrafe_can;


public class patrone {

    // atributi
    private String nome;
    private String cognome;
    private String CodiceFiscale;

    // costruttore
    public patrone(String nome, String cognome, String codicefiscale) {
        this.nome = nome;
        this.cognome = cognome;
        this.CodiceFiscale = codicefiscale;
    }

    // metodi get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCodiceFiscale() {
        return CodiceFiscale;
    }

    public void setCF(String codicefiscale) {
        this.CodiceFiscale = codicefiscale;
    }

}
