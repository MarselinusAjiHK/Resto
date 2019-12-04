/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Makanan;
import Model.Minuman;
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
public class BarangDAO {
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
    
      public void insertMakanan(Makanan M) {
        String sql = "insert into Makanan(Nama,Jenis,Harga,Kode_Makanan) "
                + "values(' "+ M.getNama()+" ', ' " +M.getjenisMakanan()+" ', " +M.getHarga()+
                ", ' " + M.getkodeMakanan()+" ')";
        System.out.println("Adding Makanan");
        
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "Makanan\n");
            statement.close();
        }catch (Exception e) {
            System.out.println("Error Adding a Makanan");
            System.out.println(e);
        }
    }
    
    public List<Makanan> ShowMakanan() {
        String sql = "select * from Makanan";
        System.out.println("Daftar Makanan...");
        
        List<Makanan> list = new ArrayList<>();
        
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
             if(rs != null) {
                 while(rs.next()) {
                     Makanan M = new Makanan(rs.getString("Nama"), Double.parseDouble(rs.getString("Harga")),
                      rs.getString("Jenis"),rs.getString("Kode_Makanan"));
                   
                     
                     list.add(M);
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
    
    public Makanan searchMakanan(String kodeMakanan) {
        String sql = "SELECT * FROM Makanan where Kode_Makanan=' "+kodeMakanan+" ' ";
        System.out.println("Searching Makanan.....");
        
        Makanan mak = null;
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
             if(rs != null) {
            while(rs.next()) {
                     mak = new Makanan(rs.getString("Nama"),Double.parseDouble(rs.getString("Harga")),
                      rs.getString("Jenis"),rs.getString("Kode_Makanan"));
                    
                 }
             }
             rs.close();
             statement.close();
            
        }
        catch(Exception Ex) {
            System.out.println("Error reading database information ");
            System.out.println(Ex);
        }
        return mak;
    }
    
    public void editMakanan(Makanan makanan,String kodeMakanan) {
        String sql = "UPDATE Makanan SET Nama = '"
                + makanan.getNama()+" ', Jenis= '" 
                + makanan.getjenisMakanan()+" ', Harga = " +makanan.getHarga()+""
                + ",Kode_Makanan =' "+makanan.getkodeMakanan()+" ' where Kode_Makanan=' " +kodeMakanan+" ' ";
                System.out.println("Editing Makanan...");
                
                try {
                    Statement statement = CON.createStatement();
                   int result = statement.executeUpdate(sql);
                    System.out.println("Edit " +result+" Makanan\n"+kodeMakanan);
                    statement.close();
                    
                }
                catch(Exception Ex) {
                    System.out.println("Error edit a Makanan....");
                    System.out.println(Ex);
                    
                }
                 
                
    }
    
   public void deleteMakanan(String kodeMakanan) {
       String sql = "DELETE FROM Makanan WHERE Kode_Makanan= ' " +kodeMakanan+" ' ";
       System.out.println("Delete Makanan ");
       try {
           Statement statement= CON.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Delete "+result+"Makanan \n");
           statement.close();
       }
       
       catch(Exception Ex) {
            System.out.println("Error deleting a Makanan ");
            System.out.println(Ex);
        }

   }
   
    ////////////////////////Minuman////////////////////////////
   
  
    
      public void insertMinuman(Minuman M) {
        String sql = "insert into Minuman(Nama,Jenis,Harga,Kode_Minuman) "
                + "values(' "+ M.getNama()+" ', ' " +M.getjenisMinuman()+" ', " +M.getHarga()+
                ", ' " + M.getkodeMinuman()+" ')";
        System.out.println("Adding Minuman");
        
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "Minuman\n");
            statement.close();
        }catch (Exception e) {
            System.out.println("Error Adding a Minuman");
            System.out.println(e);
        }
    }
    
    public List<Minuman> ShowMinuman() {
        String sql = "select * from Minuman";
        System.out.println("Daftar Makanan...");
        
        List<Minuman> list = new ArrayList<>();
        
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
             if(rs != null) {
                 while(rs.next()) {
                     Minuman M = new Minuman(rs.getString("Nama"), Double.parseDouble(rs.getString("Harga")),
                      rs.getString("Jenis"),rs.getString("Kode_Minuman"));
                   
                     
                     list.add(M);
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
    
    public Minuman searchMinuman(String kodeMinuman) {
        String sql = "SELECT * FROM Minuman where Kode_Minuman =' "+kodeMinuman+" ' ";
        System.out.println("Searching Minuman.....");
        
        Minuman min = null;
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
             if(rs != null) {
            while(rs.next()) {
                     min = new Minuman(rs.getString("Nama"), Double.parseDouble(rs.getString("Harga")),
                      rs.getString("Jenis"),rs.getString("Kode_Minuman"));
                    
                 }
             }
             rs.close();
             statement.close();
            
        }
        catch(Exception Ex) {
            System.out.println("Error reading database information ");
            System.out.println(Ex);
        }
        return min;
    }
    
    public void editMinuman(Minuman minuman,String kodeMinuman) {
      String sql = "UPDATE Minuman SET Nama = '"
                + minuman.getNama()+" ', Jenis= '" 
                + minuman.getjenisMinuman()+" ', Harga = " +minuman.getHarga()+""
                + ",Kode_Minuman =' "+minuman.getkodeMinuman()+" ' where Kode_Minuman=' " +kodeMinuman+" ' ";
                
                try {
                    Statement statement = CON.createStatement();
                   int result = statement.executeUpdate(sql);
                    System.out.println("Edit " +result+" Minuman\n"+kodeMinuman);
                    statement.close();
                    
                }
                catch(Exception Ex) {
                    System.out.println("Error edit a Minuman....");
                    System.out.println(Ex);
                    
                }
                 
                
    }
    
   public void deleteMinuman(String kodeMinuman) {
       String sql = "DELETE FROM Minuman WHERE Kode_Minuman= ' " +kodeMinuman+" ' ";
       System.out.println("Delete Minuman ");
       try {
           Statement statement= CON.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Delete "+result+"Minuman \n");
           statement.close();
       }
       
       catch(Exception Ex) {
            System.out.println("Error deleting a Makanan ");
            System.out.println(Ex);
        }

   }
   
  
}

