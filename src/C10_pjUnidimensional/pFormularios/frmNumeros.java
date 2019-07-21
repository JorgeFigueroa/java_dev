package C10_pjUnidimensional.pFormularios;

import javax.swing.DefaultListModel;

import C10_pjUnidimensional.pClases.arregloNumeros;


public class frmNumeros extends javax.swing.JFrame {

    arregloNumeros aNum = new arregloNumeros();

    public frmNumeros() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMostrar = new javax.swing.JButton();
        btnOrdenar = new javax.swing.JButton();
        lstR = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(270, 60, 100, 30);

        btnOrdenar.setText("ORDENAR");
        btnOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarActionPerformed(evt);
            }
        });
        getContentPane().add(btnOrdenar);
        btnOrdenar.setBounds(270, 90, 100, 30);

        lstR.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Numeros"));
        lstR.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        getContentPane().add(lstR);
        lstR.setBounds(20, 60, 230, 190);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("ARREGLO DE NUMEROS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 200, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 408) / 2, (screenSize.height - 305) / 2, 408, 305);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarActionPerformed
        aNum.ordenaAscendente();
        //enviarlo a la lista
        DefaultListModel moNumeros = new DefaultListModel();
        for (int i = 0; i <= 5; i++) {
            moNumeros.addElement(aNum.devuelveValor(i));
        }
        lstR.setModel(moNumeros);
    }//GEN-LAST:event_btnOrdenarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        int suma = aNum.calculaSuma();
        double promedio = aNum.calculaPromedio(suma);
        int mayor = aNum.determinaMayor();

        //enviarlo a la lista
        DefaultListModel moNumeros = new DefaultListModel();
        for (int i = 0; i <= 5; i++) {
            moNumeros.addElement(aNum.devuelveValor(i));
        }
        moNumeros.addElement("La suma es: " + suma);
        moNumeros.addElement("El Promedio es: " + promedio);
        moNumeros.addElement("La Longitud: " + aNum.tamaño());
        moNumeros.addElement("EL Mayor es: " + mayor);
        lstR.setModel(moNumeros);
    }//GEN-LAST:event_btnMostrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNumeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList lstR;
    // End of variables declaration//GEN-END:variables

}
