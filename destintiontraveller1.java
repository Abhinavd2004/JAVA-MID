/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abhin
 */
public class destintiontraveller1 extends javax.swing.JFrame {

    /**
     * Creates new form destintiontraveller1
     */
    public destintiontraveller1() {
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
        jgoldtravellertb = new javax.swing.JButton();
        jgoldtravellertt = new javax.swing.JButton();
        jgoldtravellertc = new javax.swing.JButton();
        jgoldtraveller = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 420));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CHOOSE DESTINATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 70, 354, 40);

        jgoldtravellertb.setBackground(new java.awt.Color(153, 153, 153));
        jgoldtravellertb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jgoldtravellertb.setText("TRIVANDRUM-BENGALURU");
        jgoldtravellertb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgoldtravellertbActionPerformed(evt);
            }
        });
        getContentPane().add(jgoldtravellertb);
        jgoldtravellertb.setBounds(60, 170, 490, 60);

        jgoldtravellertt.setBackground(new java.awt.Color(153, 153, 153));
        jgoldtravellertt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jgoldtravellertt.setText("TRIVANDRUM-TIRUPATI");
        jgoldtravellertt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgoldtravellerttActionPerformed(evt);
            }
        });
        getContentPane().add(jgoldtravellertt);
        jgoldtravellertt.setBounds(60, 250, 490, 60);

        jgoldtravellertc.setBackground(new java.awt.Color(153, 153, 153));
        jgoldtravellertc.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jgoldtravellertc.setText("TRIVANDRUM-CHENNAI");
        jgoldtravellertc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgoldtravellertcActionPerformed(evt);
            }
        });
        getContentPane().add(jgoldtravellertc);
        jgoldtravellertc.setBounds(60, 330, 490, 60);

        jgoldtraveller.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1717084224212.jpg")); // NOI18N
        jgoldtraveller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jgoldtravellerActionPerformed(evt);
            }
        });
        getContentPane().add(jgoldtraveller);
        jgoldtraveller.setBounds(520, 10, 50, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1716963249913.png")); // NOI18N
        jLabel2.setName(""); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jgoldtravellertbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgoldtravellertbActionPerformed
        // TODO add your handling code here:
        new TravellergoldTtoB().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jgoldtravellertbActionPerformed

    private void jgoldtravellerttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgoldtravellerttActionPerformed
        // TODO add your handling code here:
        new TravellergoldTtoT().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jgoldtravellerttActionPerformed

    private void jgoldtravellertcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgoldtravellertcActionPerformed
        // TODO add your handling code here:
        new TravellergoldTtoC().setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jgoldtravellertcActionPerformed

    private void jgoldtravellerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jgoldtravellerActionPerformed
        // TODO add your handling code here:
        new packagestraveller().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jgoldtravellerActionPerformed

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
            java.util.logging.Logger.getLogger(destintiontraveller1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(destintiontraveller1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(destintiontraveller1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(destintiontraveller1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new destintiontraveller1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jgoldtraveller;
    private javax.swing.JButton jgoldtravellertb;
    private javax.swing.JButton jgoldtravellertc;
    private javax.swing.JButton jgoldtravellertt;
    // End of variables declaration//GEN-END:variables
}
