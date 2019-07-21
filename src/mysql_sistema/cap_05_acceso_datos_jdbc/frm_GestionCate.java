package mysql_sistema.cap_05_acceso_datos_jdbc;

import java.sql.*;
import javax.swing.DefaultListModel;
import mysql_sistema.cap_04_introduccion_mysql.conexiondb;


public class frm_GestionCate extends javax.swing.JFrame {
    
        // 2. crear objetos  globales
    Connection cone = conexiondb.obtieneConexion();
    Statement st = null; // prepara consulta - SQL
    ResultSet rs = null; // tabla temporal
    
    // 3. elaborar modelos de la lista
    DefaultListModel modelo1 = new DefaultListModel();
    DefaultListModel modelo2 = new DefaultListModel();
    DefaultListModel modelo3 = new DefaultListModel();

    
    
    
    
    public frm_GestionCate() {
        initComponents();
        // instruciones al cargar el formulario
        lbcod.setModel(modelo1);
        lbnom.setModel(modelo2);
        lbdes.setModel(modelo3);
        
        try {
            st = cone.createStatement();
            rs = st.executeQuery("select * from categoria");
            
            while(rs.next()){
                modelo1.addElement(rs.getInt("codigo"));
                modelo2.addElement(rs.getString(2));
                modelo3.addElement(rs.getString(3));

            }
        } catch (Exception e) {
        }

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
        lbcodaaa = new javax.swing.JLabel();
        lbnomaaa = new javax.swing.JLabel();
        lbdesaaa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lbcod = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lbnom = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lbdes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("consulta de categoria");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 22, -1, -1));

        lbcodaaa.setText("codigo ");
        getContentPane().add(lbcodaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 54, -1, -1));

        lbnomaaa.setText("nombre");
        getContentPane().add(lbnomaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        lbdesaaa.setText("descripcion");
        getContentPane().add(lbdesaaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jScrollPane1.setViewportView(lbcod);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 30, -1));

        jScrollPane2.setViewportView(lbnom);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, -1));

        jScrollPane3.setViewportView(lbdes);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frm_GestionCate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_GestionCate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_GestionCate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_GestionCate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_GestionCate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> lbcod;
    private javax.swing.JLabel lbcodaaa;
    private javax.swing.JList<String> lbdes;
    private javax.swing.JLabel lbdesaaa;
    private javax.swing.JList<String> lbnom;
    private javax.swing.JLabel lbnomaaa;
    // End of variables declaration//GEN-END:variables
}