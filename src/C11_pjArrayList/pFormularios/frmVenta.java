package C11_pjArrayList.pFormularios;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import C11_pjArrayList.pClases.ArregloFacturas;
import C11_pjArrayList.pClases.Factura;

public class frmVenta extends javax.swing.JFrame {

    ArregloFacturas arr_fac = new ArregloFacturas();
    int num = 0;

    public frmVenta() {
        initComponents();
        DefinirAnchos();
        asignaFecha();
        habilitaCajas(false);
        btnGrabarIngreso.setVisible(false);
        btnGrabarModificado.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNfactura = new javax.swing.JTextField();
        txtFechaVenta = new javax.swing.JTextField();
        txtVendedor = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tFacturas = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListado = new javax.swing.JButton();
        btnGrabarIngreso = new javax.swing.JButton();
        btnGrabarModificado = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRO DE VENTAS (FACTURACION)");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 10, 350, 21);

        txtNfactura.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNfactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNfactura.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Factura"));
        getContentPane().add(txtNfactura);
        txtNfactura.setBounds(230, 50, 170, 60);

        txtFechaVenta.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtFechaVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtFechaVenta.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Actual"));
        getContentPane().add(txtFechaVenta);
        txtFechaVenta.setBounds(400, 50, 170, 60);

        txtVendedor.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtVendedor.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Vendedor"));
        getContentPane().add(txtVendedor);
        txtVendedor.setBounds(20, 130, 370, 60);

        txtMonto.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtMonto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto a Registrar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, null, new java.awt.Color(51, 51, 51)));
        getContentPane().add(txtMonto);
        txtMonto.setBounds(400, 130, 170, 60);

        tFacturas.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null},
                    {null, null, null, null}
                },
                new String[]{
                    "Nº Factura", "Fecha de Venta", "Vendedor", "Monto"
                }
        ));
        jScrollPane1.setViewportView(tFacturas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 550, 230);

        btnRegistrar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/Group Add.jpg"))); // NOI18N
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(60, 220, 50, 50);

        btnConsultar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/User 7 Search.jpg"))); // NOI18N
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(110, 220, 50, 50);

        btnModificar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/User 7 Edit 2.jpg"))); // NOI18N
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(160, 220, 50, 50);

        btnEliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/User 7 Delete.jpg"))); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(210, 220, 50, 50);

        btnListado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnListado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/Pictures Edit.jpg"))); // NOI18N
        btnListado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnListado);
        btnListado.setBounds(290, 220, 50, 50);

        btnGrabarIngreso.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnGrabarIngreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/Save All.jpg"))); // NOI18N
        btnGrabarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarIngresoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabarIngreso);
        btnGrabarIngreso.setBounds(60, 220, 50, 50);

        btnGrabarModificado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnGrabarModificado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImagenes/Save All.jpg"))); // NOI18N
        btnGrabarModificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarModificadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabarModificado);
        btnGrabarModificado.setBounds(160, 220, 50, 50);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mantenimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 0, 10))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 200, 550, 80);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width - 603) / 2, (screenSize.height - 574) / 2, 603, 574);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        txtNfactura.setText("" + generaNumero());
        asignaFecha();
        txtVendedor.requestFocus();

        habilitaCajas(true);
        txtVendedor.setEditable(true);
        txtMonto.setEditable(true);

        txtVendedor.setText("");
        txtMonto.setText("");

        btnRegistrar.setVisible(false);
        btnGrabarIngreso.setVisible(true);
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            limpiaCajas();
            limpiaMatriz();
            int buscoFactura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero de Factura:"));
            //objeto fact que busca el numero de factura en el ArrayList f
            Factura fact = arr_fac.buscar(buscoFactura);
            if (fact != null) {
                tFacturas.setValueAt(fact.getNfactura(), 0, 0);
                tFacturas.setValueAt(fact.getfecha(), 0, 1);
                tFacturas.setValueAt(fact.getVendedor(), 0, 2);
                tFacturas.setValueAt(fact.getMonto(), 0, 3);
            } else {
                JOptionPane.showMessageDialog(null, "Factura NO encontrada", "Confirmacion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de Entrada de Datos", "Confirmacion", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        try {
            limpiaCajas();
            limpiaMatriz();

            btnModificar.setVisible(false);
            btnGrabarModificado.setVisible(true);

            int buscoFactura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero de Factura:"));
            //objeto fact que busca el numero de factura en el ArrayList f
            Factura fact = arr_fac.buscar(buscoFactura);
            if (fact != null) {
                tFacturas.setValueAt(fact.getNfactura(), 0, 0);
                tFacturas.setValueAt(fact.getfecha(), 0, 1);
                tFacturas.setValueAt(fact.getVendedor(), 0, 2);
                tFacturas.setValueAt(fact.getMonto(), 0, 3);

                txtNfactura.setText("" + fact.getNfactura());
                txtFechaVenta.setText(fact.getfecha());
                txtVendedor.setText(fact.getVendedor());
                txtMonto.setText("" + fact.getMonto());

                habilitaCajas(true);
                txtNfactura.setEditable(false);
                txtFechaVenta.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Factura NO encontrada", "Confirmacion", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Factura NO encontrada", "Confirmacion", JOptionPane.ERROR_MESSAGE);
            btnModificar.setVisible(true);
            btnGrabarModificado.setVisible(false);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            int buscoFactura = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero de Factura a Eliminar:"));
            //objeto fact que busca el numero de factura en el ArrayList f
            Factura fact = arr_fac.buscar(buscoFactura);
            if (fact != null) {
                arr_fac.eliminar(fact);
                JOptionPane.showMessageDialog(null, "Factura Eliminada Correctamente", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                listar();
            } else {
                JOptionPane.showMessageDialog(null, "NO existe el Numero de Factura ingresada", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "NO existe el Numero de Factura ingresada", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadoActionPerformed
        listar();
    }//GEN-LAST:event_btnListadoActionPerformed

    private void btnGrabarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarIngresoActionPerformed
        try {
            habilitaCajas(false);
            btnRegistrar.setVisible(true);
            btnGrabarIngreso.setVisible(false);

            Factura fact = new Factura(getNumFact(), getFecha(), getVendedor(), getMonto());

            arr_fac.agregar(fact);
            listar();
            JOptionPane.showMessageDialog(null, "Factura ingresada correctamente", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error de Ingreso de Datos", "Error", JOptionPane.ERROR_MESSAGE);
            num--;
        }
    }//GEN-LAST:event_btnGrabarIngresoActionPerformed

    private void btnGrabarModificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarModificadoActionPerformed
        try {
            Factura fact = arr_fac.buscar(getNumFact());
            fact.setVendedor(getVendedor());
            fact.setMonto(getMonto());
            JOptionPane.showMessageDialog(null, "Factura Modificada Correctamente", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            listar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar Grabar", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
        }
        btnGrabarModificado.setVisible(false);
        btnModificar.setVisible(true);
    }//GEN-LAST:event_btnGrabarModificadoActionPerformed

    //Metodo que define el ancho de las columnas de la tabla
    void DefinirAnchos() {
        TableColumn columna;
        columna = tFacturas.getColumnModel().getColumn(0);
        columna.setPreferredWidth(30);
        columna = tFacturas.getColumnModel().getColumn(1);
        columna.setPreferredWidth(50);
        columna = tFacturas.getColumnModel().getColumn(2);
        columna.setPreferredWidth(150);
        columna = tFacturas.getColumnModel().getColumn(3);
        columna.setPreferredWidth(70);
        tFacturas.getTableHeader().setReorderingAllowed(false);
        tFacturas.getTableHeader().setResizingAllowed(false);
    }

    //Metodo que bloque y desbloquea los controles JTextField
    void habilitaCajas(boolean opcion) {
        txtNfactura.setEditable(opcion);
        txtVendedor.setEditable(opcion);
        txtMonto.setEditable(opcion);
        txtFechaVenta.setEditable(opcion);

    }

    //Metodo que limpia los controles JTextField
    void limpiaCajas() {
        txtNfactura.setText("");
        txtVendedor.setText("");
        txtFechaVenta.setText("");
        txtMonto.setText("");
    }

    //Metodo que limpiar el control tFacturas
    void limpiaMatriz() {
        for (int i = 0; i < 10; i++) {
            tFacturas.setValueAt("", i, 0);
            tFacturas.setValueAt("", i, 1);
            tFacturas.setValueAt("", i, 2);
            tFacturas.setValueAt("", i, 3);
        }
    }

    //Metodo que genera el numero de factura
    public int generaNumero() {
        num++;
        return num;
    }

    //Metodos que capturan los valores ingresados por el usuario
    public int getNumFact() {
        return Integer.parseInt(txtNfactura.getText());
    }

    public String getFecha() {
        return txtFechaVenta.getText();
    }

    public String getVendedor() {
        return txtVendedor.getText();
    }

    public double getMonto() {
        return Double.parseDouble(txtMonto.getText());
    }

    //Metodo que lista las facturas en el control tFacturas
    void listar() {
        if (arr_fac.getTamaño() > 0) {
            for (int i = 0; i < arr_fac.getTamaño(); i++) {
                Factura fact = arr_fac.obtener(i);
                tFacturas.setValueAt(fact.getNfactura(), i, 0);
                tFacturas.setValueAt(fact.getfecha(), i, 1);
                tFacturas.setValueAt(fact.getVendedor(), i, 2);
                tFacturas.setValueAt(fact.getMonto(), i, 3);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No hay facturas registradas", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
            limpiaMatriz();
        }
    }

    //Metodo que muestra la fecha actual en el control txtFechaVenta
    void asignaFecha() {
        GregorianCalendar cal = new GregorianCalendar();
        txtFechaVenta.setText(cal.get(cal.DAY_OF_MONTH) + "/"
                + cal.MONTH + "/"
                + cal.get(cal.YEAR));
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
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabarIngreso;
    private javax.swing.JButton btnGrabarModificado;
    private javax.swing.JButton btnListado;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tFacturas;
    private javax.swing.JTextField txtFechaVenta;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNfactura;
    private javax.swing.JTextField txtVendedor;
    // End of variables declaration//GEN-END:variables
}
