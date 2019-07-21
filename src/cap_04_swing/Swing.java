
package cap_04_swing;
import java.awt.event.*;
import javax.swing.*;

public class Swing extends JFrame implements ActionListener{
    
   private JTextField camporellenable;
   private JLabel etiqueta;
   private JButton boton;
   
    public Swing(){
        setLayout(null);
        //Texto
        etiqueta = new JLabel("Pon el titulo de la ventana:");
        etiqueta.setBounds(30,10,180,20);
        add(etiqueta);
        //Entrada de usuario
        camporellenable = new JTextField();
        camporellenable.setBounds(30,50,150,20);
        add(camporellenable);
        //Boton 
      boton = new JButton("Cambiar");
       boton.setBounds(30,90,150,20);
        add(boton);
        //boton.addActionListener(this);
    }

       public void actionPerformed(ActionEvent e){
           if(e.getSource()==boton){
               String titulo = camporellenable.getText();
               setTitle(titulo);
           }
       }
   
    public static void main(String[] args) {
        Swing ventana1 = new Swing();
        ventana1.setBounds(10, 10, 350, 300);
        ventana1.setVisible(true);
        ventana1.setResizable(false);
        
    }
}
