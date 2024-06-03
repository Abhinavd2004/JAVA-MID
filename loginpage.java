/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 
 * @author abhin
 */
import javax.swing.JOptionPane;
import java.sql.*;
interface credit  {
    void checkCredit();

}
public class loginpage extends javax.swing.JFrame implements credit {
     private String Username;
    private String Password;
    public void setUser(String u){
        Username=u;
    }
    public void setPas(String p){
        Password=p;
    }
    public String getUser(){return Username;}
    public String getPas(){return Password;}
    public void checkCredit(){
        if(jtuser.getText().equals("")){
            JOptionPane.showMessageDialog(null,"please fill out username");
        }
        else if(jpassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please fill out password");
        }
        else if(jtuser.getText().contains(getUser()) && jpassword.getText().contains(getPas())){
            JOptionPane.showMessageDialog(null,"Login Successful");
            new fleatoptions().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null,"Wrong username or password!  Retry again!","Message",JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Creates new form loginpage
     */
    public loginpage() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtuser = new javax.swing.JTextField();
        bexit = new javax.swing.JButton();
        blogin = new javax.swing.JButton();
        jpassword = new javax.swing.JPasswordField();
        jcshow_password = new javax.swing.JCheckBox();
        jlogout = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 420));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("LOGIN ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 0, 130, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("USERNAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 120, 130, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PASSWORD");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 150, 130, 20);

        jtuser.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtuserActionPerformed(evt);
            }
        });
        getContentPane().add(jtuser);
        jtuser.setBounds(240, 120, 220, 21);

        bexit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bexit.setText("EXIT");
        bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexitActionPerformed(evt);
            }
        });
        getContentPane().add(bexit);
        bexit.setBounds(130, 230, 72, 32);

        blogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        blogin.setText("LOGIN");
        blogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloginActionPerformed(evt);
            }
        });
        getContentPane().add(blogin);
        blogin.setBounds(370, 230, 86, 32);

        jpassword.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jpassword);
        jpassword.setBounds(240, 150, 220, 21);

        jcshow_password.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jcshow_password.setText("SHOW PASSWORD");
        jcshow_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcshow_passwordActionPerformed(evt);
            }
        });
        getContentPane().add(jcshow_password);
        jcshow_password.setBounds(300, 180, 163, 22);

        jlogout.setBackground(new java.awt.Color(255, 255, 204));
        jlogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jlogout.setText("RESET");
        jlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jlogout);
        jlogout.setBounds(140, 180, 70, 20);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\abhin\\Downloads\\imresizer-1716842037061.jpg")); // NOI18N
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel4.setMaximumSize(new java.awt.Dimension(620, 420));
        jLabel4.setMinimumSize(new java.awt.Dimension(620, 420));
        jLabel4.setPreferredSize(new java.awt.Dimension(620, 420));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloginActionPerformed
        String query = ("select *  from login");
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fleat_management", "root", "abhinav2004@");
             PreparedStatement pstmt = con.prepareStatement(query))
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ResultSet rs=pstmt.executeQuery();
            while (rs.next()){
                setUser(rs.getString(1));
                setPas(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


       checkCredit();
    }//GEN-LAST:event_bloginActionPerformed

    private void jpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpasswordActionPerformed

    private void jcshow_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcshow_passwordActionPerformed
        // TODO add your handling code here:
        if(jcshow_password.isSelected())
        {
            jpassword.setEchoChar((char)0);
        }
        else {
            jpassword.setEchoChar('*');
        }
    }//GEN-LAST:event_jcshow_passwordActionPerformed

    private void bexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bexitActionPerformed

    private void jlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlogoutActionPerformed
        // TODO add your handling code here:
        new loginpage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jlogoutActionPerformed

    private void jtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtuserActionPerformed

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
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginpage().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bexit;
    private javax.swing.JButton blogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JCheckBox jcshow_password;
    private javax.swing.JButton jlogout;
    private javax.swing.JPasswordField jpassword;
    private javax.swing.JTextField jtuser;
    // End of variables declaration//GEN-END:variables
}
