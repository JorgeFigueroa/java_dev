package C08_pjPensionConstructor.pFormularios;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import C08_pjPensionConstructor.pClases.Pension;


public class frmPension extends javax.swing.JFrame {
    public frmPension() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox();
        txtPromedio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstR = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("PENSION DE ESTUDIANTES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 200, 20);

        cboCategoria.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cboCategoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Categoria"));
        getContentPane().add(cboCategoria);
        cboCategoria.setBounds(20, 60, 150, 50);

        txtPromedio.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtPromedio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPromedio.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Promedio"));
        getContentPane().add(txtPromedio);
        txtPromedio.setBounds(20, 120, 150, 60);

        btnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(190, 70, 100, 40);

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        getContentPane().add(btnSalir);
        btnSalir.setBounds(300, 70, 100, 40);

        btnProcesar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar);
        btnProcesar.setBounds(190, 120, 210, 50);

        lstR.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de Pension"));
        jScrollPane1.setViewportView(lstR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 200, 380, 120);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-439)/2, (screenSize.height-374)/2, 439, 374);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        if (valida().equals("")){
        //Creando un objeto de la clase Pension
        Pension objP = new Pension(getCategoria(),getPromedio());

        //Calculando con los metodos de la clase
        double pension=objP.determinaPension();
        double descuento=objP.calculaDescuento();
        double nuevaPension=objP.determinaNuevaPension();

        imprimir(pension,descuento,nuevaPension);
        } else
            JOptionPane.showMessageDialog(null, "El error esta en "+valida());
    }//GEN-LAST:event_btnProcesarActionPerformed

     //1. Llena las categorias del Alumno en el control cboCategoria
    void llenaCategoria(){
        cboCategoria.addItem("A");
        cboCategoria.addItem("B");
        cboCategoria.addItem("C");
        cboCategoria.addItem("D");
    }

    //3. validar las entradas
    String valida(){
        if (cboCategoria.getSelectedIndex()==-1)
            return "Categoria del Estudiante";
        else if (txtPromedio.getText().equals("") ||
                Double.parseDouble(txtPromedio.getText())<0 ||
                Double.parseDouble(txtPromedio.getText())>20)
            return "Promedio del Alumno";
        else
            return "";
    }

    //4. Capturar los valores ingresados por el usuario
    int getCategoria(){
        return cboCategoria.getSelectedIndex();
    }

    double getPromedio(){
        return Double.parseDouble(txtPromedio.getText());
    }
    
    void imprimir(double pension,double descuento,double nuevaPension){
        DefaultListModel moR= new DefaultListModel();
        moR.addElement("La Pension es: "+String.format("%.2f",pension));
        moR.addElement("El descuento es: "+String.format("%.2f",descuento));
        moR.addElement("La Nueva Pension es: "+String.format("%.2f",nuevaPension));
        lstR.setModel(moR);
    }
    
    void limpiarControles(){
        txtPromedio.setText("");
        cboCategoria.setSelectedIndex(-1);
        cboCategoria.requestFocus();
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
            java.util.logging.Logger.getLogger(frmPension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPension.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPension().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstR;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
