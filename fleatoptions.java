/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abhin
 */
public class fleatoptions extends javax.swing.JFrame {

    /**
     * Creates new form fleatoptions
     */
    public fleatoptions() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-qqqqfold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents

    private void initComponents() {

        jcar = new javax.swing.JButton();
        jbus = new javax.swing.JButton();
        jtraveller = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jprev1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 420));
        getContentPane().setLayout(null);

        jcar.setBackground(new java.awt.Color(153, 153, 153));
        jcar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jcar.setText("CAR");
        jcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcarActionPerformed(evt);
            }
        });
        getContentPane().add(jcar);
        jcar.setBounds(250, 340, 90, 30);

        jbus.setBackground(new java.awt.Color(153, 153, 153));
        jbus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbus.setText("BUS");
        jbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbusActionPerformed(evt);
            }
        });
        getContentPane().add(jbus);
        jbus.setBounds(50, 340, 150, 30);

        jtraveller.setBackground(new java.awt.Color(153, 153, 153));
        jtraveller.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jtraveller.setText("TRAVELLER");
        jtraveller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtravellerActionPerformed(evt);
            }
        });
        getContentPane().add(jtraveller);
        jtraveller.setBounds(420, 340, 140, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHOOSE VEHICLE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 10, 300, 48);

        jprev1.setBackground(new java.awt.Color(255, 102, 102));
        jprev1.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1717084224212.jpg")); // NOI18N
        jprev1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jprev1ActionPerformed(evt);
            }
        });
        getContentPane().add(jprev1);
        jprev1.setBounds(20, 20, 50, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1717076347416.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents



    private void jcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcarActionPerformed
        // TODO add your handling code here:
        new types().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jcarActionPerformed

    private void jbusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbusActionPerformed
        // TODO add your handling code here:
        new packagesbus().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbusActionPerformed

    private void jtravellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtravellerActionPerformed
        // TODO add your handling code here:
        new packagestraveller().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jtravellerActionPerformed

    private void jprev1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jprev1ActionPerformed
        // TODO add your handling code here:
        new loginpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jprev1ActionPerformed

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
            java.util.logging.Logger.getLogger(fleatoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fleatoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fleatoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fleatoptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new types().setVisible(true);
                new packagesbus().setVisible(true);
                new packagestraveller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbus;
    private javax.swing.JButton jcar;
    private javax.swing.JButton jprev1;
    private javax.swing.JButton jtraveller;
    // End of variables declaration//GEN-END:variables
}
