package C06_pjModular;

import javax.swing.JOptionPane;

public class frmCompra extends javax.swing.JFrame {
    //
    double monto;
    double empresa;
    double prestamo;
    double credito;
    double interes;
            
    public frmCompra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtMonto = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("COMPRA DE PIEZAS DE REFACCION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 220, 20);

        txtR.setColumns(20);
        txtR.setRows(5);
        jScrollPane1.setViewportView(txtR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 130, 350, 130);

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(250, 80, 120, 30);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(250, 50, 120, 30);

        txtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder("Monto Total de la Compra"));
        getContentPane().add(txtMonto);
        txtMonto.setBounds(20, 50, 200, 60);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(20, 270, 120, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-407)/2, (screenSize.height-350)/2, 407, 350);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        capturaMonto();
        calculaInversion();
        calculaInteres();
        imprimir();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiaControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    void limpiaControles(){
        txtMonto.setText("");
        txtR.setText("");
        txtMonto.requestFocus();        
    }
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r=JOptionPane.showOptionDialog(this, 
            "Estas seguro de salir...?", 
            "Variables Locales", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,null,null);
        if (r==0) System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed

    
    void capturaMonto(){
        monto=Double.parseDouble(txtMonto.getText());
    }
    
    void calculaInversion(){
        if (monto>50000){
            empresa=0.55*monto;
            prestamo=0.3*monto;
            credito=monto-(empresa+prestamo);
        }else{
            empresa=0.7*monto;
            credito=monto-empresa;
        }
            
    }
    
    void calculaInteres(){
        interes=0.12*credito;
    }
    
    void imprimir(){
        txtR.setText("");
        txtR.append("Monto total: $ "+String.format("%.2f",monto));
        txtR.append("\n------------------------------------------------");
        txtR.append("\nMonto desembolsado por la Empresa: $ "+String.format("%.2f",empresa));
        txtR.append("\nMonto de Prestamo al Banco: $ "+String.format("%.2f",prestamo));
        txtR.append("\nMonto Credito al Fabricante: $ "+String.format("%.2f",credito));
        txtR.append("\nMonto de interes al Fabricante: $ "+String.format("%.2f",interes));
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
            java.util.logging.Logger.getLogger(frmCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCompra().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
