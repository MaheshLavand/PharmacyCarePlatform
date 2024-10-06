/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class Tables {
    public static void main(String[] args) {
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),name varchar(200),dob varchar(50),mobileNumber varchar(50),email varchar(200),username varchar(200),password varchar(50),address varchar(200))");
            //st.executeUpdate("insert into appuser (userRole,name,dob,mobileNumber,email,username,password,address) values('Admin','Admin','01-01-2001','9322638296','admin@gmail.com','admin','admin','India')");
            //st.executeUpdate("create table medicine(uniqueId int AUTO_INCREMENT primary key,name varchar(200),companyName varchar(200),quantity int,price int,mfgDate varchar(50),expiryDate varchar(50))"); 
            st.executeUpdate("create table bill(bill_pk int AUTO_INCREMENT primary key,billId varchar(200),billDate varchar(50),totalPaid bigint,generatedBy varchar(50))");
            //st.executeUpdate("create table supplier(uniqueId int AUTO_INCREMENT primary key,name varchar(200),companyName varchar(200),mobileNumber varchar(50),email varchar(200) )");
            //st.executeUpdate("create table customer(uniqueId int AUTO_INCREMENT primary key,customerName varchar(200),mobileNumber varchar(50),address varchar(200) )");
            
            JOptionPane.showMessageDialog(null, "Table Created Succsessfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
}
