package C10_pjBiNumeros.pFormularios;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import C10_pjBiNumeros.pClases.ArregloBiNumeros;

public class frmBiNumeros extends javax.swing.JFrame {

    DefaultListModel moRespuesta=new DefaultListModel();
    ArregloBiNumeros aN;
    
    public frmBiNumeros() {
        initComponents();
        lstResumen.setModel(moRespuesta);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        txtColumnas = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tNumeros = new javax.swing.JTable();
        btnFilas = new javax.swing.JButton();
        btnColumnas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstResumen = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("MATRIZ DE NUMEROS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 10, 170, 20);

        txtFilas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtFilas.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Filas"));
        getContentPane().add(txtFilas);
        txtFilas.setBounds(20, 40, 130, 60);

        txtColumnas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtColumnas.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Columnas"));
        getContentPane().add(txtColumnas);
        txtColumnas.setBounds(160, 40, 140, 60);

        btnGenerar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnGenerar.setText("GENERAR");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar);
        btnGenerar.setBounds(10, 100, 290, 30);

        jScrollPane1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N

        tNumeros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "", "", ""
            }
        ));
        jScrollPane1.setViewportView(tNumeros);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 290, 150);

        btnFilas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnFilas.setText("SUMA DE FILAS");
        btnFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilasActionPerformed(evt);
            }
        });
        getContentPane().add(btnFilas);
        btnFilas.setBounds(10, 290, 130, 23);

        btnColumnas.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnColumnas.setText("SUMA DE COLUMNAS");
        btnColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumnasActionPerformed(evt);
            }
        });
        getContentPane().add(btnColumnas);
        btnColumnas.setBounds(150, 290, 150, 23);

        lstResumen.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen"));
        lstResumen.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(lstResumen);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 320, 290, 160);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-327)/2, (screenSize.height-525)/2, 327, 525);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try{
        moRespuesta.clear();

        //Capturando los valores ingresados en el Formulario
        int filas=getFilas();
        int columnas=getColumnas();

        //
        if (filas>0 && columnas>0 && filas<=3 && columnas<=3){
            aN=new ArregloBiNumeros(filas, columnas);
            listar();
        }else
            JOptionPane.showMessageDialog(null,"Error de Datos");
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,"Error de Ingreso de Datos");
    }

    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilasActionPerformed
        int f=Integer.parseInt(JOptionPane.showInputDialog
                                     (this,"Ingrese un numero de Fila: "));
  if (f>getFilas())
      mensaje("El numero de Filas es superior a la matriz");
      else
      moRespuesta.addElement("La Suma de la Fila "+f+" es: "+aN.sumaFila(f));

    }//GEN-LAST:event_btnFilasActionPerformed

    private void btnColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumnasActionPerformed
        int c=Integer.parseInt(JOptionPane.showInputDialog
                         (this,"Ingrese un numero de Columna: "));
   
   if (c>getColumnas())
     mensaje("El numero de Columnas es superior a la matriz");
     else
     moRespuesta.addElement("La Suma de la Columna "+c+" es: "+aN.sumaColumna(c));

    }//GEN-LAST:event_btnColumnasActionPerformed

    public int getFilas(){
        return Integer.parseInt(txtFilas.getText());
    }
    
public int getColumnas(){
        return Integer.parseInt(txtColumnas.getText());
    }

void listar(){
         limpiar();
         int x;
         for(int i=0;i<getFilas();i++){
            for(int j=0;j<getColumnas();j++){
                x=aN.obtener(i,j);
                tNumeros.setValueAt(x, i, j);
            }
        }
}

void limpiar(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                tNumeros.setValueAt("", i, j);
            }
        }
}

void mensaje(String s){
        JOptionPane.showMessageDialog(null, s);
}

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmBiNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBiNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBiNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBiNumeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBiNumeros().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColumnas;
    private javax.swing.JButton btnFilas;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstResumen;
    private javax.swing.JTable tNumeros;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}
