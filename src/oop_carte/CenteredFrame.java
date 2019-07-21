package oop_carte;

import javax.swing.*;
import java.awt.*;

/**
 * JFrame auto-centrante
 */
@SuppressWarnings("serial")
public class CenteredFrame extends JFrame
{
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

    /**
     * Centra questo frame nello schermo
     */
    public void centra(){
        // sposto il frame in centro allo schermo
        // recupero la dimensione dello schermo
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        // recupero la dimensione del JFrame
        int w = this.getSize().width;
        int h = this.getSize().height;
        // calcolo le nuove coordinate
        int x=(dim.width-w)/2;
        int y=(dim.height-h)/2;
        // sposto il JFrame
        this.setLocation(x,y);
    }
}
