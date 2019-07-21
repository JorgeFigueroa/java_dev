package C10_pjCertamen.pFormularios;

import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import C10_pjCertamen.pClases.arreglo;

public class frmCertamen extends javax.swing.JFrame {

    arreglo aCan = new arreglo();
    
    DefaultListModel moCandidatas=new DefaultListModel();
    DefaultListModel moPromedio=new DefaultListModel();
    DefaultListModel moEstadisticas=new DefaultListModel();

    DecimalFormat df;
    
    public frmCertamen() {
        initComponents();
        df=new DecimalFormat("#0.00");
    }

   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCandidata = new javax.swing.JTextField();
        txtPuntaje3 = new javax.swing.JTextField();
        txtPuntaje1 = new javax.swing.JTextField();
        txtPuntaje2 = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCandidatas = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPromedio = new javax.swing.JList();
        btnEstadisticas = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstE = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setText("CERTAMEN DE BELLEZA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 10, 320, 30);

        txtCandidata.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtCandidata.setBorder(javax.swing.BorderFactory.createTitledBorder("Candidata"));
        getContentPane().add(txtCandidata);
        txtCandidata.setBounds(10, 50, 540, 60);

        txtPuntaje3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtPuntaje3.setBorder(javax.swing.BorderFactory.createTitledBorder("Puntaje 3"));
        getContentPane().add(txtPuntaje3);
        txtPuntaje3.setBounds(270, 110, 120, 60);

        txtPuntaje1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtPuntaje1.setBorder(javax.swing.BorderFactory.createTitledBorder("Puntaje 1"));
        getContentPane().add(txtPuntaje1);
        txtPuntaje1.setBounds(10, 110, 120, 60);

        txtPuntaje2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtPuntaje2.setBorder(javax.swing.BorderFactory.createTitledBorder("Puntaje 2"));
        getContentPane().add(txtPuntaje2);
        txtPuntaje2.setBounds(140, 110, 120, 60);

        btnRegistrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar);
        btnRegistrar.setBounds(410, 120, 140, 50);

        lstCandidatas.setBorder(javax.swing.BorderFactory.createTitledBorder("Listado de Candidatas"));
        jScrollPane1.setViewportView(lstCandidatas);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 190, 280, 150);

        lstPromedio.setBorder(javax.swing.BorderFactory.createTitledBorder("Promedio"));
        jScrollPane2.setViewportView(lstPromedio);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(310, 190, 90, 150);

        btnEstadisticas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnEstadisticas.setText("ESTADISTICAS");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstadisticas);
        btnEstadisticas.setBounds(410, 290, 140, 50);

        lstE.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadisticas"));
        jScrollPane3.setViewportView(lstE);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 360, 530, 100);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-592)/2, (screenSize.height-507)/2, 592, 507);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
            if (valida().equals("")){
                String candidata = getnombre();
                double puntaje1=getPuntaje1();
                double puntaje2=getPuntaje2();
                double puntaje3=getPuntaje3();
                aCan.registraCandidata(candidata, calculaPromedio());
                imprimir();
                limpiar();
            }else
            JOptionPane.showMessageDialog(null,"Error en "+valida());
                
        } catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error en la Aplicacion");

        }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        int total=aCan.totalCandidatas();
        moEstadisticas.clear();
        moEstadisticas.addElement("El Total de Candidatas es: "+total);
        moEstadisticas.addElement("La ganadora es: "+aCan.ganadora());
        moEstadisticas.addElement("El Maximo puntaje es: "+df.format(aCan.puntajeAlto()));
        lstE.setModel(moEstadisticas);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    //********      METODOS DE LA CLASE FRMCERTAMEN     *******//
    String getnombre(){ 
        return txtCandidata.getText(); 
    }
    double getPuntaje1(){
        return Double.parseDouble(txtPuntaje1.getText());
    }
    double getPuntaje2(){
        return Double.parseDouble(txtPuntaje2.getText());
    }
    double getPuntaje3(){
        return Double.parseDouble(txtPuntaje3.getText());
    }
    double calculaPromedio(){
        return (getPuntaje1()+getPuntaje2()+getPuntaje3())/3.0;
    }

    void imprimir(){
        moCandidatas.clear();
        moPromedio.clear();
        moEstadisticas.clear();
       
        for(int i=0;i<aCan.totalCandidatas();i++){
            moCandidatas.addElement(aCan.devuelveNombre(i));
            moPromedio.addElement(df.format(aCan.devuelvePromedio(i)));
        }
        lstCandidatas.setModel(moCandidatas);
        lstPromedio.setModel(moPromedio);
    }

    void limpiar(){
        txtCandidata.setText("");
        txtPuntaje1.setText("");
        txtPuntaje2.setText("");
        txtPuntaje3.setText("");
        txtCandidata.requestFocus();
    }

    String valida(){
        if (txtCandidata.getText().equals("")){
            txtCandidata.requestFocus();
            return "Nombre de la candidata";
        } else if(txtPuntaje1.getText().equals("")||
                  Double.parseDouble(txtPuntaje1.getText())<0 ||
                  Double.parseDouble(txtPuntaje1.getText())>100){
            txtPuntaje1.setText("");
            txtPuntaje1.requestFocus();
            return "Puntaje 1";
        }else if(txtPuntaje2.getText().equals("")||
                  Double.parseDouble(txtPuntaje2.getText())<0 ||
                  Double.parseDouble(txtPuntaje2.getText())>100){
            txtPuntaje2.setText("");
            txtPuntaje2.requestFocus();
            return "Puntaje 2";
        }else if(txtPuntaje3.getText().equals("")||
                  Double.parseDouble(txtPuntaje3.getText())<0 ||
                  Double.parseDouble(txtPuntaje3.getText())>100){
            txtPuntaje3.setText("");
            txtPuntaje3.requestFocus();
            return "Puntaje 3";
        } else
            return "";

    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCertamen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList lstCandidatas;
    private javax.swing.JList lstE;
    private javax.swing.JList lstPromedio;
    private javax.swing.JTextField txtCandidata;
    private javax.swing.JTextField txtPuntaje1;
    private javax.swing.JTextField txtPuntaje2;
    private javax.swing.JTextField txtPuntaje3;
    // End of variables declaration//GEN-END:variables

}
