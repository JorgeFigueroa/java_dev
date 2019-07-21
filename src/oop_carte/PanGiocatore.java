package oop_carte;

import javax.swing.*;
import java.awt.*;

/**
 * Pannello grafico con le info su un giocatore
 */
public class PanGiocatore extends JPanel
{

    private Giocatore giocatore;
    private JLabel labelCarte;

    public PanGiocatore(Giocatore giocatore){
        this.giocatore=giocatore;

        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);

        JLabel labelNome = new JLabel(giocatore.getNome());
        labelNome.setAlignmentX(Component.CENTER_ALIGNMENT);

        labelCarte = new JLabel(""+giocatore.getNumCarte());
        labelCarte.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(labelNome);
        add(labelCarte);

        setPreferredSize(new Dimension (60,60));
        setBackground(Color.green);

    }

    /**
     * reseta il panello alle condicione iniziale
     */


    /**
     * Aggiorna le informazioni visualizzate in base ai 
     * dati attualmente presenti nel giocatore
     */
    public void refresh(){
        int num = giocatore.getNumCarte();
        labelCarte.setText(""+num);
        if(num==0){
            setBackground(Color.red);
        }else{
            setBackground(Color.green);
        }
    }
}
