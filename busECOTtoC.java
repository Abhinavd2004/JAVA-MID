/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abhin
 */
public class busECOTtoC extends javax.swing.JFrame {

    /**
     * Creates new form busECOTtoC
     */
    public busECOTtoC() {
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
        jButton1 = new javax.swing.JButton();
        jbusecotc = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 420));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("TRIVANDRUM-CHENNAI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 0, 470, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("EICHER SKYLINE PRO ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 100, 249, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("25-30 SEATER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 170, 171, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("KL 67 AW 9090");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(420, 360, 171, 32);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("MORE DETAILS");
        getContentPane().add(jButton1);
        jButton1.setBounds(220, 350, 180, 40);

        jbusecotc.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1717084224212.jpg")); // NOI18N
        jbusecotc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbusecotcActionPerformed(evt);
            }
        });
        getContentPane().add(jbusecotc);
        jbusecotc.setBounds(520, 60, 50, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1716836425738.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbusecotcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbusecotcActionPerformed
        // TODO add your handling code here:
        new destinationbus3().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbusecotcActionPerformed

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
            java.util.logging.Logger.getLogger(busECOTtoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(busECOTtoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(busECOTtoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(busECOTtoC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new busECOTtoC().setVisible(true);
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
    private javax.swing.JButton jbusecotc;
    // End of variables declaration//GEN-END:variables
}
