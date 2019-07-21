package mysql_sistema.cap_06_Implementacion_Sistema_informacion.frm_Acesso;// 1. importar librerias

import mysql_sistema.cap_06_Implementacion_Sistema_informacion.conexion.conexiondb;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class w_login extends javax.swing.JFrame {
    // 2. nivel de clase
    // creando objetos
    w_principal obj_inicial = new w_principal();
     Connection cone = conexiondb.conetarbd();
     Statement st = null;
     ResultSet rs = null;

     // programa cerrar proyecto(aplicacion)
    void salir(){
        int r = JOptionPane.showConfirmDialog(this, "estas seguro de cerrar?", "ALERTA", JOptionPane.YES_NO_OPTION);
        if(r==0)System.exit(0);
    }
    
    public w_login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        btnacceder = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        txtclave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NICK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel2.setText("PASSWORD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 90, 30));

        btnacceder.setText("LOGIN");
        btnacceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaccederActionPerformed(evt);
            }
        });
        getContentPane().add(btnacceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        btnsalir.setText("CANCEL");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));
        getContentPane().add(txtclave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 90, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
  
    }//GEN-LAST:event_txtusuarioActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        salir(); // boton salir
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnaccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaccederActionPerformed
        // btn acceder
        // A. variables locales
        String user, pass, tipoUser = "";

        //B. tomar los datos del formulario
        user = txtusuario.getText();
        pass = txtclave.getText();
        
        // C. preparando consulta
        String sql;
        sql = "SELECT * FROM usuario WHERE nombre='"+user+"' && clave='"+pass+"';";
     
        try {
            st = cone.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                tipoUser = rs.getString(3);
            }
            
            if(tipoUser.equals("admin")){

                obj_inicial.setVisible(true);
                this.setVisible(false); // ocultar ventana login
            }
            
            if (tipoUser.equals("")) {
                JOptionPane.showConfirmDialog(this, "Contraseña incorrecta", "ALERTA", JOptionPane.YES_NO_OPTION);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }    
        

    }//GEN-LAST:event_btnaccederActionPerformed

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
            java.util.logging.Logger.getLogger(w_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(w_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(w_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(w_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new w_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnacceder;
    private javax.swing.JButton btnsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField txtclave;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
