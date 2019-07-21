
package cap_04_swing;
import javax.swing.*;

public class Areadetexto extends JFrame {
    
    private JTextField campo1;
    private JTextArea campo2;
    private JScrollPane scroll1;
    
    public Areadetexto(){
        setLayout(null);
        campo1=new JTextField();
        campo1.setBounds(10,10,200,30);
        add(campo1);
        campo2 = new JTextArea();
        scroll1 = new JScrollPane(campo2);
        scroll1.setBounds(10,50,400,300);
        add(scroll1);
    
    }
    
    public static void main(String[] args) {
        Areadetexto ventana = new Areadetexto();
        ventana.setBounds(0,0,540,400);
        ventana.setVisible(true);
    }
}
