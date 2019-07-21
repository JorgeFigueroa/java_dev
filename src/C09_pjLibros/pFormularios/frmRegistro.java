package C09_pjLibros.pFormularios;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import C09_pjLibros.pClases.Libro;

public class frmRegistro extends javax.swing.JFrame {

    Libro objLi;
    
    DefaultListModel moLibro,moEditorial,moClase,moAño,moPaginas,moCosto;
    DefaultListModel moEstadisticas;
    
    public frmRegistro() {
        initComponents();
        llenaEditorial();
        llenaClase();
        cargaModelos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtLibro = new javax.swing.JTextField();
        cboEditorial = new javax.swing.JComboBox();
        cboClase = new javax.swing.JComboBox();
        txtAño = new javax.swing.JTextField();
        txtPaginas = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstLibro = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstEditorial = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstClase = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstAño = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstPaginas = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        lstCosto = new javax.swing.JList();
        btnEstadisticas = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        lstEstadisticas = new javax.swing.JList();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("REGISTRO DEL LIBRO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(290, 10, 220, 21);

        txtLibro.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Libro"));
        getContentPane().add(txtLibro);
        txtLibro.setBounds(20, 40, 340, 60);

        cboEditorial.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Editorial"));
        getContentPane().add(cboEditorial);
        cboEditorial.setBounds(370, 40, 150, 60);

        cboClase.setBorder(javax.swing.BorderFactory.createTitledBorder("Clase de Libro"));
        getContentPane().add(cboClase);
        cboClase.setBounds(530, 40, 200, 60);

        txtAño.setBorder(javax.swing.BorderFactory.createTitledBorder("Año de Edicion"));
        getContentPane().add(txtAño);
        txtAño.setBounds(20, 100, 110, 60);

        txtPaginas.setBorder(javax.swing.BorderFactory.createTitledBorder("Paginas"));
        getContentPane().add(txtPaginas);
        txtPaginas.setBounds(140, 100, 90, 60);

        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo"));
        getContentPane().add(txtCosto);
        txtCosto.setBounds(240, 100, 120, 60);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(370, 100, 150, 60);

        jScrollPane1.setViewportView(lstLibro);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 170, 200, 230);

        jScrollPane2.setViewportView(lstEditorial);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(220, 170, 60, 230);

        jScrollPane3.setViewportView(lstClase);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(280, 170, 110, 230);

        jScrollPane4.setViewportView(lstAño);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(390, 170, 110, 230);

        jScrollPane5.setViewportView(lstPaginas);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(500, 170, 100, 230);

        jScrollPane6.setViewportView(lstCosto);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(600, 170, 130, 230);

        btnEstadisticas.setBackground(new java.awt.Color(153, 204, 255));
        btnEstadisticas.setText("ESTADISTICAS");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstadisticas);
        btnEstadisticas.setBounds(20, 410, 710, 30);

        jScrollPane7.setViewportView(lstEstadisticas);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(20, 450, 710, 130);

        btnLimpiar.setText("LIMPIAR");
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(530, 100, 200, 60);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-763)/2, (screenSize.height-627)/2, 763, 627);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
            objLi = new Libro(getLibro(),getEditorial(),getClase(),
                                getAño(),getPaginas(),getCosto());
        
            llenaModelos();
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion " + ex.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        try{
        moEstadisticas.clear();
        moEstadisticas.addElement("Numero de Libro de Analisis de la Editorial B es: "+objLi.getTAnalisis());
        int mayor=Integer.MIN_VALUE;
        int pos=0;
        for(int i=0;i<moLibro.getSize();i++){
            if (Integer.parseInt(moAño.elementAt(i).toString())>mayor){
                mayor=Integer.parseInt(moAño.elementAt(i).toString());
                pos=i;
            }
        }
        moEstadisticas.addElement("Libro con el año de edicion mas reciente: "+moLibro.getElementAt(pos));
        
        int menor=Integer.MAX_VALUE;
        for(int i=0;i<moLibro.getSize();i++){
            if (Integer.parseInt(moPaginas.elementAt(i).toString())<menor){
                menor=Integer.parseInt(moPaginas.elementAt(i).toString());
                pos=i;
            }
        }
        moEstadisticas.addElement("Editorial con libro de menor pagina es: "+moEditorial.getElementAt(pos));

        double mayorCosto=Double.MIN_VALUE;
        for(int i=0;i<moLibro.getSize();i++){
            if (Double.parseDouble(moCosto.elementAt(i).toString())>mayorCosto){
                mayorCosto=Double.parseDouble(moCosto.elementAt(i).toString());
                pos=i;
            }
        }
        moEstadisticas.addElement("Libro con mayor costo es: "+moLibro.getElementAt(pos));
   
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error en la Aplicacion " + ex.getMessage());
        }
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    void cargaModelos(){
        moLibro=new DefaultListModel();
        moEditorial=new DefaultListModel();
        moClase=new DefaultListModel();
        moAño=new DefaultListModel();
        moPaginas=new DefaultListModel();
        moCosto=new DefaultListModel();
        
        moEstadisticas=new DefaultListModel();
        
        lstLibro.setModel(moLibro);
        lstEditorial.setModel(moEditorial);
        lstClase.setModel(moClase);
        lstAño.setModel(moAño);
        lstPaginas.setModel(moPaginas);
        lstCosto.setModel(moCosto);
        
        lstEstadisticas.setModel(moEstadisticas);
    }
    
    void llenaModelos(){
        moLibro.addElement(objLi.getNombre());
        moEditorial.addElement(objLi.getEditorial());
        moClase.addElement(objLi.getClase());
        moAño.addElement(objLi.getAño());
        moPaginas.addElement(objLi.getPaginas());
        moCosto.addElement(objLi.getCosto());
    }
    
    void llenaEditorial(){
        cboEditorial.addItem("A");
        cboEditorial.addItem("B");
        cboEditorial.addItem("C");
    }
    
    void llenaClase(){
        cboClase.addItem("Programacion");
        cboClase.addItem("Analisis");
        cboClase.addItem("Diseño");
    }
    
    String getLibro(){
        return txtLibro.getText();
    }
    
    String getEditorial(){
        return String.valueOf(cboEditorial.getSelectedItem());
    }

    String getClase(){
        return String.valueOf(cboClase.getSelectedItem());
    }
    
    int getAño(){
        return Integer.parseInt(txtAño.getText());
    }
    
    int getPaginas(){
        return Integer.parseInt(txtPaginas.getText());
    }
    
    double getCosto(){
        return Double.parseDouble(txtCosto.getText());
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
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmRegistro().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox cboClase;
    private javax.swing.JComboBox cboEditorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JList lstAño;
    private javax.swing.JList lstClase;
    private javax.swing.JList lstCosto;
    private javax.swing.JList lstEditorial;
    private javax.swing.JList lstEstadisticas;
    private javax.swing.JList lstLibro;
    private javax.swing.JList lstPaginas;
    private javax.swing.JTextField txtAño;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtLibro;
    private javax.swing.JTextField txtPaginas;
    // End of variables declaration//GEN-END:variables
}
