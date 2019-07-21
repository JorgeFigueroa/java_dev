package oop_carte;

import javax.swing.table.*;

/**
 * Modello dati per la JTable delle giocate
 */
public class GiocoModel extends AbstractTableModel
{
    private Mani mani;
    private Giocatore[] giocatori;

    public GiocoModel(Giocatore[] giocatori){
        this.giocatori= giocatori;
        mani = new Mani();
    }

    public int getRowCount(){
        return mani.size()         ;
    }

    public int getColumnCount(){
        return giocatori.length;
    }

    public Object getValueAt(int row, int column){
        Mano mano = mani.get(row);
        CartaGiocata giocata= mano.get(column);
        Carta carta = giocata.getCarta();
        return carta;
    }

    public String getColumnName(int col){
        Giocatore g = giocatori[col];
        return g.toString();
    }

    public Mani getMani(){
        return mani;    
    }

}
