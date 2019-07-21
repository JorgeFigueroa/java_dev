package C07_pjContadores;

import javax.swing.JOptionPane;

public class frmHotel extends javax.swing.JFrame {

    int cSimple,cDoble,cMatrimonial;
    int pSimple,pDoble,pMatrimonial;
    double aSimple,aDoble,aMatrimonial;
    
    public frmHotel() {
        initComponents();
        llenaHabitacion();
    }

    void llenaHabitacion(){
        cboHabitacion.addItem("Simple");
        cboHabitacion.addItem("Doble");
        cboHabitacion.addItem("Matrimonial");
    }
    
    int getHabitacion(){ 
        return cboHabitacion.getSelectedIndex();
    }
        
    int getDias(){ 
        return Integer.parseInt(txtDias.getText());
    }
    
    int getNumero(){ 
        return Integer.parseInt(txtNumero.getText());
    }
    
    double determinaCosto(int habitacion){
        switch(habitacion){
            case 0: return 20;
            case 1: return 40;
            default: return 100;
        }
    }
    
    double calculaMonto(int dias, double costo){
        return dias*costo;
    }
    
    void resumen(double costo,int dias,double monto){
        txtR.setText("");
        txtR.append("HABITACION :"+cboHabitacion.getSelectedItem());
        txtR.append("\nCOSTO  :$ "+String.format("%.2f",costo));
        txtR.append("\nNº DIAS :"+dias);
        txtR.append("\n----------------------------------------------");
        txtR.append("\nMONTO A PAGAR: $ "+String.format("%.2f",monto));
        
    }
    
    void estadisticas(int numero, double monto){
        switch(getHabitacion()){
            case 0: 
                cSimple++;
                pSimple+=numero;
                aSimple+=monto;
                break;
            case 1: 
                cDoble++;
                pDoble+=numero;
                aDoble+=monto;
                break;
            default: 
                cMatrimonial++;
                pMatrimonial+=numero;
                aMatrimonial+=monto;
        }
    }
           
    void imprimir(){
        int total = cSimple+cDoble+cMatrimonial;
        txtE.setText("");
        txtE.append("Total de Alquiler : "+total);
        txtE.append("\nTotal Alquiler Simple: "+cSimple);
        txtE.append("\nTotal Alquiler Doble: "+cDoble);
        txtE.append("\nTotal Alquiler Matrimonial: "+cMatrimonial);
        txtE.append("\n---------------------------------------------------------------");
        txtE.append("\nPorcentaje de Alquiler Simple: "+(cSimple*100)/total+"%");
        txtE.append("\nPorcentaje de Alquiler Doble: "+(cDoble*100)/total+"%");
        txtE.append("\nPorcentaje de Alquiler Matrimonial: "+(cMatrimonial*100)/total+"%");
        txtE.append("\n---------------------------------------------------------------");
        txtE.append("\nTotal de personas hospedadas en Simple: "+pSimple);
        txtE.append("\nTotal de personas hospedadas en Doble: "+pDoble);
        txtE.append("\nTotal de personas hospedadas en Matrimonial: "+pMatrimonial);
        txtE.append("\n---------------------------------------------------------------");
        txtE.append("\nMonto Total en Simple: "+String.format("%.2f",aSimple));
        txtE.append("\nMonto Total en Doble: "+String.format("%.2f",aDoble));
        txtE.append("\nMonto Total en Matrimonial: "+String.format("%.2f",aMatrimonial));
    }
    
    void limpiar(){
        cboHabitacion.setSelectedIndex(-1);
        txtDias.setText("");
        txtNumero.setText("");
        cboHabitacion.requestFocus();
    }
    
    void reiniciarGlobales(){
        cSimple=0;
        pSimple=0;
        aSimple=0;
        cDoble=0;
        pDoble=0;
        aDoble=0;
        cMatrimonial=0;
        pMatrimonial=0;
        aMatrimonial=0;
    }
    
    String valida(){
        if (cboHabitacion.getSelectedIndex()==-1){
            cboHabitacion.requestFocus();
            return "Tipo de Habitacion";
        }
        else if (txtDias.getText().equals("") || Integer.parseInt(txtDias.getText())<1){
            txtDias.requestFocus();
            return "Numero de dias";
        }
        else if (txtNumero.getText().equals("") || Integer.parseInt(txtNumero.getText())<1){
            txtDias.requestFocus();
            return "Numero de dias";
        }
        else
            return "";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboHabitacion = new javax.swing.JComboBox();
        txtNumero = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();
        txtDias = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtE = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("REGISTRO DE ALQUILERES");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 210, 18);

        cboHabitacion.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cboHabitacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de Habitacion"));
        getContentPane().add(cboHabitacion);
        cboHabitacion.setBounds(10, 50, 360, 60);

        txtNumero.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNumero.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero de Personas "));
        getContentPane().add(txtNumero);
        txtNumero.setBounds(230, 120, 140, 60);

        btnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(400, 60, 110, 40);

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(510, 60, 110, 40);

        btnProcesar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar);
        btnProcesar.setBounds(400, 100, 220, 70);

        txtR.setColumns(20);
        txtR.setRows(5);
        txtR.setBorder(javax.swing.BorderFactory.createTitledBorder("Resumen de Alquiler"));
        jScrollPane1.setViewportView(txtR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 190, 610, 110);

        txtDias.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtDias.setBorder(javax.swing.BorderFactory.createTitledBorder("Dias Alquilados"));
        getContentPane().add(txtDias);
        txtDias.setBounds(10, 120, 140, 60);

        txtE.setColumns(20);
        txtE.setRows(5);
        txtE.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadisticas"));
        jScrollPane2.setViewportView(txtE);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 310, 610, 310);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-651)/2, (screenSize.height-672)/2, 651, 672);
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        if (valida().equals("")){
            //1
            int habitacion=getHabitacion();
            int dias=getDias();
            int numero=getNumero();
        
            //2
            double costo=determinaCosto(habitacion);
        
            //3
            double monto=calculaMonto(dias, costo);
        
            //4
            resumen(costo, dias, monto);
            estadisticas(numero, monto);
        
            //5
            imprimir();
            limpiar();
        }else 
            JOptionPane.showMessageDialog(null, "Error en "+valida());
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        reiniciarGlobales();
        txtR.setText("");
        txtE.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r=JOptionPane.showOptionDialog(this, 
            "Estas seguro de salir...?", 
            "HOTEL", 
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,null,null);
        if (r==0) System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmHotel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextArea txtE;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
