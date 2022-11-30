/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemoveStudent extends javax.swing.JFrame {


    public RemoveStudent() {
        initComponents();
        showStudents();
    }
    
    private void showStudents(){
        DefaultTableModel model;
        try{
            Connection con = DBConnection.getConnection();
            model = (DefaultTableModel) tbl_studs.getModel();
            String sq = "select studentId, studentName from students;";
            PreparedStatement pst = con.prepareStatement(sq);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                Object[] obj = {rs.getString("studentId"), rs.getString("studentName")};
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

        jPanel1 = new javax.swing.JPanel();
        btn_back = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_studId = new javax.swing.JTextField();
        btn_remove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_studs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(200, 200, 200));
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 735, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Enter Student Id to remove: ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        txt_studId.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPanel2.add(txt_studId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 387, -1));

        btn_remove.setBackground(new java.awt.Color(0, 102, 102));
        btn_remove.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btn_remove.setForeground(new java.awt.Color(255, 255, 255));
        btn_remove.setText("Remove");
        btn_remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeMouseClicked(evt);
            }
        });
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel2.add(btn_remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 730, 130));

        tbl_studs.setBackground(new java.awt.Color(240, 245, 245));
        tbl_studs.setBorder(new javax.swing.border.MatteBorder(null));
        tbl_studs.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        tbl_studs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Student Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl_studs.setRowHeight(24);
        jScrollPane1.setViewportView(tbl_studs);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 710, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
        
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        
        AdminHomepage ah = new AdminHomepage();
        ah.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeMouseClicked
        
        removeStudent();
    }//GEN-LAST:event_btn_removeMouseClicked

    private void removeStudent(){
        String studId = txt_studId.getText();
        if(studId.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter student id to remove!");
            return;
        }
        try{
            Connection con = DBConnection.getConnection();
            String sq = "select * from students where studentId = ?;";
            PreparedStatement ps = con.prepareStatement(sq);
            ps.setString(1, studId);
            ResultSet theS = ps.executeQuery();
            if(theS.next()){
                String sqrm = "delete from students where studentId = ?;";
                PreparedStatement rm = con.prepareStatement(sqrm);
                rm.setString(1, studId);
                int delt = rm.executeUpdate();
                if(delt>0){
                    JOptionPane.showMessageDialog(this, "Student removed successfully!");
                    RemoveStudent nf = new RemoveStudent();
                    nf.setVisible(true);
                    dispose();
                    return;
                }
                else{
                    JOptionPane.showMessageDialog(this, "Student could not be removed!");
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "This student doesn't exist!");
                return;
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_remove;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_studs;
    private javax.swing.JTextField txt_studId;
    // End of variables declaration//GEN-END:variables
}
