/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Pelanggan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */
public class PelangganDAO {
    
    public static Connection CON;
    public static final String url = "jdbc:ucanaccess://";
    public static final String path ="D:\\Database1.mdb";
    
     public void makeConnection() {
        System.out.println("Opening Database...");
        
        try {
            CON = DriverManager.getConnection(url + path);
            System.out.println("Succes...");
        } catch(Exception e) {
            System.out.println("Error opening database..");
            System.out.println(e);
        }
    }
     
     
    public void closeConnection(){
        System.out.println("Closing database...");
        
        try {
          CON.close();
            System.out.println("Success ....\n");
        }catch(Exception e){
            System.out.println("Error closing the database");
            System.out.println(e);
        }
    }
    
    
     public void insertPelanggan(Pelanggan P) {
        String sql = "insert into Pelanggan(Nama,Tanggal,Total_Pembelian,Jumlah_Menu) "
                + "values(' "+ P.getnamaPelanggan()+" ', ' " +P.getTanggal()+" ', " +P.getTotalPembelian()+
                ",  " + P.getJumlahMenu()+" )";
        System.out.println("Adding Pelanggan");
        
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "Pelanggan\n");
            statement.close();
        }catch (Exception e) {
            System.out.println("Error Adding a Pelanggan");
            System.out.println(e);
        }
    }
     
    public List<Pelanggan> ShowPelanggan() {
        String sql = "select * from Pelanggan";
        System.out.println("Daftar Pelanggan...");
        
        List<Pelanggan> list = new ArrayList<>();
        
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
             if(rs != null) {
                 while(rs.next()) {
                     Pelanggan P = new Pelanggan(rs.getString("Nama"),rs.getString("Tanggal"), Double.parseDouble(rs.getString("Total_Pembelian")),
                     Integer.parseInt(rs.getString("Jumlah_Menu")));
                   
                     
                     list.add(P);
                 }
             }
             rs.close();
             statement.close();
        }  
        
       catch(Exception e) {
           System.out.println("Error reading database information..\n");
           System.out.println(e);
       }
        
        return list;
    }
    
    
    
    
    public Pelanggan  searchPelanggan(String namaPelanggan) {
        String sql = "SELECT * FROM Pelanggan where Nama=' "+namaPelanggan+" ' ";
        System.out.println("Searching Pelanggan.....");
        
        Pelanggan pel = null;
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
             if(rs != null) {
            while(rs.next()) {
                     pel = new Pelanggan(rs.getString("Nama"),rs.getString("Tanggal"), Double.parseDouble(rs.getString("Total_Pembelian")),
                     Integer.parseInt(rs.getString("Jumlah_Menu")));
                    
                 }
             }
             rs.close();
             statement.close();
            
        }
        catch(Exception Ex) {
            System.out.println("Error reading database information ");
            System.out.println(Ex);
        }
        return pel;
    }
    
   
                 
                
    }
    

