
package cap_04_swing;
import javax.swing.*;
import javax.swing.event.*;

public class RespuestaCB extends JFrame implements ChangeListener{
    private JCheckBox check1, check2, check3;
    
    public RespuestaCB(){
    setLayout(null);
    check1 = new JCheckBox("Valencia");
    check1.setBounds(10,10,150,30);
    check1.addChangeListener(this);
    add(check1);
    check2 = new JCheckBox("Barcelona");
    check2.setBounds(10,50,150,30);
    check2.addChangeListener(this);
    add(check2);
    check3 = new JCheckBox("Madrid");
    check3.setBounds(10,90,150,30);
    check3.addChangeListener(this);
    add(check3);
    }
    
    public void stateChanged(ChangeEvent e){
        String titulo="";
        if(check1.isSelected()==true){
            titulo = titulo + "Valencia";
        }
        if(check2.isSelected()==true){
            titulo = titulo + "Barcelona";
        }
        if(check3.isSelected()==true){
            titulo = titulo + "Madrid";
        }
        setTitle(titulo);
    }
    
    public static void main(String[] args) {
        RespuestaCB ventana = new RespuestaCB();
        ventana.setBounds(0,0,300,200);
        ventana.setVisible(true);
    }
}
