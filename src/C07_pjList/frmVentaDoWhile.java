package C07_pjList;

import java.text.DecimalFormat;
import javax.swing.DefaultListCellRenderer.UIResource;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;


public class frmVentaDoWhile extends javax.swing.JFrame {
   //Modelos
    DefaultListModel moNumero,moDescripcion,moPrecio,moCantidad,moSubtotal;
    //Formato
    DecimalFormat df;
    
    //Numero de Producto
    int num;
  
    public frmVentaDoWhile() {
        initComponents();
         cargaProductos();
        cargaModelos();
                
        df=new DecimalFormat("###0.00");
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        cboProducto = new javax.swing.JComboBox();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnComprar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstNumero = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstDescripcion = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstPrecio = new javax.swing.JList();
        lblSubtotal = new javax.swing.JLabel();
        lblDescuento = new javax.swing.JLabel();
        lblNeto = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCantidad = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstSubtotal = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("VENTA DE PRODUCTOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 230, 21);

        txtCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad Comprada"));
        getContentPane().add(txtCantidad);
        txtCantidad.setBounds(420, 50, 210, 60);

        cboProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion del Producto"));
        getContentPane().add(cboProducto);
        cboProducto.setBounds(20, 50, 390, 60);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(20, 420, 160, 40);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(20, 460, 160, 40);

        btnComprar.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btnComprar.setText("COMPRAR");
        btnComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarActionPerformed(evt);
            }
        });
        getContentPane().add(btnComprar);
        btnComprar.setBounds(20, 120, 610, 60);

        lstNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Nº"));
        jScrollPane3.setViewportView(lstNumero);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 190, 50, 220);

        lstDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripcion"));
        jScrollPane4.setViewportView(lstDescripcion);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(70, 190, 240, 220);

        lstPrecio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio"));
        jScrollPane5.setViewportView(lstPrecio);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(310, 190, 90, 220);

        lblSubtotal.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSubtotal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lblSubtotal);
        lblSubtotal.setBounds(484, 420, 140, 30);

        lblDescuento.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblDescuento.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lblDescuento);
        lblDescuento.setBounds(484, 450, 140, 30);

        lblNeto.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        lblNeto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNeto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(lblNeto);
        lblNeto.setBounds(484, 480, 140, 30);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("SUBTOTAL $");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 426, 120, 18);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("DESCUENTO $");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, 448, 120, 30);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("NETO A PAGAR $");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(330, 478, 150, 30);

        lstCantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));
        jScrollPane1.setViewportView(lstCantidad);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(400, 190, 90, 220);

        lstSubtotal.setBorder(javax.swing.BorderFactory.createTitledBorder("Subtotal"));
        jScrollPane6.setViewportView(lstSubtotal);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(490, 190, 140, 220);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    void cargaModelos(){
        //
        moNumero=new DefaultListModel();
        moDescripcion=new DefaultListModel();
        moPrecio=new DefaultListModel();
        moCantidad=new DefaultListModel();
        moSubtotal=new DefaultListModel();
        
        //
        lstNumero.setModel(moNumero);
        lstDescripcion.setModel(moDescripcion);
        lstPrecio.setModel(moPrecio);
        lstCantidad.setModel(moCantidad);
        lstSubtotal.setModel(moSubtotal);
    }
    
    void cargaProductos(){
        cboProducto.addItem("Cuadernos LayConsa");
        cboProducto.addItem("Cuadernos Justus");
        cboProducto.addItem("Cuadernos StanFord");
        cboProducto.addItem("Cuadernos David");
        cboProducto.addItem("Cuadernos College");
        cboProducto.addItem("Cuadernos Alpha");
    }
    
    int getProducto(){
        return cboProducto.getSelectedIndex();
    }

    String getDescripcionProducto(){
        return String.valueOf(cboProducto.getSelectedItem());
    }
    
    int getCantidad(){
        return Integer.parseInt(txtCantidad.getText());
    }
    
    double asignaPrecio(int producto){
        switch(producto){
            case 0: return 1.5;
            case 1: return 1.9;
            case 2: return 3.5;
            case 3: return 2.5;
            case 4: return 3.0;
            default: return 4.5;
        }
    }
    
    double calculaSubtotal(double precio,int cantidad){
        return precio*cantidad;
    }
   
    String valida(){
        if (cboProducto.getSelectedIndex()==-1){
            cboProducto.requestFocus();
            return "Descripcion del Producto";
        } else if (txtCantidad.getText().equals("")||Integer.parseInt(txtCantidad.getText())<0){
            txtCantidad.setText("");
            txtCantidad.requestFocus();
            return "Cantidad comprada";
        }else 
            return "";
    }

    void limpiarControles(){
        cboProducto.setSelectedIndex(-1);
        txtCantidad.setText("");
        cboProducto.requestFocus();
    }
        
    void imprimirListas(double precio,double subtotal){
        num++;
        moNumero.addElement(num);
        moDescripcion.addElement(getDescripcionProducto());
        moPrecio.addElement(df.format(precio));
        moCantidad.addElement(getCantidad());
        moSubtotal.addElement(df.format(subtotal));
        calculaTotales();
    }
    
    void calculaTotales(){
        int n=moNumero.size();
        double subtotal=0;
        
        
        int i=0; 
        do {
           subtotal+=Double.parseDouble(moSubtotal.
                                       getElementAt(i).toString());
           i++; 
        }while(i<n);
        
        double descuento=subtotal*0.1;
        double neto=subtotal-descuento;
        
        lblSubtotal.setText(df.format(subtotal));
        lblDescuento.setText(df.format(descuento));
        lblNeto.setText(df.format(neto));
    }
    
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarControles();
        moNumero.removeAllElements();
        moDescripcion.removeAllElements();
        moCantidad.removeAllElements();
        moPrecio.removeAllElements();

        moSubtotal.removeAllElements();

        lblSubtotal.setText("");
        lblDescuento.setText("");
        lblNeto.setText("");

        num=0;
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

    private void btnComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarActionPerformed

        if (valida().equals(""))
        {
            int producto = getProducto();
            int cantidad = getCantidad();

            double precio = asignaPrecio(producto);
            double subtotal = calculaSubtotal(precio, cantidad);

            imprimirListas(precio, subtotal);

            UIResource posicion = new UIResource();
            posicion.setHorizontalAlignment(SwingConstants.RIGHT);
            lstSubtotal.setCellRenderer(posicion);

            limpiarControles();
        } else
        JOptionPane.showMessageDialog(null,"Error en "+valida());
    }//GEN-LAST:event_btnComprarActionPerformed

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
            java.util.logging.Logger.getLogger(frmVentaDoWhile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentaDoWhile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentaDoWhile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentaDoWhile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentaDoWhile().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel lblDescuento;
    private javax.swing.JLabel lblNeto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JList lstCantidad;
    private javax.swing.JList lstDescripcion;
    private javax.swing.JList lstNumero;
    private javax.swing.JList lstPrecio;
    private javax.swing.JList lstSubtotal;
    private javax.swing.JTextField txtCantidad;
    // End of variables declaration//GEN-END:variables
}
