package oop_clases.bici;


public class Bici {
    // atributi
    String modello;
    Persona Proprietario; // @atributo tipo bici.Persona potra usare tutti metodi della clase bici.Persona
    int velocita;
    int marcia;

    // costruttori
    public Bici(String modello, Persona Proprietario, int velocita, int marcia) {//@param tipo persona
        this.modello = modello;// this hace riferimento a los atributos
        this.Proprietario = Proprietario;
        this.velocita = velocita;
        this.marcia = marcia;
    }

    public Bici(String modello, Persona Propietario) {
        this.modello = modello;
        this.Proprietario = Propietario;
    }


    // metodi get restituice il atributo
    public String getmodello() {
        return modello;
    }

    public int getVelocita() {
        return velocita;
    }

    public int getMarcia() {
        return marcia;
    }


    // metodi set cambia valori del atributo con il parametro
    public void setAumentaVelocita(int velocita) {
        this.velocita += velocita;
    }

    //  void non serve return
    public void setCambiMarcia(int marcia) {
        this.marcia = marcia;
    }


    //  stampa lo stato Proprietario.getNome() usa metodo de la clase bici.Persona
    public void stampaStato() {
        System.out.println("Modello " + getmodello() + ", Propietario " + Proprietario.getNome() + " " + Proprietario.getCognome() +
                ", Velocita " + getVelocita() + ", Marcia " + getMarcia());
    }

}
