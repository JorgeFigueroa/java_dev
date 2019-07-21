package C05_pjSeleccion;

import javax.swing.JOptionPane;

public class frmPago extends javax.swing.JFrame {

    public frmPago() {
        initComponents();
        getRootPane().setDefaultButton(btnMostrar);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTrabajador = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        txtTarifa = new javax.swing.JTextField();
        btnMostrar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("PAGO DE TRABAJADORES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 20, 210, 14);

        txtTrabajador.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtTrabajador.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Trabajador"));
        getContentPane().add(txtTrabajador);
        txtTrabajador.setBounds(20, 50, 400, 60);

        txtHoras.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtHoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas de Trabajo"));
        getContentPane().add(txtHoras);
        txtHoras.setBounds(20, 120, 180, 60);

        txtTarifa.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtTarifa.setBorder(javax.swing.BorderFactory.createTitledBorder("Tarifa por Hora"));
        getContentPane().add(txtTarifa);
        txtTarifa.setBounds(240, 120, 180, 60);

        btnMostrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(100, 190, 120, 30);

        btnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(230, 190, 110, 30);

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(20, 390, 130, 30);

        txtR.setColumns(20);
        txtR.setRows(5);
        jScrollPane1.setViewportView(txtR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 400, 150);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-459)/2, (screenSize.height-467)/2, 459, 467);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        // 
        String trabajador=txtTrabajador.getText();
        double tarifa=Double.parseDouble(txtTarifa.getText());
        int horas=Integer.parseInt(txtHoras.getText());
        
        //
        int extras=0;
        if (horas>40) {
            extras=horas-40;
            horas=40;
        }
        
        //
        int excede=0;
        if (extras>8) {
            excede=extras-8;
            extras=8;
        }    
        
        //
        double monto=horas*tarifa+extras*(tarifa*2)+excede*(tarifa*3);
        
        //
        txtR.setText("");
        txtR.append("\nTrabajador: "+trabajador);
        txtR.append("\nHoras de Trabajo: "+horas);
        txtR.append("\nTarifa por Hora: "+tarifa);
        txtR.append("\nHoras Extras: "+extras);
        txtR.append("\nHoras Extras de exceso: "+excede);
        txtR.append("\nMonto a recibir: $ "+String.format("%.2f",monto));
        
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtTrabajador.setText("");
        txtHoras.setText("");
        txtTarifa.setText("");
        txtR.setText("");
        txtTrabajador.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r=JOptionPane.showOptionDialog(this, 
            "Estas seguro de salir...?", 
            "Sistema de Ventas", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,null,null);
        if (r==0) System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPago().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextArea txtR;
    private javax.swing.JTextField txtTarifa;
    private javax.swing.JTextField txtTrabajador;
    // End of variables declaration//GEN-END:variables
}
