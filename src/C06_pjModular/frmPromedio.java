package C06_pjModular;

import javax.swing.JOptionPane;

public class frmPromedio extends javax.swing.JFrame {

    public frmPromedio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtAlumno = new javax.swing.JTextField();
        txtNota1 = new javax.swing.JTextField();
        txtNota2 = new javax.swing.JTextField();
        txtNota3 = new javax.swing.JTextField();
        txtNota4 = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtR = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel2.setText("REGISTRO DE NOTAS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 20, 180, 18);

        txtAlumno.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Alumno"));
        getContentPane().add(txtAlumno);
        txtAlumno.setBounds(20, 50, 580, 60);

        txtNota1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNota1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota 1"));
        getContentPane().add(txtNota1);
        txtNota1.setBounds(50, 140, 110, 60);

        txtNota2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNota2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota 2"));
        getContentPane().add(txtNota2);
        txtNota2.setBounds(200, 140, 110, 60);

        txtNota3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNota3.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota 3"));
        getContentPane().add(txtNota3);
        txtNota3.setBounds(50, 200, 110, 60);

        txtNota4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtNota4.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota 4"));
        getContentPane().add(txtNota4);
        txtNota4.setBounds(200, 200, 110, 60);

        btnSalir.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(480, 220, 120, 40);

        btnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(360, 220, 120, 40);

        btnMostrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnMostrar.setText("MOSTRAR");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnMostrar);
        btnMostrar.setBounds(360, 180, 240, 40);

        txtR.setColumns(20);
        txtR.setRows(5);
        jScrollPane1.setViewportView(txtR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 280, 590, 240);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese Notas"));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 120, 320, 150);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-629)/2, (screenSize.height-572)/2, 629, 572);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int r = JOptionPane.showOptionDialog(this,
                "Estas seguro de salir...?",
                "Validacion..!!",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null);
        if (r == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        //
        if (valida().equals("")) {
            //
            String alumno = getAlumno();
            double nota1 = getNota1();
            double nota2 = getNota2();
            double nota3 = getNota3();
            double nota4 = getNota4();

            //
            double promedio = calculaPromedio(nota1, nota2, nota3, nota4);

            //
            double altaNota = determinaAltaNota(nota1, nota2, nota3, nota4);
            double bajaNota = determinaBajaNota(nota1, nota2, nota3, nota4);
            String criterio = determinaCriterio(promedio);

            //
            imprimir(promedio, altaNota, bajaNota, criterio);
        } else {
            JOptionPane.showMessageDialog(null, "Verificar los datos en el campo " + valida());
        }


    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    //1
    String getAlumno() {
        return txtAlumno.getText();
    }

    //2
    double getNota1() {
        return Double.parseDouble(txtNota1.getText());
    }

    //3
    double getNota2() {
        return Double.parseDouble(txtNota2.getText());
    }

    //4
    double getNota3() {
        return Double.parseDouble(txtNota3.getText());
    }

    //5
    double getNota4() {
        return Double.parseDouble(txtNota4.getText());
    }

    //6
    String valida() {

        if (getAlumno().equals("")) {
            txtAlumno.setText("");
            txtAlumno.requestFocus();
            return "Nombre del Alumno";
        } else if (validaNumberEmty(txtNota1.getText()) || getNota1() < 0 || getNota1() > 20) {
            txtNota1.setText("");
            txtNota1.requestFocus();
            return "Nota 1";
        } else if (validaNumberEmty(txtNota2.getText()) || getNota2() < 0 || getNota2() > 20) {
            txtNota2.setText("");
            txtNota2.requestFocus();
            return "Nota 2";
        } else if (validaNumberEmty(txtNota3.getText()) || getNota3() < 0 || getNota3() > 20) {
            txtNota3.setText("");
            txtNota3.requestFocus();
            return "Nota 3";
        } else if (validaNumberEmty(txtNota4.getText()) || getNota4() < 0 || getNota4() > 20) {
            txtNota4.setText("");
            txtNota4.requestFocus();
            return "Nota 4";
        } else {
            return "";
        }

    }

    Boolean validaNumberEmty(String txtNota) {
        Boolean valida = true;
        if (txtNota.matches("[0-9]*") && !txtNota.equals("")) {
            valida = false;
        }
        return valida;
    }

    //7
    double calculaPromedio(double n1, double n2, double n3, double n4) {
        return (n1 + n2 + n3 + n4) / 4.0;
    }

    //8
    double determinaAltaNota(double n1, double n2, double n3, double n4) {
        double mayor = 0;
        if (n1 > n2) {
            mayor = n1;
        } else {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }
        if (n4 > mayor) {
            mayor = n4;
        }
        return mayor;
    }

    //9
    double determinaBajaNota(double n1, double n2, double n3, double n4) {
        double menor = 0;
        if (n1 < n2) {
            menor = n1;
        } else {
            menor = n2;
        }
        if (n3 < menor) {
            menor = n3;
        }
        if (n4 < menor) {
            menor = n4;
        }
        return menor;
    }

    //10
    String determinaCriterio(double promedio) {
        if (promedio > 10) {
            return "Aprobo por " + String.valueOf(promedio - 10) + " puntos";
        } else {
            return "Desaprobo por " + String.valueOf(11 - promedio) + " puntos";
        }
    }

    //11
    void imprimir(double promedio, double altaNota,
            double bajaNota, String criterio) {
        txtR.setText("");
        txtR.append("ALUMNO: " + getAlumno());
        txtR.append("\nNOTA 1: " + getNota1());
        txtR.append("\nNOTA 2: " + getNota2());
        txtR.append("\nNOTA 3: " + getNota3());
        txtR.append("\nNOTA 4: " + getNota4());
        txtR.append("\n--------------------------------");
        txtR.append("\nPROMEDIO: " + promedio);
        txtR.append("\nALTA NOTA: " + altaNota);
        txtR.append("\nBAJA NOTA: " + bajaNota);
        txtR.append("\nCRITERIO: " + criterio);

    }

    //12
    void limpiar() {
        txtAlumno.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        txtNota4.setText("");
        txtAlumno.requestFocus();
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
            java.util.logging.Logger.getLogger(frmPromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPromedio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPromedio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlumno;
    private javax.swing.JTextField txtNota1;
    private javax.swing.JTextField txtNota2;
    private javax.swing.JTextField txtNota3;
    private javax.swing.JTextField txtNota4;
    private javax.swing.JTextArea txtR;
    // End of variables declaration//GEN-END:variables
}
