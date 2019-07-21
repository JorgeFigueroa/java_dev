package C06_pjModular;

import javax.swing.JOptionPane;

public class frmTelas extends javax.swing.JFrame {
  
    public frmTelas() {
        initComponents();
        llenaPrendas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboPrenda = new javax.swing.JComboBox();
        txtCantidad = new javax.swing.JTextField();
        chkIVA = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("TELAS Y MODA DE OTOÑO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 190, 20);

        cboPrenda.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cboPrenda.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione Prenda"));
        getContentPane().add(cboPrenda);
        cboPrenda.setBounds(20, 40, 250, 60);

        txtCantidad.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Cantidad"));
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(280, 40, 150, 60);

        chkIVA.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        chkIVA.setText("IVA");
        chkIVA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chkIVAItemStateChanged(evt);
            }
        });
        getContentPane().add(chkIVA);
        chkIVA.setBounds(360, 370, 70, 27);

        txtR.setColumns(20);
        txtR.setRows(5);
        txtR.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de la Venta"));
        jScrollPane1.setViewportView(txtR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 430, 200);

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 370, 130, 30);

        btnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(240, 120, 110, 30);

        btnCalcular.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(120, 120, 110, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-466)/2, (screenSize.height-451)/2, 466, 451);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        imprimir();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void chkIVAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chkIVAItemStateChanged
        if (chkIVA.isSelected()){
            imprimir();
            txtR.append("\nEl monto IVA es: $"+String.format("%.2f",calculaIVA()));
        }else{
            imprimir();
        } 
            
            
    }//GEN-LAST:event_chkIVAItemStateChanged

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCantidad.setText("");
        txtR.setText("");
        txtCantidad.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r=JOptionPane.showOptionDialog(this, 
            "Estas seguro de salir...?", 
            "Teles y mode de Otoño", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,null,null);
        if (r==0) System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    /* PROGRAMACION MODULAR */
    void llenaPrendas(){
        cboPrenda.addItem("Pantalones de Lana");
        cboPrenda.addItem("Sueter de casimir");
        cboPrenda.addItem("Blusa de seda");
        cboPrenda.addItem("Camisola de seda");
        cboPrenda.addItem("Falda recta");
        cboPrenda.addItem("Saco de lana");
    }
    int getPrenda(){
        return cboPrenda.getSelectedIndex();
    }
    
    int getCantidad(){
        return Integer.parseInt(txtCantidad.getText());
    }
    
    double asignaPrecio(){
        switch(getPrenda()){
            case 0: return 45;
            case 1: return 100;
            case 2: return 14;
            case 3: return 10;
            case 4: return 40;
            default: return 120;
        }
    }
    
    double calculaMonto(){
        return getCantidad()*asignaPrecio();
    }
    
    double calculaDescuento(){
        if (calculaMonto()<=100)
            return 0.02*calculaMonto();
        else if (calculaMonto()<=500)
            return 0.04*calculaMonto();
        else if (calculaMonto()<=1000)
            return 0.06*calculaMonto();
        else if (calculaMonto()<=1500)
            return 0.08*calculaMonto();
        else 
            return 0.20*calculaMonto();
    }
    
    double calculaNeto(){
        return calculaMonto()-calculaDescuento();
    }
    
    double calculaIVA(){
        return calculaNeto()*0.18;
    }
    
    void imprimir(){
        txtR.setText("");
        txtR.append("Prenda :"+cboPrenda.getSelectedItem());
        txtR.append("\nCantidad:"+getCantidad());
        txtR.append("\nPrecio: $"+asignaPrecio());
        txtR.append("\n------------------------------------------");
        txtR.append("\nEl Monto a pagar es: $"+String.format("%.2f",calculaMonto()));
        txtR.append("\nEl Monto de descuento es: $"+String.format("%.2f",calculaDescuento()));
        txtR.append("\nEl Monto Neto es: $"+String.format("%.2f",calculaNeto()));
    }
    
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
            java.util.logging.Logger.getLogger(frmTelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTelas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboPrenda;
    private javax.swing.JCheckBox chkIVA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
