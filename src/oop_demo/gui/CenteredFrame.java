package oop_demo.gui;
import javax.swing.*;
import java.awt.*;

/**JFrame auto-centrante */
public class CenteredFrame extends JFrame
{
    /**Costruttore degli oggetti di classe  CenteredFrame */
    public CenteredFrame(String titolo){
        super(titolo);
    }

    public CenteredFrame(){
        super();
    }

    public void pack(){
        super.pack();
        centra();
    }

    public void centra(){

        //recupero le dimensione dello schermo
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //recupero le dimensione JFrame
        int w = this.getSize().width;
        int h = this.getSize().height;

        //calcolo le coordinate
        int x=(dim.width-w)/2;
        int y=(dim.height-h)/2;

        //sposto il JFrame
        this.setLocation(x,y);
    }
}
