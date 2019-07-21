import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Gara extends JFrame {
	Cavallo c1, c2, c3;

	//costruttore crea alcuni 3 cavalli e  interfaccia con 2 bottoni
	public Gara() {
		super();
		c1 = new Cavallo("peru");
		c2 = new Cavallo("ecuador");
		c3 = new Cavallo("chile");

		setLayout(new FlowLayout());

		JButton boton1 = new JButton("Start sync");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startSync();
			}
		});
		add(boton1);

		JButton boton2 = new JButton("Start Async");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startAsync();
			}
		});
		add(boton2);
		pack();
		setVisible(true);
	}

	

	
	public void startSync() {
		Thread t;
		t = new Thread(c1);
		t.start();
		t = new Thread(c2);
		t.start();
		t = new Thread(c3);
		t.start();
	}

	protected void startAsync() {
		System.out.println("\n\nstart!");
		c1.run();
		c2.run();
		c3.run();
		System.out.println("END");

	}
	
	public static void main(String[] args) {
		new Gara();
	}

}
