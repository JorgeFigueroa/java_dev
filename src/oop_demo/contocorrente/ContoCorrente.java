package oop_demo.contocorrente;
import java.util.*;

/**
 * ContoCorrente
 */
public class ContoCorrente
{

    //private int saldo;
    private int numero;
    private static int contatore;
    private ArrayList<Movimento> movimenti = new ArrayList<Movimento>();

    /**
     * Costruttore vuoto
     */
    public ContoCorrente()
    {
        this(0);
    }

    /**
     * Costruttore con saldo
     */
    public ContoCorrente(int saldoIniziale)
    {
        if(saldoIniziale!=0){
            Movimento m = new Movimento("V","deposito iniziale",saldoIniziale);
            movimenti.add(m);
        }
        //saldo=saldoIniziale;
        contatore++;
        numero=contatore;
    }

    /**
     * Versa un dato importo.
     * @param importo da versare
     */
    public void versa(int quanto){
        Movimento m = new Movimento("V","versamento",quanto);
        movimenti.add(m);
        //saldo+=quanto;
    }

    /**
     * Preleva un dato importo.
     * @param importo da versare
     */
    public void preleva(int quanto){
        Movimento m = new Movimento("P","prelievo",-quanto);
        movimenti.add(m);
        //saldo-=quanto;
    }

    /**
     * Applica un dato interesse percentuale.
     * @param interesse percentuale
     */
    public void applicaInteresse(int perc){
        double aggiunta = getSaldo()/100*perc;
        int valore = (int)aggiunta;
        Movimento m = new Movimento("I","interesse "+perc+"%",valore);
        movimenti.add(m);
        //saldo = saldo+valore;
    }

    /**
     * Stampa il saldo
     */
    public void stampaSaldo(){
        System.out.println("Saldo: "+getSaldo());
    }

    /**
     * Stampa tutti i movimenti
     */
    public void stampaMovimenti(){
        for(Movimento m : movimenti){
            System.out.println(m);
        }
    }

    /**
     * Calcola il saldo come somma dei movimenti e lo ritorna
     * @return il saldo
     */
    public double getSaldo(){
        double saldo=0;
        for(Movimento m : movimenti){
            double importo = m.getImporto();
            saldo+=importo;
        }
        return saldo;
    }

}
