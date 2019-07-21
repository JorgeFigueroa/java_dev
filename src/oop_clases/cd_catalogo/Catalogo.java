/*Rappresenta un catalogo di cd_catalogo
 attributi un nome catalogo e un elenco di cd_catalogo.
 costruttore "standard"

 metodi: get e set delle variabili istanza
 metodo per la stampa dello stato degli attributi
 metodo che trovi il numero di cd_catalogo  di un autore
 metodo che trovi il numero di cd_catalogo in base all'anno di uscita
 metodo che trovi il Cd in base al titolo

 (facoltativo o quando si e concluso l'esercizio) 
 metodo che restituisca l'elenco dei cd_catalogo di un autore
 */
public class Catalogo {
    private String nomeCatalogo;
    private Cd[] listaCd;// @tipo Cd

    public Catalogo(String nomeCatalogo, Cd[] listaCd) {
        this.nomeCatalogo = nomeCatalogo;
        this.listaCd = listaCd;
    }

    public Cd[] getListaCd() {// @return Cd
        return listaCd;
    }

    public void setListaCd(Cd[] listaCd) {// @param Cd[]
        this.listaCd = listaCd;
    }

    public String getNomeCatalogo() {
        return nomeCatalogo;
    }

    public void setNomeCatalogo(String nomeCatalogo) {
        this.nomeCatalogo = nomeCatalogo;
    }

    public void stampa() {
        System.out.println("nomeCatalogo= " + nomeCatalogo);
        for (int i = 0; i < listaCd.length; i++) {
            listaCd[i].stampa();
        }
    }

    /* metodo che trovi il numero di cd_catalogo di un autore */
    public int trovaNumAutore(String autore) {
        int numcd = 0;
        for (int i = 0; i < listaCd.length; i++) {
            if (autore.equals(listaCd[i].getAutore())) {
                numcd++;
            }
        }
        return numcd;
    }


    /* metodo che trovi il numero di cd_catalogo in base all'anno di uscita */
    public int trovaNumAnno(int anno) {
        int y = 0;
        for (int i = 0; i < listaCd.length; i++) {
            if (anno == listaCd[i].getAnno_uscita()) {
                y++;
            }
        }
        return y;
    }

    /* metodo che trovi il Cd in base al titolo */
    public Cd trovaCdtitolo(String titolo) {
        Cd y = null;
        for (int i = 0; i < listaCd.length; i++) {
            if (titolo.equals(listaCd[i].getTitolo())) {
                y = listaCd[i];
            }
        }
        return y;
    }


    //metodo che restituisca l'elenco dei cd_catalogo di un autore
    public Cd[] elencoCdAutore(String autore) {
        int dim = trovaNumAutore(autore);
        Cd[] toRet = new Cd[dim];  //array @tipo Cd
        int j = 0;
        for (int i = 0; i < listaCd.length; i++) {
            if (autore.equals(listaCd[i].getAutore())) {
                toRet[j] = listaCd[i];
                j++;
            }
        }
        return toRet;
    }


}
