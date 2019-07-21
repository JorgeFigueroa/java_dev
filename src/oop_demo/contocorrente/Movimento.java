package oop_demo.contocorrente;
import java.util.*;

/**
 * Movimento di conto corrente
 */
public class Movimento
{
    private String tipo;
    private Date data;
    private String descrizione;
    private double importo;

    /**
     * Crea un nuovo movimento.
     * @param tipo - tipo del movimento ("D","P","I")
     * @param data - data del movimento
     * @param descrizione - descrizione del movimento
     * @param importo - importo del movimento
     */
    public Movimento(String tipo, Date data, String descrizione, double importo){
        this.tipo=tipo;
        this.data=data;
        this.descrizione=descrizione;
        this.importo=importo;
    }
    
    /**
     * Crea un nuovo movimento in data odierna.
     * @param tipo - tipo del movimento ("D","P","I")
     * @param descrizione - descrizione del movimento
     * @param importo - importo del movimento
     */
    public Movimento(String tipo, String descrizione, double importo){
        this(tipo, new Date(), descrizione, importo);
    }

    public String toString(){
        return tipo+", "+data+", "+descrizione+", "+importo;
    }
    
    /**
     * Ritorna l'importo del movimento
     * @return l'importo
     */
    public double getImporto(){
        return importo;
    }
    

}
