/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

/**
 *
 * @author ohidu
 */
public class StudentHomepage extends javax.swing.JFrame {

    /**
     * Creates new form StudentHomepage
     */
    public StudentHomepage() {
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
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_logout = new javax.swing.JButton();
        btn_reqReissue = new javax.swing.JButton();
        btn_returnBook = new javax.swing.JButton();
        btn_reqIssue = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 102));
        jLabel1.setText("Welcome Jack!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 320, 85));

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Your dues:");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("0.00");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 90, 130, -1));

        jButton6.setBackground(new java.awt.Color(0, 102, 102));
        jButton6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Books with you:");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("2");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 735, 131));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_logout.setBackground(new java.awt.Color(0, 102, 102));
        btn_logout.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Logout");
        btn_logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_logoutMouseClicked(evt);
            }
        });
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        jPanel2.add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        btn_reqReissue.setBackground(new java.awt.Color(0, 102, 102));
        btn_reqReissue.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_reqReissue.setForeground(new java.awt.Color(255, 255, 255));
        btn_reqReissue.setText("Request for reissuing a book");
        btn_reqReissue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reqReissueMouseClicked(evt);
            }
        });
        btn_reqReissue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reqReissueActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reqReissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 230, 500, 74));

        btn_returnBook.setBackground(new java.awt.Color(0, 102, 102));
        btn_returnBook.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_returnBook.setForeground(new java.awt.Color(255, 255, 255));
        btn_returnBook.setText("Return a book");
        btn_returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_returnBookMouseClicked(evt);
            }
        });
        btn_returnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnBookActionPerformed(evt);
            }
        });
        jPanel2.add(btn_returnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 150, 500, 74));

        btn_reqIssue.setBackground(new java.awt.Color(0, 102, 102));
        btn_reqIssue.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        btn_reqIssue.setForeground(new java.awt.Color(255, 255, 255));
        btn_reqIssue.setText("Request for issuing a book");
        btn_reqIssue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_reqIssueMouseClicked(evt);
            }
        });
        btn_reqIssue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reqIssueActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reqIssue, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 70, 500, 74));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 149, 735, 515));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_reqReissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reqReissueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reqReissueActionPerformed

    private void btn_returnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_returnBookActionPerformed

    private void btn_reqIssueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reqIssueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reqIssueActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btn_reqIssueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reqIssueMouseClicked
        // TODO add your handling code here:
        RequestIssue ri = new RequestIssue();
        ri.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_reqIssueMouseClicked

    private void btn_returnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnBookMouseClicked
        // TODO add your handling code here:
        ReturnBook rb = new ReturnBook();
        rb.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_returnBookMouseClicked

    private void btn_reqReissueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reqReissueMouseClicked
        // TODO add your handling code here:
        ReissueBook rib = new ReissueBook();
        rib.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_reqReissueMouseClicked

    private void btn_logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_logoutMouseClicked
        // TODO add your handling code here:
        StartPage sp = new StartPage();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_logoutMouseClicked

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
            java.util.logging.Logger.getLogger(StudentHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentHomepage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentHomepage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_reqIssue;
    private javax.swing.JButton btn_reqReissue;
    private javax.swing.JButton btn_returnBook;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
