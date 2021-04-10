// Nama : Talitha Aurelia Shakira
// NIM  : 11200930000023
// Kelas/Prodi : 2A/Sistem Informasi

package GUI;
public class KonversiSuhu extends javax.swing.JFrame {
    public Double input;
    public Double Celcius;
    public Double Fahrenheit;
    public Double Reamur;
    public Double Kelvin;
    public String HasilCelcius;
    public String HasilFahrenheit;
    public String HasilReamur;
    public String HasilKelvin;
    public KonversiSuhu() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSuhuAwal = new javax.swing.JTextField();
        BtnCelcius = new javax.swing.JRadioButton();
        BtnFahrenheit = new javax.swing.JRadioButton();
        BtnReamur = new javax.swing.JRadioButton();
        BtnKelvin = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCelcius = new javax.swing.JTextField();
        txtFahrenheit = new javax.swing.JTextField();
        txtReamur = new javax.swing.JTextField();
        txtKelvin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BtnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Aplikasi Konversi Suhu");

        jLabel2.setText("Suhu Awal");

        buttonGroup1.add(BtnCelcius);
        BtnCelcius.setSelected(true);
        BtnCelcius.setText("Celcius");
        BtnCelcius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCelciusActionPerformed(evt);
            }
        });

        buttonGroup1.add(BtnFahrenheit);
        BtnFahrenheit.setText("Fahrenheit");
        BtnFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFahrenheitActionPerformed(evt);
            }
        });

        buttonGroup1.add(BtnReamur);
        BtnReamur.setText("Reamur");
        BtnReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReamurActionPerformed(evt);
            }
        });

        buttonGroup1.add(BtnKelvin);
        BtnKelvin.setText("Kelvin");
        BtnKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKelvinActionPerformed(evt);
            }
        });

        jLabel3.setText("Result");

        jLabel4.setText("Celcius");

        jLabel5.setText("Fahrenheit");

        jLabel6.setText("Reamur");

        jLabel7.setText("Kelvin");

        txtReamur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtReamurActionPerformed(evt);
            }
        });

        txtKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKelvinActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        BtnDelete.setText("Delete");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtReamur, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnDelete))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnCelcius))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(txtSuhuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(BtnFahrenheit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnReamur)
                                .addGap(33, 33, 33)
                                .addComponent(BtnKelvin)))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSuhuAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCelcius)
                    .addComponent(BtnFahrenheit)
                    .addComponent(BtnReamur)
                    .addComponent(BtnKelvin))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCelcius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFahrenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtReamur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnDelete)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(57, 57, 57))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtReamurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtReamurActionPerformed

    private void txtKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKelvinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKelvinActionPerformed

    private void BtnCelciusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCelciusActionPerformed
        input=Double.parseDouble(txtSuhuAwal.getText());
        
        Celcius= input;
        Fahrenheit= Celcius*1.8 + 32;
        Reamur= Celcius * 0.8;
        Kelvin= Celcius + 273.15;

        HasilCelcius = Double.toString(Celcius);
        txtCelcius.setText(HasilCelcius);
        
        HasilFahrenheit = Double.toString(Fahrenheit);
        txtFahrenheit.setText(HasilFahrenheit);
        
        HasilReamur = Double.toString(Reamur);
        txtReamur.setText(HasilReamur);
        
        HasilKelvin = Double.toString(Kelvin);
        txtKelvin.setText(HasilKelvin);
    }//GEN-LAST:event_BtnCelciusActionPerformed

    private void BtnFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFahrenheitActionPerformed
         input=Double.parseDouble(txtSuhuAwal.getText());
         
        Fahrenheit= input;
        Celcius= (Fahrenheit-32)/1.8;
        Reamur= (Fahrenheit-32)/2.25;
        Kelvin=(Fahrenheit-459.67)/1.8;
        
        HasilCelcius = Double.toString(Celcius);
        txtCelcius.setText(HasilCelcius);
        
        HasilFahrenheit = Double.toString(Fahrenheit);
        txtFahrenheit.setText(HasilFahrenheit);
        
        HasilReamur = Double.toString(Reamur);
        txtReamur.setText(HasilReamur);
        
        HasilKelvin = Double.toString(Kelvin);
        txtKelvin.setText(HasilKelvin);  
    }//GEN-LAST:event_BtnFahrenheitActionPerformed

    private void BtnReamurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReamurActionPerformed
        input=Double.parseDouble(txtSuhuAwal.getText());
        
        Reamur= input;
        Celcius= Reamur/0.8;
        Fahrenheit= (Reamur - 7.5)*24/7+32;
        Kelvin= Reamur/0.8 + 273.15;

   
        HasilCelcius = Double.toString(Celcius);
        txtCelcius.setText(HasilCelcius);
        
        HasilFahrenheit = Double.toString(Fahrenheit);
        txtFahrenheit.setText(HasilFahrenheit);
        
        HasilReamur = Double.toString(Reamur);
        txtReamur.setText(HasilReamur);
        
        HasilKelvin = Double.toString(Kelvin);
        txtKelvin.setText(HasilKelvin);        
    }//GEN-LAST:event_BtnReamurActionPerformed

    private void BtnKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKelvinActionPerformed
        input=Double.parseDouble(txtSuhuAwal.getText());
        
        Kelvin= input;
        Celcius= Kelvin-273.15;
        Fahrenheit= Kelvin*1.8-459.67;
        Reamur= (Kelvin-273.15)*0.8;
        
        HasilCelcius = Double.toString(Celcius);
        txtCelcius.setText(HasilCelcius);
        
        HasilFahrenheit = Double.toString(Fahrenheit);
        txtFahrenheit.setText(HasilFahrenheit);
        
        HasilReamur = Double.toString(Reamur);
        txtReamur.setText(HasilReamur);
        
        HasilKelvin = Double.toString(Kelvin);
        txtKelvin.setText(HasilKelvin);
        
    }//GEN-LAST:event_BtnKelvinActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        txtCelcius.setText("");
        txtFahrenheit.setText("");
        txtReamur.setText("");
        txtKelvin.setText("");
        txtSuhuAwal.setText("");
        txtSuhuAwal.requestFocus();
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

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
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KonversiSuhu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KonversiSuhu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BtnCelcius;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JRadioButton BtnFahrenheit;
    private javax.swing.JRadioButton BtnKelvin;
    private javax.swing.JRadioButton BtnReamur;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCelcius;
    private javax.swing.JTextField txtFahrenheit;
    private javax.swing.JTextField txtKelvin;
    private javax.swing.JTextField txtReamur;
    private javax.swing.JTextField txtSuhuAwal;
    // End of variables declaration//GEN-END:variables
}
