package C07_pjContadores;

import javax.swing.JOptionPane;

public class frmFiesta extends javax.swing.JFrame {

    //Declaracion de variables Globales
    int total,tHombres,tMujeres;
    int tMayores,tMenores;
    int tSolteros,tCasados,tViudos,tDivorciados;
            
    public frmFiesta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgEstados = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        chkMasculino = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();
        rbSoltero = new javax.swing.JRadioButton();
        rbCasado = new javax.swing.JRadioButton();
        rbViudo = new javax.swing.JRadioButton();
        rbDivorciado = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("REGISTRO DE PARTICIPANTES A LA FIESTA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(145, 11, 310, 14);

        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Edad"));
        getContentPane().add(txtEdad);
        txtEdad.setBounds(20, 50, 160, 60);

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(200, 50, 160, 40);

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(360, 50, 170, 40);

        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar);
        btnProcesar.setBounds(200, 90, 330, 40);

        chkMasculino.setText("MASCULINO");
        getContentPane().add(chkMasculino);
        chkMasculino.setBounds(20, 120, 130, 23);

        txtR.setColumns(20);
        txtR.setRows(5);
        jScrollPane1.setViewportView(txtR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(200, 130, 330, 230);

        bgEstados.add(rbSoltero);
        rbSoltero.setText("SOLTERO");
        getContentPane().add(rbSoltero);
        rbSoltero.setBounds(40, 200, 100, 23);

        bgEstados.add(rbCasado);
        rbCasado.setText("CASADO");
        getContentPane().add(rbCasado);
        rbCasado.setBounds(40, 230, 100, 23);

        bgEstados.add(rbViudo);
        rbViudo.setText("VIUDO");
        getContentPane().add(rbViudo);
        rbViudo.setBounds(40, 260, 90, 23);

        bgEstados.add(rbDivorciado);
        rbDivorciado.setText("DIVORCIADO");
        getContentPane().add(rbDivorciado);
        rbDivorciado.setBounds(40, 290, 120, 23);

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado Civil"));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 160, 160, 200);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-565)/2, (screenSize.height-413)/2, 565, 413);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        if (valida().equals("")){
            estadisticas();    
            limpiar();
            imprimir();
        } else 
            JOptionPane.showMessageDialog(null,"Ocurrio un error en "+valida());      
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        txtR.setText("");
        reinicializaVariables();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r=JOptionPane.showOptionDialog(this, 
            "Estas seguro de salir...?", 
            "Acumuladoress y Contadores", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,null,null);
        if (r==0) System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    int getEdad(){
        return Integer.parseInt(txtEdad.getText());
    }
    boolean getMasculino(){
        if (chkMasculino.isSelected())
            return true;
        else
            return false;
    }
    
    String getEstado(){
        if (rbSoltero.isSelected())
            return "Soltero";
        else if (rbCasado.isSelected())
            return "Casado";
        else if (rbViudo.isSelected())
            return "Viudo";
        else 
            return "Divorciado";
    }
    
    String valida(){
        if (txtEdad.getText().equals("")||Integer.parseInt(txtEdad.getText())<0)
            return "Edad del Asistente..!!!";
        else if (!(rbSoltero.isSelected() || rbCasado.isSelected() ||
                rbViudo.isSelected() || rbDivorciado.isSelected()))
            return "Estado Civil del Asistente..!!!";
        else 
            return "";
    }
    void estadisticas(){
        //
        total++;
        
        //
        if (getEdad()>18) 
            tMayores++; 
        else 
            tMenores++;
        
        //
        if (getMasculino()==true)
            tHombres++;
        else 
            tMujeres++;
        
        //
        if (getEstado().equals("Soltero"))
            tSolteros++;
        else if (getEstado().equals("Casado"))
            tCasados++;
        else if (getEstado().equals("Viudo"))
            tViudos++;
        else 
            tDivorciados++;
    }
    
    void imprimir(){
        txtR.setText("");
        txtR.append("El Total de Asistentes es: "+total);
        txtR.append("\nEl Total de Personas mayores de edad es: "+tMayores);
        txtR.append("\nEl Total de Personas menores de edad es: "+tMenores);
        txtR.append("\nEl Total de Hombres es: "+tHombres);
        txtR.append("\nEl Total de Mujeres es: "+tMujeres);
        txtR.append("\nEl Total de Solteros es: "+tSolteros);
        txtR.append("\nEl Total de Casados es: "+tCasados);
        txtR.append("\nEl Total de Viudos es: "+tViudos);
        txtR.append("\nEl Total de Divorciados es: "+tDivorciados);
        txtR.append("\nEl Porcentaje de Hombres es: "+(tHombres*100)/total);
        txtR.append("\nEl Porcentaje de Mujeres es: "+(tMujeres*100)/total);
        
    }
    
    void limpiar(){
        txtEdad.setText("");
        chkMasculino.setSelected(false);
        rbSoltero.setSelected(false);
        rbCasado.setSelected(false);
        rbViudo.setSelected(false);
        rbDivorciado.setSelected(false);
        txtEdad.requestFocus();
    }
    
    void reinicializaVariables(){
        total=0;
        tHombres=0;
        tMujeres=0;
        tMayores=0;
        tMenores=0;
        tSolteros=0;
        tCasados=0;
        tViudos=0;
        tDivorciados=0;
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
            java.util.logging.Logger.getLogger(frmFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFiesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFiesta().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgEstados;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox chkMasculino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbCasado;
    private javax.swing.JRadioButton rbDivorciado;
    private javax.swing.JRadioButton rbSoltero;
    private javax.swing.JRadioButton rbViudo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
