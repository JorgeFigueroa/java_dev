package C12_pjInstituto.pFormularios;

import C12_pjInstituto.pClases.ArregloEstudiantes;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import C12_pjInstituto.pClases.Estudiante;

public class frmMantenimiento extends javax.swing.JFrame {

    ArregloEstudiantes a=new ArregloEstudiantes();
    
    public frmMantenimiento() {
        initComponents();
        defineAnchoTabla();
        llenaCombo();
        listar();
        btnGrabarI.setVisible(false);
        btnGrabarM.setVisible(false);
        habilitaCajas(false);

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        cboCiclo = new javax.swing.JComboBox();
        txtPension = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tAlumnos = new javax.swing.JTable();
        btnGrabarM = new javax.swing.JButton();
        btnGrabarI = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("MANTENIMIENTO DE ALUMNOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 20, 320, 21);

        txtCodigo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtCodigo.setBorder(javax.swing.BorderFactory.createTitledBorder("CODIGO"));
        getContentPane().add(txtCodigo);
        txtCodigo.setBounds(10, 50, 140, 60);

        txtNombres.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtNombres.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES Y APELLIDOS"));
        getContentPane().add(txtNombres);
        txtNombres.setBounds(160, 50, 440, 60);

        cboCiclo.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        cboCiclo.setBorder(javax.swing.BorderFactory.createTitledBorder("CICLO"));
        getContentPane().add(cboCiclo);
        cboCiclo.setBounds(10, 110, 140, 60);

        txtPension.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        txtPension.setBorder(javax.swing.BorderFactory.createTitledBorder("PENSION"));
        getContentPane().add(txtPension);
        txtPension.setBounds(160, 110, 140, 60);

        btnIngresar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(610, 50, 120, 40);

        btnConsultar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar);
        btnConsultar.setBounds(610, 90, 120, 40);

        btnModificar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(610, 130, 120, 40);

        btnEliminar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar);
        btnEliminar.setBounds(610, 170, 120, 40);

