package oop_demo.gui;
import javax.swing.*;
import java.awt.*;
/**la classe  Bandiera diventa un JPanel con extends JPanel*/
public class Bandiera extends JPanel
{
    /**
     * construice una bandiera a scelta
     * @param c1 colore della prima faccia
     * @param c2 colore della prima faccia
     * @param c3 colore della prima faccia
     */
    public Bandiera(){
        this(Color.red, Color.white, Color.red);
    }

    /**crea bandiera italiana*/
    public  Bandiera(Color c1, Color c2, Color c3){
        Dimension dim = new Dimension(60,90);

        JPanel panel1 = new JPanel();
        panel1.setPreferredSize(dim);
        panel1.setBackground(c1);

        JPanel panel2 = new JPanel();
        panel2.setBackground(c2);
        panel2.setPreferredSize(dim);

        JPanel panel3 = new JPanel();
        panel3.setBackground(c3);
        panel3.setPreferredSize(dim);

        add(panel1);
        add(panel2);
        add(panel3);
    }

}
