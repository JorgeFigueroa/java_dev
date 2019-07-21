package oop_carte;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
/**
 * Una carta da gioco.
 */
@SuppressWarnings("serial")
public class Carta extends JPanel implements Comparable<Carta>, TableCellRenderer
{

    private Figure figura;
    private Semi seme;
    /**
     * Costruttore degli oggetti di classe  Carta
     */
    public Carta(Figure figura, Semi seme)
    {
        this.figura=figura;
        this.seme=seme;

        BoxLayout layout = new BoxLayout(this, BoxLayout.Y_AXIS);
        setLayout(layout);

        JLabel labelFigura = new JLabel(figura.toString());
        labelFigura.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel labelSeme = new JLabel(seme.toString());
        labelSeme.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(labelFigura);
        add(labelSeme);

        setPreferredSize(new Dimension (60,60));
    }

    public String toString()
    {
        return figura+" di "+seme;
    }

    public int compareTo(Carta altra){
        int ritorno = -this.figura.compareTo(altra.figura);
        if(ritorno==0){
            ritorno = this.seme.compareTo(altra.seme);
        }
        return ritorno;
    }

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		// TODO Auto-generated method stub
		return null;
	}

	public Figure getFigura() {
		return figura;
	}

	public void setFigura(Figure figura) {
		this.figura = figura;
	}

	public Semi getSeme() {
		return seme;
	}

	public void setSeme(Semi seme) {
		this.seme = seme;
	}
	
	

}
