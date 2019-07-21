package C10_pjBasico;
import javax.swing.DefaultListModel;

public class frmBasico extends javax.swing.JFrame {
    //Declaracion del arreglo unidimensional
    int a[]=new int[6];

    public frmBasico() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstR = new javax.swing.JList();
        btnMostrar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        lstR.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Numeros"));
        lstR.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(lstR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 50, 230, 210);

        btnMostrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(260, 50, 110, 30);

        btnOrdenar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdenar);
        btnOrdenar.setBounds(260, 80, 110, 30);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("ARREGLO BASICO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 120, 18);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-400)/2, (screenSize.height-318)/2, 400, 318);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        //Enviar los valores al arreglo
        a[0]=10;
        a[1]=20;
        a[2]=70;
        a[3]=30;
        a[4]=80;
        a[5]=15;

        int suma=calculaSuma();
        double promedio=calculaPromedio(suma);
        int mayor=determinaMayor();

        //enviarlo a la lista
        DefaultListModel moNumeros=new DefaultListModel();
        for(int i=0;i<=5;i++){
            moNumeros.addElement(a[i]);
        }
        moNumeros.addElement("La suma es: "+suma);
        moNumeros.addElement("El Promedio es: "+promedio);
        moNumeros.addElement("La Longitud: "+a.length);
        moNumeros.addElement("EL Mayor es: "+mayor);
        lstR.setModel(moNumeros);
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
       ordenaAscendente();
    }//GEN-LAST:event_btnOrdenarActionPerformed

    void ordenaAscendente(){
        int temp;
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a.length;j++)
                if (a[i]<a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

        DefaultListModel moNumeros=new DefaultListModel();
        for(int i=0;i<=5;i++){
            moNumeros.addElement(a[i]);
        }
        lstR.setModel(moNumeros);
    }


    int determinaMayor(){
        int mayor=Integer.MIN_VALUE;
       for(int i=0;i<a.length;i++){
           if(a[i]>mayor)
               mayor=a[i];
       }
        return mayor;
    }
    double calculaPromedio(int suma){
        return (suma*1.0/a.length);
    }

    int calculaSuma(){
        int s=0;
        for(int i=0;i<=5;i++){
            s+=a[i];
        }
        return s;
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBasico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstR;
    // End of variables declaration//GEN-END:variables

}
