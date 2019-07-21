import java.util.Scanner;

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
 */
public class Main_cd {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		Cd cd1 = new Cd("suna", "mar de copas", 1980, new String[] { "suna","mdc", "cda" });
  
		Cd cd2 = new Cd(4);

		cd1.stampa();
		cd2.stampa();

		System.out.println("ricerca brano");
		int numBrano = cd1.trovaTraccia(tastiera.nextLine());

		while (numBrano == -1) {
			System.out.println("brano no");
			System.out.println("ricerca altrobrano");
			numBrano = cd1.trovaTraccia(tastiera.nextLine());
		}
		System.out.println("il tuo brano è " + numBrano);
		
		tastiera.close();
	}
}
