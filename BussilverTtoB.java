/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abhin
 */
public class BussilverTtoB extends javax.swing.JFrame {

    /**
     * Creates new form BussilverTtoB
     */
    public BussilverTtoB() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jbusstb = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 420));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("TRIVANDRUM-BENGALURU");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 0, 493, 48);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(49, 189, 37, 0);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel3.setText("ASHOK LEYLAND VIKING (SEMI-SLEEPER)");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(110, 40, 473, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setText("35-40 SEATER");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 330, 159, 27);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setText("KL 33 QW 3444");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 360, 184, 32);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("MORE DETAILS");
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 340, 170, 30);

        jbusstb.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1717084224212.jpg")); // NOI18N
        jbusstb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbusstbActionPerformed(evt);
            }
        });
        getContentPane().add(jbusstb);
        jbusstb.setBounds(20, 90, 50, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1715876990909.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbusstbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbusstbActionPerformed
        // TODO add your handling code here:
        new destinationbus2().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbusstbActionPerformed

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
            java.util.logging.Logger.getLogger(BussilverTtoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BussilverTtoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BussilverTtoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BussilverTtoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BussilverTtoB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbusstb;
    // End of variables declaration//GEN-END:variables
}
