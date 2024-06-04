/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.latihan.loginpage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class cobaConnector {
    public static void main(String[] args) {
        try{
            // create connection 
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pemrograman1", "root", "");
            
            String username = "otong";
            String password = "123";
            
            java.sql.Statement stm = con.createStatement();
            String sql = "SELECT * FROM tb_akun WHERE username='" + username + "' and password='" + password + "'";
            
            ResultSet result = stm.executeQuery(sql);
            
            if(result.next()){
                // if username and password is true than go to home page
                System.out.println("LOGIN BERHASIL");
            }else{
                // if username and password is wrong
                System.out.println("LOGIN GAGAL!!!!");
            }
            
            con.close();
            
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
