package oop_clases.anagrafe_can;

public class Cane_patrone {

    // atributi
    private Cane cane;
    private patrone padrone;

    // costruttore
    public Cane_patrone(Cane cane, patrone padrone) {
        this.cane = cane;
        this.padrone = padrone;
    }

    // metodi get e set
    public Cane getCane() {
        return cane;
    }

    public void setCane(Cane cane) {
        this.cane = cane;
    }

    public patrone getPadrone() {
        return padrone;
    }

    public void setPadrone(patrone padrone) {
        this.padrone = padrone;
    }

}