        btnListar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });
        getContentPane().add(btnListar);
        btnListar.setBounds(610, 210, 120, 40);

        tAlumnos.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        tAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
            new String [] {
                "CODIGO", "NOMBRES Y APELLIDOS", "CICLO", "PENSION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tAlumnos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 590, 280);

        btnGrabarM.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnGrabarM.setText("GRABAR");
        btnGrabarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarMActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabarM);
        btnGrabarM.setBounds(610, 260, 120, 30);

        btnGrabarI.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        btnGrabarI.setText("GRABAR");
        btnGrabarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarIActionPerformed(evt);
            }
        });
        getContentPane().add(btnGrabarI);
        btnGrabarI.setBounds(610, 290, 120, 30);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-762)/2, (screenSize.height-517)/2, 762, 517);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try{
            limpiaCajas();
            limpiaMatriz();

            int codigo=Integer.parseInt(JOptionPane.showInputDialog(this,
                                               "Ingrese codigo a Buscar:"));

            Estudiante e=a.buscar(codigo);
            if (e!=null){
                tAlumnos.setValueAt(e.getCodigo(), 0, 0);
                tAlumnos.setValueAt(e.getNombre(), 0, 1);
                tAlumnos.setValueAt(e.getCiclo(), 0, 2);
                tAlumnos.setValueAt(e.getPension(), 0, 3);
            } else
            JOptionPane.showMessageDialog(this,"Codigo de estudiante NO Existe");
        } catch(Exception ex){
            JOptionPane.showMessageDialog(this,"Error de Datos");
    }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int codigo=autogeneraCodigo();
        txtCodigo.setText(""+codigo);
        habilitaCajas(true);
        txtCodigo.setEditable(false);
        txtNombres.requestFocus();
        btnGrabarI.setVisible(true);
        btnIngresar.setVisible(false);

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int codigo=Integer.parseInt(JOptionPane.showInputDialog(this,
                              "Ingrese codigo de Estudiante a Modificar:"));
        habilitaCajas(true);
        limpiaMatriz();
        txtCodigo.setEditable(false);

        Estudiante e=a.buscar(codigo);
        if (e!=null){
            txtCodigo.setText(""+e.getCodigo());
            txtNombres.setText(e.getNombre());
            cboCiclo.setSelectedIndex(e.getCiclo()-1);
            txtPension.setText(""+e.getPension());

            txtNombres.requestFocus();
            btnGrabarM.setVisible(true);
            btnModificar.setVisible(false);
        } else
          JOptionPane.showMessageDialog(this,"Codigo de estudiante NO Existe");

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
         try{
    limpiaCajas();
    limpiaMatriz();

    int codigo=Integer.parseInt(JOptionPane.showInputDialog(this,
                                            "Ingrese codigo a Eliminar:"));
    Estudiante e=a.buscar(codigo);

    if (e!=null){
         a.eliminar(e);
         a.grabar();
         listar();
    }
    }catch(Exception ex){
       JOptionPane.showMessageDialog(this,"Codigo de estudiante NO Existe");
    }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
       listar();
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnGrabarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarMActionPerformed
        Estudiante e=a.buscar(getCodigo());
        if (e != null){
            e.setNombre(getNombre());
            e.setCiclo(getCiclo());
            e.setPension(getPension());

            a.grabar();
            listar();
        }
        limpiaCajas();
        habilitaCajas(false);

        btnModificar.setVisible(true);
        btnGrabarM.setVisible(false);

    }//GEN-LAST:event_btnGrabarMActionPerformed

    private void btnGrabarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarIActionPerformed
        Estudiante e=a.buscar(getCodigo());
        if (e == null){
         e=new Estudiante(getCodigo(),getNombre(),getCiclo(),getPension());

        a.adicionar(e);
        a.grabar();
         listar();
         }
         limpiaCajas();
         habilitaCajas(false);

       btnIngresar.setVisible(true);
       btnGrabarI.setVisible(false);

    }//GEN-LAST:event_btnGrabarIActionPerformed

   
    void defineAnchoTabla(){
        TableColumn columna;
        columna=tAlumnos.getColumnModel().getColumn(0);
        columna.setPreferredWidth(50);
        columna=tAlumnos.getColumnModel().getColumn(1);
        columna.setPreferredWidth(150);
        columna=tAlumnos.getColumnModel().getColumn(2);
        columna.setPreferredWidth(30);
        columna=tAlumnos.getColumnModel().getColumn(3);
        columna.setPreferredWidth(40);
        tAlumnos.getTableHeader().setReorderingAllowed(false);
        tAlumnos.getTableHeader().setResizingAllowed(false);
    }

    void llenaCombo(){
        cboCiclo.addItem("1");
        cboCiclo.addItem("2");
        cboCiclo.addItem("3");
        cboCiclo.addItem("4");
        cboCiclo.addItem("5");
        cboCiclo.addItem("6");
    }

    void habilitaCajas(boolean opcion){
        txtCodigo.setEditable(opcion);
        txtNombres.setEditable(opcion);
        txtPension.setEditable(opcion);
        cboCiclo.setEnabled(opcion);
    }

    void limpiaCajas(){
        txtCodigo.setText("");
        txtNombres.setText("");
        txtPension.setText("");
        cboCiclo.setSelectedIndex(0);
    }

    void limpiaMatriz(){
        for(int i=0;i<10;i++){
            tAlumnos.setValueAt("", i, 0);
            tAlumnos.setValueAt("", i, 1);
            tAlumnos.setValueAt("", i, 2);
            tAlumnos.setValueAt("", i, 3);
        }
    }

    public int autogeneraCodigo(){
        int cod=(int)((9999-1000+1)*Math.random()+1000);
        return cod;
    }

    void listar(){
        if (a.getTamaño()>0){
            for(int i=0;i<a.getTamaño();i++){
                Estudiante e=a.obtener(i);
                tAlumnos.setValueAt(e.getCodigo(), i, 0);
                tAlumnos.setValueAt(e.getNombre(), i, 1);
                tAlumnos.setValueAt(e.getCiclo(), i, 2);
                tAlumnos.setValueAt(e.getPension(), i, 3);
            }
        }
    }

    //Metodos Get
    public int getCodigo(){
        return Integer.parseInt(txtCodigo.getText());
    }
    public String getNombre(){
        return txtNombres.getText();
    }
    public double getPension(){
        return Double.parseDouble(txtPension.getText());
    }

    public int getCiclo(){
        return cboCiclo.getSelectedIndex()+1;
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
            java.util.logging.Logger.getLogger(frmMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMantenimiento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMantenimiento().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabarI;
    private javax.swing.JButton btnGrabarM;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox cboCiclo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tAlumnos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPension;
    // End of variables declaration//GEN-END:variables
}
