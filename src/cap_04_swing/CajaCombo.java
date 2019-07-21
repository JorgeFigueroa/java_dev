
package cap_04_swing;
import javax.swing.*;
import java.awt.event.*;

public class CajaCombo extends JFrame implements ItemListener{
    private JComboBox combo1;
    
    public CajaCombo(){
        setLayout(null);
        combo1 = new JComboBox();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        combo1.addItem("Rojo");
        combo1.addItem("Verde");
        combo1.addItem("Azul");
        combo1.addItemListener(this);
    }
    
    public void itemStateChanged(ItemEvent e){
        if(e.getSource()==combo1){
            String seleccionado = (String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
    }
   
    public static void main(String[] args) {
        CajaCombo ventana = new CajaCombo();
        ventana.setBounds(0,0,200,150);
        ventana.setVisible(true);
    }
}
