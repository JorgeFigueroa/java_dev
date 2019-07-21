package cap_02_clases;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Escribir extends JFrame implements ActionListener{
	
	JTextField entrada;
	File archivo;
	JButton boton;

	// costructor
	public Escribir() {
		entrada = new JTextField("escribe");
		boton = new JButton("guardar");
		add(entrada);
		add(boton);
		boton.addActionListener(this);
		
		Container contenedor = getContentPane();
		contenedor.add(entrada, BorderLayout.NORTH);
		
		setSize(400,400);
		setVisible(true);
	}
	
	public static void main(String []arg){
		Escribir escribir = new Escribir();
		escribir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String texto = entrada.getText();
		
		if(e.getSource()==boton){
			File archivo = new File("file.txt");
			
			try{
				FileWriter writer = new FileWriter(archivo);
				
				PrintWriter escribir = new PrintWriter(writer);
				escribir.append("hola");
				escribir.println();
				escribir.append(texto);
				escribir.close();
				
			}catch (Exception e2){
				e2.printStackTrace();
			}
	
		}
	}

}
