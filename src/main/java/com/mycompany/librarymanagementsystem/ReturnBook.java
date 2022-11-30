/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class ReturnBook extends javax.swing.JFrame {
    String studId;

    public ReturnBook() {
        initComponents();
        fillTable();
    }
    public ReturnBook(String studId) {
        this.studId = studId;
        initComponents();
        fillTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_btr = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_rbid = new javax.swing.JTextField();
        btn_return = new javax.swing.JButton();
        btn_returnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(0, 102, 102));
        btn_back.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setText("<<Back");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tbl_btr.setBackground(new java.awt.Color(240, 245, 245));
        tbl_btr.setBorder(new javax.swing.border.MatteBorder(null));
        tbl_btr.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tbl_btr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_btr.setRowHeight(24);
        jScrollPane1.setViewportView(tbl_btr);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 710, 300));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Books with you:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 730, 350));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Enter Book Id to return: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txt_rbid.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_rbid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rbidActionPerformed(evt);
            }
        });
        jPanel2.add(txt_rbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 190, -1));

        btn_return.setBackground(new java.awt.Color(0, 102, 102));
        btn_return.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_return.setForeground(new java.awt.Color(255, 255, 255));
        btn_return.setText("Return");
        btn_return.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_returnMouseClicked(evt);
            }
        });
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });
        jPanel2.add(btn_return, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        btn_returnHome.setBackground(new java.awt.Color(0, 102, 102));
        btn_returnHome.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        btn_returnHome.setForeground(new java.awt.Color(255, 255, 255));
        btn_returnHome.setText("Return to homepage");
        btn_returnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_returnHomeMouseClicked(evt);
            }
        });
        btn_returnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_returnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 710, 280));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void fillTable(){
        DefaultTableModel model = (DefaultTableModel) tbl_btr.getModel();
        try{
            Connection con = DBConnection.getConnection();
            String sqg = "select issueBooks.bookId, bookName from issueBooks, books where issueBooks.Status = ? "
                    + "and issueBooks.studentId = ? "
                    + "and issueBooks.bookId = books.bookId group by bookId;";
            PreparedStatement ps = con.prepareStatement(sqg);
            ps.setString(1, "Not returned");
            ps.setString(2, studId);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Object[] obj = {rs.getString("bookId"), rs.getString("bookName")};
                model.addRow(obj);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_rbidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rbidActionPerformed
        
    }//GEN-LAST:event_txt_rbidActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
        
    }//GEN-LAST:event_btn_returnActionPerformed

    private void btn_returnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnHomeActionPerformed
        
    }//GEN-LAST:event_btn_returnHomeActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        
        StudentHomepage sh = new StudentHomepage(studId);
        sh.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_returnHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnHomeMouseClicked
        
        StudentHomepage sh = new StudentHomepage(studId);
        sh.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_returnHomeMouseClicked

    private void btn_returnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnMouseClicked
        
        String rbid = txt_rbid.getText();
        ReturnBookThread rbt = new ReturnBookThread(studId, rbid, this);
        rbt.t.start();
    }//GEN-LAST:event_btn_returnMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_returnHome;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_btr;
    private javax.swing.JTextField txt_rbid;
    // End of variables declaration//GEN-END:variables
}
