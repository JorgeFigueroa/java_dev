package oop_anagrafeCanina2.interfaces;

public interface Animale {
	/**
	 * Il 'null object pattern' prevede di creare un'istanza (o una 
	 * implementazione anonima di una interfaccia, come in questo caso)	che sia 
	 * perfettamente neutrale: ovvero che non faccia nulla.
	 * 
	 * A differenza di 'null' che invece genera errori a runtime difficilmente
	 * prevedibili con il 'null object' avremo sempre un riferimento valido.
	 * 
	 * Considerate il seguente codice;
	 * 
	 * Animali[] ar = new Animali[10];
	 * ar[5].getNome(); // null pointer exception;
	 * 
	 * Animali[] ar = new Animali[10];
	 * for(int i = 0; i < 10; i++) { ar[i] = NULL_ANIMAL };
	 * ar[5].getNome(); // nessun errore
	 * 
	 * Il 'null object pattern' è descritto bene su Wiki [0].
	 * 
	 * In molti casi non sarebbe neanche necessario sostiture il classico:
	 * 
	 * if( miaVar == null) { ... } 
	 * 
	 * con 
	 * 
	 * if( miaVar.equals(NULL_OBJECT) { ... }
	 * 
	 * perché il codice valido per una istanza diversa dal NULL_OBJECT
	 * sarà valido anche per il NULL_OBJECT, es. l'invocazione di getNome()
	 * è valida per entrambi e non darà errore, al massimo restituirà una stringa
	 * vuota ma il programma continuerà a funzionare!
	 * 
	 * [0] https://en.wikipedia.org/wiki/Null_Object_pattern
	 * [1] 
	 */
	public static final Animale NULL_ANIMAL = new Animale() {

		@Override
		public String getNome() {
			return "";
		}

		@Override
		public void setNome(String nome) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getEta() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setEta(int eta) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public char getSesso() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setSesso(char sesso) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getIdAnimale() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setIdAnimale(int idAnimale) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
    public String getNome();
    
    public void setNome(String nome);

    public int getEta();
    
    public void setEta(int eta);

    public char getSesso();
    
    public void setSesso(char sesso);

    public int getIdAnimale();
    
    public void setIdAnimale(int idAnimale);
}
