/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author abhin
 */
public class TravellergoldTtoT extends javax.swing.JFrame {

    /**
     * Creates new form TravellergoldTtoT
     */
    public TravellergoldTtoT() {
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

        jTextField1 = new javax.swing.JTextField();
        jcargtb = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jtravellergtt = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jcargtb.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1717084224212.jpg")); // NOI18N
        jcargtb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcargtbActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 420));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("TRIVANDRUM-TIRUPATI");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 0, 440, 48);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("FORCE URBANIA");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 70, 210, 32);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("20 SEATER");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(460, 350, 121, 32);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("KL 99 OP 4567");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 110, 166, 32);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("MORE DETAILS");
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 350, 180, 40);

        jtravellergtt.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1717084224212.jpg")); // NOI18N
        jtravellergtt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtravellergttActionPerformed(evt);
            }
        });
        getContentPane().add(jtravellergtt);
        jtravellergtt.setBounds(540, 70, 50, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1716833857170.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 600, 400);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1716833857170.jpg")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcargtbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcargtbActionPerformed
        // TODO add your handling code here:
        new destination().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jcargtbActionPerformed

    private void jtravellergttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtravellergttActionPerformed
        // TODO add your handling code here:
        new destintiontraveller1().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jtravellergttActionPerformed

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
            java.util.logging.Logger.getLogger(TravellergoldTtoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravellergoldTtoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravellergoldTtoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravellergoldTtoT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravellergoldTtoT().setVisible(true);
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jcargtb;
    private javax.swing.JButton jtravellergtt;
    // End of variables declaration//GEN-END:variables
}
