/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.librarymanagementsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ohidu
 */
public class LibraryManagementSystem {

    public static void main(String[] args) {
        Connection con;
        try{
            con = DBConnection.getConnection();
            String del = "drop table students;";
            PreparedStatement ds = con.prepareStatement(del);
            int c = ds.executeUpdate();
        }
        catch(Exception e){
            System.out.println("");
        }
        try{
            con = DBConnection.getConnection();
            String del = "drop table books;";
            PreparedStatement ds = con.prepareStatement(del);
            int c = ds.executeUpdate();
        }
        catch(Exception e){
            System.out.println("");
        }
        try{
            con = DBConnection.getConnection();
            String del = "drop table issueBooks;"; 
            PreparedStatement ds = con.prepareStatement(del);
            int c = ds.executeUpdate();
        }
        catch(Exception e){
            System.out.println("");
        }
        try{
            con = DBConnection.getConnection();
            String sq = "create table students (studentId varchar(20) not null primary key, "
                    + "studentName varchar(50) not null, "
                    + "email varchar(50) not null, "
                    + "password varchar(50) not null, booksBorrowed int default 0);";
            PreparedStatement pst = con.prepareStatement(sq);
            int tablescount = pst.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            con = DBConnection.getConnection();
            String sq = "create table books (bookId varchar(10) not null primary key, "
                    + "bookName varchar(50) not null, "
                    + "quantity int);";
            PreparedStatement pst = con.prepareStatement(sq);
            int tablescount = pst.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            con = DBConnection.getConnection();
            String sq = "create table issueBooks (issueId int not null auto_increment primary key, "
                    + "studentId varchar(10) not null, "
                    + "bookId varchar(10) not null, "
                    + "from Date, "
                    + "to Date, Status varchar(10);";
            PreparedStatement pst = con.prepareStatement(sq);
            int tablescount = pst.executeUpdate();
        }
        catch(Exception e){
            System.out.println(e);
        }
        StartPage sp = new StartPage();
        sp.setVisible(true);
    }
}
