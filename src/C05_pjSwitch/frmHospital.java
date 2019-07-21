package C05_pjSwitch;

import javax.swing.JOptionPane;

public class frmHospital extends javax.swing.JFrame {

    public frmHospital() {
        initComponents();
        //1
        cboAnalisis.addItem("Analisis 1");
        cboAnalisis.addItem("Analisis 2");
        cboAnalisis.addItem("Analisis 3");
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboAnalisis = new javax.swing.JComboBox();
        txtEdad = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("CONTROL DE ANALISIS DE PACIENTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 20, 250, 14);

        cboAnalisis.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cboAnalisis.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Analisis"));
        getContentPane().add(cboAnalisis);
        cboAnalisis.setBounds(20, 50, 190, 60);

        txtEdad.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Edad"));
        getContentPane().add(txtEdad);
        txtEdad.setBounds(220, 50, 160, 60);

        btnCalcular.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(60, 120, 130, 40);

        btnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(200, 120, 140, 40);

        txtR.setColumns(20);
        txtR.setRows(5);
        jScrollPane1.setViewportView(txtR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 170, 380, 110);

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 280, 110, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-416)/2, (screenSize.height-355)/2, 416, 355);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        cboAnalisis.setSelectedIndex(-1);
        txtEdad.setText("");
        txtR.setText("");
        cboAnalisis.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //1
        int analisis=cboAnalisis.getSelectedIndex();
        int edad=Integer.parseInt(txtEdad.getText());
        
        //2
        double costo;
        switch(analisis){
            case 0: costo=25;break;
            case 1: costo=36;break;
            default: costo=50;
        }
        
        //3
        double adicional=0;
        if (edad>=14 && edad<=22)
            adicional=costo*0.1;
        
        costo=costo+adicional;
        
        //4
        txtR.setText("");
        txtR.append("Analisis: "+cboAnalisis.getSelectedItem());
        txtR.append("\nEdad registrada: "+edad);
        txtR.append("\n-------------------------------------------");
        txtR.append("\nCosto Adicional: "+String.format("%.2f",adicional));        
        txtR.append("\nCosto Final: "+String.format("%.2f",costo));        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r=JOptionPane.showOptionDialog(this, 
            "Estas seguro de salir...?", 
            "Switch", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,null,null);
        if (r==0) System.exit(0);
    
    }//GEN-LAST:event_btnSalirActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHospital().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboAnalisis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
