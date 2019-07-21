public class Cavallo implements Runnable{

	// variabile di intanza
	private final String nome;

	//costruttore con nome del cavallo
	public Cavallo(String nome) {
		super();
		this.nome = nome;
	}

	public void run() {
		// stampa nome + partito
		System.out.println("Parte "+ nome);

		// esegue 10 cicli e per ogni uno stampoa il nome del cavallo e il nome
		for (int i = 0; i < 10; i++) {
			System.out.println( nome + " " + (i + 1));
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		// stampa nome + "Arrivato"
		System.out.println("ARRIVATO " + nome);
	}

	public static void main(String[] args) {
		Cavallo cavallo;
		cavallo = new Cavallo("Ribot"); // creiamo un Runnable
		cavallo.run(); // eseguiamo il runnable
	}

}
