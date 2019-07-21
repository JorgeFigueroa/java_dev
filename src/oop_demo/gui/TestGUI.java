package oop_demo.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestGUI {
	public static void main(String arg[]) {
		/** crea un Jframe con dimensione e lo rende visible */

		// Crea un JFrame con le dimensione
		CenteredFrame frame = new CenteredFrame("Titolo del mio JFrame");

		// aggiungo un JPanel a JFrame
		frame.add(new Bandiera(Color.green, Color.white, Color.red));

		JButton bottone = new JButton("Click!!");
		frame.add(bottone, BorderLayout.PAGE_END);

		// aggiungo un listener al botone come clase anonima
		bottone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("clicato");
			}
		});

		bottone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent x) {
				System.out.println("secondo listener!!");
			}
		});
		// quando clicco il bottone dve stampare "clicato"

		// Mostra la finestra
		frame.pack();
		frame.setVisible(true);

	}

	/** crea un JPanel con colore e dimensione e lo ritorna */
	private static JPanel creJpanel() {
		JPanel jpanel = new JPanel();
		jpanel.setPreferredSize(new Dimension(200, 100));
		jpanel.setBackground(Color.green);

		return jpanel;
	}

}
