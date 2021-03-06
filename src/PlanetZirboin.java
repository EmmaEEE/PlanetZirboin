/*Emma Elliott
May 5, 2020
Algorithm Design
 */

/**
 *
 * @author gregelliott
 */
public class PlanetZirboin extends javax.swing.JFrame {

    /**
     * Creates new form PlanetZirboin
     */
    public PlanetZirboin() {
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

        jPanel1 = new javax.swing.JPanel();
        lblInputVrobits = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        lblDrobzits = new javax.swing.JLabel();
        lblClickwicks = new javax.swing.JLabel();
        lblGazoontights = new javax.swing.JLabel();
        lblFrazoints = new javax.swing.JLabel();
        lblBlointoints = new javax.swing.JLabel();
        lblVrobits = new javax.swing.JLabel();
        lblDrobzitsOutput = new javax.swing.JLabel();
        lblClickwicksOutput = new javax.swing.JLabel();
        lblGazoontightsOutput = new javax.swing.JLabel();
        lblFrazointsOutput = new javax.swing.JLabel();
        lblBlointointsOutput = new javax.swing.JLabel();
        lblVrobitsOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInputVrobits.setText("Input total number of Vrobits:");

        txtInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 204));
        lblTitle.setText("Planet Zirboin");

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblDrobzits.setText("Drobzits:");

        lblClickwicks.setText("Clickwicks:");

        lblGazoontights.setText("Gazoontights:");

        lblFrazoints.setText("Frazoints:");

        lblBlointoints.setText("Blointoints:");

        lblVrobits.setText("Vrobits:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDrobzits)
                            .addComponent(lblClickwicks)
                            .addComponent(lblGazoontights))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGazoontightsOutput)
                            .addComponent(lblClickwicksOutput)
                            .addComponent(lblDrobzitsOutput)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVrobits, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBlointoints, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVrobitsOutput)
                            .addComponent(lblBlointointsOutput)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFrazoints)
                        .addGap(44, 44, 44)
                        .addComponent(lblFrazointsOutput))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblInputVrobits)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(btnCalculate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInputVrobits)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalculate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDrobzits)
                    .addComponent(lblDrobzitsOutput))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClickwicks)
                    .addComponent(lblClickwicksOutput))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGazoontights)
                    .addComponent(lblGazoontightsOutput))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFrazoints)
                    .addComponent(lblFrazointsOutput))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBlointoints)
                    .addComponent(lblBlointointsOutput))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVrobits)
                    .addComponent(lblVrobitsOutput))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
      int TotalVrobits,VrobitsRemain,Drobzits, Clickwicks, Gazoontights, Frazoints, Blointoints, Vrobits;
      TotalVrobits=Integer.parseInt(txtInput.getText());
      
      Drobzits= TotalVrobits/100000;
      VrobitsRemain=TotalVrobits%100000;
      lblDrobzitsOutput.setText(String.valueOf(Drobzits));
      
      Clickwicks=VrobitsRemain/50000;
      VrobitsRemain= VrobitsRemain%50000;
      lblClickwicksOutput.setText(String.valueOf(Clickwicks));
      
      Gazoontights=VrobitsRemain/10000;
      VrobitsRemain=VrobitsRemain%10000;
      lblGazoontightsOutput.setText(String.valueOf(Gazoontights));
      
      Frazoints= VrobitsRemain/1000;
      VrobitsRemain=VrobitsRemain%1000;
      lblFrazointsOutput.setText(String.valueOf(Frazoints));
      
      Blointoints=VrobitsRemain/500;
      VrobitsRemain=VrobitsRemain%500;
      lblBlointointsOutput.setText(String.valueOf(Blointoints));
      
      Vrobits=VrobitsRemain;
      lblVrobitsOutput.setText(String.valueOf(Vrobits));
      
      
      
      
      
      
      

// TODO add your handling code here:
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputActionPerformed

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
            java.util.logging.Logger.getLogger(PlanetZirboin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlanetZirboin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlanetZirboin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlanetZirboin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlanetZirboin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBlointoints;
    private javax.swing.JLabel lblBlointointsOutput;
    private javax.swing.JLabel lblClickwicks;
    private javax.swing.JLabel lblClickwicksOutput;
    private javax.swing.JLabel lblDrobzits;
    private javax.swing.JLabel lblDrobzitsOutput;
    private javax.swing.JLabel lblFrazoints;
    private javax.swing.JLabel lblFrazointsOutput;
    private javax.swing.JLabel lblGazoontights;
    private javax.swing.JLabel lblGazoontightsOutput;
    private javax.swing.JLabel lblInputVrobits;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVrobits;
    private javax.swing.JLabel lblVrobitsOutput;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
