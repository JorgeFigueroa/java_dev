package C06_pjModular;

import javax.swing.JOptionPane;

public class frmPublicidad extends javax.swing.JFrame {


    public frmPublicidad() {
        initComponents();
        llenaMedios();
        
    }

    void llenaMedios(){
        cboMedios.addItem("Comerciales de Television");
        cboMedios.addItem("Anuncios en Revistas");
        cboMedios.addItem("Anuncios en suplementos dominicales");
    }
    
    int getMedio(){
        return cboMedios.getSelectedIndex();
    }
    
    int getCantidad(){
        return Integer.parseInt(txtCantidad.getText());
    }
    
    double asignaPrecio(int medio){
        switch(medio){
            case 0: return 30000;
            case 1: return 15000;
            default: return 25000;
        }
    }
    
    double calculaBruto(int cantidad,double precio){
        return cantidad*precio;
    }
    
    double calculaDescuento(double bruto){
        if (bruto<=5)
            return bruto*0.1;
        else if (bruto<=10)
            return bruto*0.25;
        else 
            return bruto*0.3;
    }
    
    double calculaNeto(double bruto,double descuento){
        return bruto-descuento;
    }
    
    void imprimir(double precio,double bruto,double descuento,double neto){
        txtR.setText("");
        txtR.append("Medio de Publicidad: "+cboMedios.getSelectedItem());
        txtR.append("\nPrecio: $ "+String.format("%.2f",precio));
        txtR.append("\n------------------------------------------------");
        txtR.append("\nMonto Bruto: $ "+String.format("%.2f",bruto));
        txtR.append("\nMonto de Descuento: $ "+String.format("%.2f",descuento));
        txtR.append("\nMonto Neto: $ "+String.format("%.2f",neto));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboMedios = new javax.swing.JComboBox();
        txtCantidad = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("COMPAÑIA DE PUBLICIDAD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 10, 180, 20);

        cboMedios.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cboMedios.setBorder(javax.swing.BorderFactory.createTitledBorder("Medios de Publicidad"));
        cboMedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMediosActionPerformed(evt);
            }
        });
        getContentPane().add(cboMedios);
        cboMedios.setBounds(10, 40, 220, 60);

        txtCantidad.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad de Contratos"));
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(240, 40, 150, 60);

        btnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(200, 110, 140, 40);

        btnCalcular.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(50, 110, 140, 40);

        txtR.setColumns(20);
        txtR.setRows(5);
        jScrollPane1.setViewportView(txtR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 380, 120);

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 290, 110, 40);

        setSize(new java.awt.Dimension(416, 378));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //1
        int medio=getMedio();        
        int cantidad=getCantidad();
        
        //2
        double precio=asignaPrecio(medio);
        
        //3
        double bruto=calculaBruto(cantidad, precio);
        double descuento=calculaDescuento(bruto);
        double neto=calculaNeto(bruto,descuento);
        
        //4
        imprimir(precio,bruto,descuento,neto); 
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       cboMedios.setSelectedIndex(-1);
       txtCantidad.setText("");
       cboMedios.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r=JOptionPane.showOptionDialog(this, 
            "Estas seguro de salir...?", 
            "Publicidad", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,null,null);
        if (r==0) System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboMediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMediosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMediosActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmPublicidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPublicidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPublicidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPublicidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPublicidad().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboMedios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
