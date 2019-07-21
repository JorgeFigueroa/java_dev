/*
 Esercizio CD Scrivere una classe  che rappresenti un compact disc tramite gli
 attributi opportuni: titolo, autore, anno di uscita e elenco delle canzoni. 

 costruttore che inizializzi tutti gli attributi con passaggio di parametri 
 costruttore che prenda il numero delle tracce in input e inizializzi l'attributo
 canzoni in automatico (ad esempio le tracce avranno nome del tipo: Track1, Track2 etc)

 metodi: get e set delle variabili istanza  ---ok
 metodo per la stampa dello stato degli attributi 
 metodo che trova il numero della traccia dato il nome

 Scrivere un main per testare la classe in modo da usare i due costruttori,

 metodo stampa e il metodo di ricerca della traccia
 * */

public class Cd {
	private String titolo;
	private String autore;
	private int anno_uscita;
	private String[] elenco_canzoni;

	public Cd(String titolo, String autore, int anno_uscita, String[] elenco_canzoni) {
		super();
		this.titolo = titolo;
		this.autore = autore;
		this.anno_uscita = anno_uscita;
		this.elenco_canzoni = elenco_canzoni;
	}

	public Cd(int canzone) {
		this.titolo = "reggeton";
		this.autore = "don omar";
		this.anno_uscita = 2015;
		elenco_canzoni(canzone);
	}

	public void elenco_canzoni(int numeroBrani) {
		elenco_canzoni = new String[numeroBrani];
		for (int i = 0; i < numeroBrani; i++) {
			elenco_canzoni[i] = "track" + (i + 1);
		}
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public int getAnno_uscita() {
		return anno_uscita;
	}

	public void setAnno_uscita(int anno_uscita) {
		this.anno_uscita = anno_uscita;
	}

	public String[] getElenco_canzoni() {
		return elenco_canzoni;
	}

	public void setElenco_canzoni(String[] elenco_canzoni) {
		this.elenco_canzoni = elenco_canzoni;
	}

	public void stampa() {
		System.out.println("Cd titolo= " + titolo + ", autore= " + autore
				+ ", anno_uscita= " + anno_uscita);
		for (int i = 0; i < elenco_canzoni.length; i++) {
			System.out.println(elenco_canzoni[i]);
		}
	}

	/* un metodo che trova il numero della traccia dato il nome */
	public int trovaTraccia(String pasaCanzone) {
		for (int i = 0; i < elenco_canzoni.length; i++) {
			if (elenco_canzoni[i].toUpperCase().equals(
					pasaCanzone.toUpperCase())) {
				return i + 1;
			}
		}
		return -1;
	}

}



















