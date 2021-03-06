package mysql_sistema.cap_04_introduccion_mysql;

import java.sql.*;


public class GestionCategoria extends javax.swing.JFrame {

    /**
     * Creates new form GestionCategoria
     */
    public GestionCategoria() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtnom = new javax.swing.JTextField();
        txtdes = new javax.swing.JTextField();
        btnconsultar = new javax.swing.JButton();
        btninsertar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DECRIPCION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("CATEGORIA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("GESTION DE CATEGORIAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("CODIGO");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });
        getContentPane().add(txtcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 90, -1));
        getContentPane().add(txtnom, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 90, -1));
        getContentPane().add(txtdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 90, -1));

        btnconsultar.setText("CONSULTAR");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnconsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, -1, -1));

        btninsertar.setText("INSERTAR");
        btninsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertarActionPerformed(evt);
            }
        });
        getContentPane().add(btninsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, -1, -1));

        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, -1, -1));

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        txtdatos.setColumns(20);
        txtdatos.setRows(5);
        jScrollPane1.setViewportView(txtdatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 370, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        // limpiar el contenedor 
        txtdatos.setText("");
        
         try {
             Connection cone = conexiondb.obtieneConexion();
            Statement st = cone.createStatement();    //b. Crear el objeto statement

            //c. crear la consulta SQL
            //d. Almancenar en el Resulset(array)
            ResultSet rs = st.executeQuery("SELECT * FROM categoria");
            
            // e. recorrer por cada fila
            while (rs.next()){
                txtdatos.append(rs.getInt("codigo")+ " "+rs.getString("nombre")+"\n");
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btninsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertarActionPerformed
        
         try {
             Connection con = conexiondb.obtieneConexion();
            
            String codigo = "insert into categoria values(?,?,?)";
            
            // tomar los valore de una caja de texto
            int c = Integer.parseInt(txtcod.getText());
            String n = txtnom.getText();
            String d = txtdes.getText();

            // crear el Statement
            PreparedStatement pst = con.prepareStatement(codigo);
            
            // enviar los valores a parametro
            pst.setInt(1, c);
            pst.setString(2, n);
            pst.setString(3, d);
            
            pst.executeUpdate();
            
            
        } catch (Exception e) {
            System.out.println("revisar error"+e);
        }
    }//GEN-LAST:event_btninsertarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionCategoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionCategoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btninsertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextArea txtdatos;
    private javax.swing.JTextField txtdes;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
