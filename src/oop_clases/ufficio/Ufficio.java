

/*----------------------------------------------------------------
*
*  Classe Ufficio che abbia: come unico attributo un array di impiegati,
*  costruttore che prenda in input un array di tipo Impiegato,
*  metodo getNomeImpiegato che restituisca il nome dell'impiegato in posizione i passata come parametro,
*  metodo getStipendioImpiegato analogo al precedente,
*  metodo stampaUfficio che stampi a video tutti gli impiegati con i relativi stipendi,
*  metodo ricerca che dato il nome di un impiegato ne restituisca la posizione nell'array,
*  metodo aumenta che dati posizione dell'impiegato nell'array e importo aumenti lo stipendio correttamente.
*
*-------------------------------------------------------------------*/


public class Ufficio {

    //  attributo un array di @tipo impiegati
    Impiegato[] impiegato;


    //  costruttore @param array tipo impiegato
    public Ufficio(Impiegato[] impiegato) {
        this.impiegato = impiegato;
    }


    //  metodi
    public String getNomeImpiegato(int i) {
        return impiegato[i].getNome(); // @return  nome dell'oggetto Impiegato in posizione i nell'array
    }

    public int getStipendioImpiegato(int i) {
        return impiegato[i].getStipendio();
    }


    public void stampaUfficio() {
        for (int i = 0; i < impiegato.length; i++) {
            System.out.println(getNomeImpiegato(i) + " - " + getStipendioImpiegato(i));
        }
    }


    //  metodo ricerca posizione de un impiegato
    //  @param nome di un impiegato @return la posizione nell'array,
    public int ricerca(String nome) {
        for (int i = 0; i < impiegato.length; i++) {
            if (nome.equals(impiegato[i].getNome())) // confronto il parametro: con il nome impiegato
                return i;
        }
        return -1; // altrimenti ritorno -1
    }


    //  metodo aumenta che dati posizione dell'impiegato nell'array e importo aumenti lo stipendio correttamente
    public void aumenta(int i, int x) {
        impiegato[i].aumentaStipendio(x);
    }


}
