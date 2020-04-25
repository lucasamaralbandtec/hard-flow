package com.mycompany.oshi;
public class RecuperacaoSenha extends javax.swing.JFrame {

    /**
     * Creates new form RecuperacaoSenha
     */
    public RecuperacaoSenha() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmail4 = new javax.swing.JLabel();
        lblEmail6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblEmail2 = new javax.swing.JLabel();
        lblEmail1 = new javax.swing.JLabel();
        lblEmail3 = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblEmail5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblEmail7 = new javax.swing.JLabel();

        lblEmail4.setBackground(new java.awt.Color(0, 0, 0));
        lblEmail4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEmail4.setText("x");
        lblEmail4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmail4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmail4MouseClicked(evt);
            }
        });

        lblEmail6.setBackground(new java.awt.Color(0, 0, 0));
        lblEmail6.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblEmail6.setForeground(new java.awt.Color(153, 150, 155));
        lblEmail6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/oshi/log35.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblEmail2.setBackground(new java.awt.Color(102, 255, 102));
        lblEmail2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEmail2.setText("Password Recovery ");

        lblEmail1.setBackground(new java.awt.Color(0, 0, 0));
        lblEmail1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblEmail1.setText("You can change your password for security ");

        lblEmail3.setBackground(new java.awt.Color(0, 0, 0));
        lblEmail3.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblEmail3.setText("reaseons or reset, if you forget.");

        lblEmail.setBackground(new java.awt.Color(0, 0, 0));
        lblEmail.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(153, 150, 155));
        lblEmail.setText("Email");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTextField1.setBorder(null);

        jSeparator1.setBackground(new java.awt.Color(54, 185, 204));
        jSeparator1.setForeground(new java.awt.Color(54, 185, 204));
        jSeparator1.setToolTipText("");
        jSeparator1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(54, 185, 204), 1, true));

        lblEmail5.setBackground(new java.awt.Color(0, 0, 0));
        lblEmail5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblEmail5.setText("x");
        lblEmail5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmail5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmail5MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(54, 185, 204));
        jButton1.setText("Send");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblEmail7.setBackground(new java.awt.Color(0, 0, 0));
        lblEmail7.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblEmail7.setForeground(new java.awt.Color(153, 150, 155));
        lblEmail7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/oshi/log35.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail3)
                            .addComponent(lblEmail1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmail2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblEmail7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEmail5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail5)
                    .addComponent(lblEmail2)
                    .addComponent(lblEmail7))
                .addGap(18, 18, 18)
                .addComponent(lblEmail1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail3)
                .addGap(18, 18, 18)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void lblEmail4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmail4MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_lblEmail4MouseClicked

    private void lblEmail5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmail5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblEmail5MouseClicked

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
            java.util.logging.Logger.getLogger(RecuperacaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperacaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperacaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperacaoSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperacaoSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmail1;
    private javax.swing.JLabel lblEmail2;
    private javax.swing.JLabel lblEmail3;
    private javax.swing.JLabel lblEmail4;
    private javax.swing.JLabel lblEmail5;
    private javax.swing.JLabel lblEmail6;
    private javax.swing.JLabel lblEmail7;
    // End of variables declaration//GEN-END:variables
}
