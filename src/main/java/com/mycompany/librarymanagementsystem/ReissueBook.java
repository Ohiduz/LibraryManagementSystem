/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ReissueBook extends javax.swing.JFrame {
    String studId;

    public ReissueBook() {
        initComponents();
        fillTable();
    }
    public ReissueBook(String studId) {
        this.studId = studId;
        initComponents();
        fillTable();
    }
    private void fillTable(){
        DefaultTableModel model;
        try{
            Connection con = DBConnection.getConnection();
            model = (DefaultTableModel) tbl_booksWS.getModel();
            String sq = "select books.bookId, bookName from books, issueBooks where "
                    + "books.bookId = issueBooks.bookId and studentId = ? and Status = ?";
            PreparedStatement pst = con.prepareStatement(sq);
            pst.setString(1, studId);
            pst.setString(2, "Not returned");
            ResultSet theBs = pst.executeQuery();
            while(theBs.next()){
                Object[] obj = {theBs.getString("bookId"), theBs.getString("bookName")};
                model.addRow(obj);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_bookId = new javax.swing.JTextField();
        btn_request = new javax.swing.JButton();
        btn_returnHome = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_d = new javax.swing.JTextField();
        txt_m = new javax.swing.JTextField();
        txt_y = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_booksWS = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Enter Book Id to reissue: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, -1, -1));

        txt_bookId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_bookId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bookIdActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bookId, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 190, -1));

        btn_request.setBackground(new java.awt.Color(0, 102, 102));
        btn_request.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_request.setForeground(new java.awt.Color(255, 255, 255));
        btn_request.setText("Request");
        btn_request.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_requestMouseClicked(evt);
            }
        });
        btn_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_requestActionPerformed(evt);
            }
        });
        jPanel2.add(btn_request, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

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

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("I need the book till:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txt_d.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_d.setText("DD");
        txt_d.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dActionPerformed(evt);
            }
        });
        jPanel2.add(txt_d, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 60, -1));

        txt_m.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_m.setText("MM");
        txt_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_mActionPerformed(evt);
            }
        });
        jPanel2.add(txt_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 60, -1));

        txt_y.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_y.setText("YYYY");
        txt_y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_yActionPerformed(evt);
            }
        });
        jPanel2.add(txt_y, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 110, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 710, 280));

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
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        tbl_booksWS.setBackground(new java.awt.Color(240, 245, 245));
        tbl_booksWS.setBorder(new javax.swing.border.MatteBorder(null));
        tbl_booksWS.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tbl_booksWS.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_booksWS.setRowHeight(24);
        jScrollPane2.setViewportView(tbl_booksWS);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 750, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_bookIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bookIdActionPerformed
        
    }//GEN-LAST:event_txt_bookIdActionPerformed

    private void btn_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_requestActionPerformed
        
    }//GEN-LAST:event_btn_requestActionPerformed

    private void btn_returnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnHomeActionPerformed
        
    }//GEN-LAST:event_btn_returnHomeActionPerformed

    private void txt_dActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dActionPerformed
        
    }//GEN-LAST:event_txt_dActionPerformed

    private void txt_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_mActionPerformed
        
    }//GEN-LAST:event_txt_mActionPerformed

    private void txt_yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_yActionPerformed
        
    }//GEN-LAST:event_txt_yActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
    }//GEN-LAST:event_btn_backActionPerformed

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
    private void reissueBook(){
        String bookId = txt_bookId.getText();
        String d = txt_d.getText();
        String m = txt_m.getText();
        String y = txt_y.getText();
        if(bookId.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter book id!");
            return;
        }
        if(d.equals("") || m.equals("") || y.equals("")
                || d.equals("DD") || m.equals("MM") || y.equals("YYYY")){
            JOptionPane.showMessageDialog(this, "Please enter date!");
            return;
        }
        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date d1 = sdformat.parse(y+"-"+m+"-"+d);
            long diff = d1.getTime() - System.currentTimeMillis();
            diff /= 1000;
            diff /= 3600;
            diff /= 24;
            if(diff<0){
                JOptionPane.showMessageDialog(this, "You entered a past date. Please enter valid date!");
                return;
            }
            if(diff>15){
                JOptionPane.showMessageDialog(this, "You cannot borrow for more than 15 days!");
                return;
            }
            else{
                Connection con = DBConnection.getConnection();
                String sq = "select * from issueBooks where studentId = ? and bookId = ? and Status = ?";
                PreparedStatement pss = con.prepareStatement(sq);
                pss.setString(1, studId);
                pss.setString(2, bookId);
                pss.setString(3, "Not returned");
                ResultSet theIss = pss.executeQuery();
                if(theIss.next()){
                    String iId = theIss.getString("issueId");
                    String squp = "update issueBooks set todt = ? where issueId = ?;";
                    PreparedStatement up = con.prepareStatement(squp);
                    java.sql.Date newD = new java.sql.Date(d1.getTime());
                    up.setDate(1, newD);
                    up.setString(2, iId);
                    int upib = up.executeUpdate();
                    if(upib>0){
                        JOptionPane.showMessageDialog(this, "Book has been reissued to you "
                                + "from "+(new Date(System.currentTimeMillis())) + " to "+d1);
                        
                        return;
                    }
                    else{
                        JOptionPane.showMessageDialog(this, "Book could not be reissued!");
                        return;
                    }
                }
                else{
                    JOptionPane.showMessageDialog(this, "You haven't borrowed this book!");
                    return;
                }
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    private void btn_requestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_requestMouseClicked
        
        reissueBook();
    }//GEN-LAST:event_btn_requestMouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReissueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_request;
    private javax.swing.JButton btn_returnHome;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_booksWS;
    private javax.swing.JTextField txt_bookId;
    private javax.swing.JTextField txt_d;
    private javax.swing.JTextField txt_m;
    private javax.swing.JTextField txt_y;
    // End of variables declaration//GEN-END:variables
}
