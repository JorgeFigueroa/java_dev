package C05_pjDoblementeEnlazado;

public class frmVenta extends javax.swing.JFrame {

    public frmVenta() {
        initComponents();
        //
        cboProducto.addItem("BROCHAS DE CERDAAA");
        cboProducto.addItem("RODILLO");
        cboProducto.addItem("SELLADOR");
        
        //
        cboForma.addItem("Contado");
        cboForma.addItem("Credito");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox();
        cboForma = new javax.swing.JComboBox();
        txtCantidad = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("VENTA DE PRODUCTOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 10, 150, 14);

        cboProducto.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cboProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione Producto"));
        getContentPane().add(cboProducto);
        cboProducto.setBounds(20, 40, 310, 60);

        cboForma.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cboForma.setBorder(javax.swing.BorderFactory.createTitledBorder("Forma de Pago"));
        getContentPane().add(cboForma);
        cboForma.setBounds(170, 120, 160, 60);

        txtCantidad.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Cantidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(0, 0, 0)));
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(20, 120, 130, 60);

        btnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(350, 40, 130, 40);

        txtR.setColumns(20);
        txtR.setRows(5);
        txtR.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de Venta"));
        jScrollPane1.setViewportView(txtR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 470, 220);

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(10, 420, 100, 40);

        btnCalcular.setBackground(new java.awt.Color(153, 153, 255));
        btnCalcular.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular);
        btnCalcular.setBounds(350, 90, 130, 90);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-511)/2, (screenSize.height-505)/2, 511, 505);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        //
        int producto=cboProducto.getSelectedIndex();
        int cantidad=Integer.parseInt(txtCantidad.getText());
        int forma=cboForma.getSelectedIndex();
        
        //
        double precio,descuento;
        if (producto==0){
            precio=20;
            descuento=0.2;
        }
        else if(producto==1){
            precio=45;
            descuento=0.15;
        }
        else{
            precio=10;
            descuento=0.05;
        }
            
        
        //
        double monto=(precio*cantidad);
        double montoDescuento=monto*descuento;
        
        //
        double descuentoxpago;
        if (forma==0)
            descuentoxpago=0.07*monto;
        else 
            descuentoxpago=0;
        
        //
        double neto=monto-montoDescuento-descuentoxpago;
        
        //
        txtR.setText("");
        txtR.append("Producto :"+cboProducto.getSelectedItem());
        txtR.append("\nPrecio : $"+String.format("%.2f",precio));
        txtR.append("\nForma de pago : "+cboForma.getSelectedItem());
        txtR.append("\n---------------------------------------------------------------");
        txtR.append("\nMonto Bruto :$"+String.format("%.2f",monto));
        txtR.append("\nMonto de Descuento :$"+String.format("%.2f",montoDescuento));
        txtR.append("\nDescuento por forma de Pago :$"+String.format("%.2f",descuentoxpago));
        txtR.append("\n---------------------------------------------------------------");
        txtR.append("\nNeto a pagar :$"+String.format("%.2f",neto));
                
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCantidad.setText("");
        cboProducto.setSelectedIndex(-1);
        cboForma.setSelectedIndex(-1);
        txtR.setText("");
        cboProducto.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVenta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboForma;
    private javax.swing.JComboBox cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
