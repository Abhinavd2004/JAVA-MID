/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abhin
 */
public class destinationbus3 extends javax.swing.JFrame {

    /**
     * Creates new form destinationbus3
     */
    public destinationbus3() {
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

        jLabel1 = new javax.swing.JLabel();
        jbusecotb = new javax.swing.JButton();
        jbusecott = new javax.swing.JButton();
        jbusecotc = new javax.swing.JButton();
        jbuseco = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 420));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHOOSE DESTINATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 80, 320, 32);

        jbusecotb.setBackground(new java.awt.Color(153, 153, 153));
        jbusecotb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbusecotb.setText("TRIVANDRUM-BENGALURU");
        jbusecotb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbusecotbActionPerformed(evt);
            }
        });
        getContentPane().add(jbusecotb);
        jbusecotb.setBounds(70, 170, 450, 60);

        jbusecott.setBackground(new java.awt.Color(153, 153, 153));
        jbusecott.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbusecott.setText("TRIVANDRUM-TIRUPATI");
        jbusecott.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbusecottActionPerformed(evt);
            }
        });
        getContentPane().add(jbusecott);
        jbusecott.setBounds(70, 250, 450, 50);

        jbusecotc.setBackground(new java.awt.Color(153, 153, 153));
        jbusecotc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jbusecotc.setText("TRIVANDRUM-CHENNAI");
        jbusecotc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbusecotcActionPerformed(evt);
            }
        });
        getContentPane().add(jbusecotc);
        jbusecotc.setBounds(70, 330, 450, 50);

        jbuseco.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1717084224212.jpg")); // NOI18N
        jbuseco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbusecoActionPerformed(evt);
            }
        });
        getContentPane().add(jbuseco);
        jbuseco.setBounds(510, 20, 50, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1716963249913.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbusecotbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbusecotbActionPerformed
        // TODO add your handling code here:
        new BuseEcoTtoB().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbusecotbActionPerformed

    private void jbusecottActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbusecottActionPerformed
        // TODO add your handling code here:
        new buseECOTtot().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbusecottActionPerformed

    private void jbusecotcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbusecotcActionPerformed
        // TODO add your handling code here:
        new busECOTtoC().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jbusecotcActionPerformed

    private void jbusecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbusecoActionPerformed
        // TODO add your handling code here:
        new packagesbus().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbusecoActionPerformed

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
            java.util.logging.Logger.getLogger(destinationbus3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(destinationbus3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(destinationbus3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(destinationbus3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new destinationbus3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbuseco;
    private javax.swing.JButton jbusecotb;
    private javax.swing.JButton jbusecotc;
    private javax.swing.JButton jbusecott;
    // End of variables declaration//GEN-END:variables
}
