package oop_carte;

import javax.swing.JPanel;

/**
 * Aggiungi qui una descrizione della classe CartaRenderer
 * 
 * @author (il tuo nome)
 * @version (un numero di versione o una data)
 */
public class CartaRenderer

{
	private Mani mani;

	public CartaRenderer(Mani mani) {
		this.mani = mani;
	}

	// creo una nuova carta per il video
	Carta carta;
	Semi seme = carta.getSeme();
	Figure figura = carta.getFigura();
	Carta carta2 = new Carta(figura, seme);

	JPanel pan = new JPanel();
	// pan.setLayout ( new Boxlayout

	public Semi getSeme() {
		return seme;
	}

}
