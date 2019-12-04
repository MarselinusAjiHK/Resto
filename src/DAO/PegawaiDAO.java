/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Pegawai;
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
public class PegawaiDAO {
    
    public static Connection CON;
    public static final String url = "jdbc:ucanaccess://";
    public static final String path ="D:\\Database1.mdb";
    private double total;
    
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
     
      public void insertPegawai(Pegawai P) {
        String sql = "insert into Pegawai(Kode,Nama,Jabatan,Jam_Lembur,Total_Gaji) "
                + "values(' "+ P.getkodePegawai()+" ', ' " +P.getnamaPegawai()+" ',  ' " +P.getJabatan()+
                " ', " + P.getJamLembur()+","+P.getTotalGaji()+" )";
        System.out.println("Adding Pegawai");
        
        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "Pegawai\n");
            statement.close();
        }catch (Exception e) {
            System.out.println("Error Adding a Pegawai");
            System.out.println(e);
        }
    }
      
     public List<Pegawai> ShowPegawai() {
        String sql = "select * from Pegawai";
        System.out.println("Daftar Pegawai...");
        
        List<Pegawai> list = new ArrayList<>();
        
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
             if(rs != null) {
                 while(rs.next()) {
                     
                     Pegawai P = new Pegawai(rs.getString("Nama"), rs.getString("Kode"),
                      rs.getString("Jabatan"),Integer.parseInt(rs.getString("Jam_Lembur")));
                     total=Double.parseDouble(rs.getString("Total_Gaji"));
                   
                     
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
     
    
        public Pegawai searchPegawai(String kodePegawai) {
        String sql = "SELECT * FROM Pegawai where Kode=' "+kodePegawai+" ' ";
        System.out.println("Searching Makanan.....");
        
        Pegawai Peg = null;
        try {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
             if(rs != null) {
            while(rs.next()) {
                     Peg = new Pegawai(rs.getString("Nama"), rs.getString("Kode"),
                      rs.getString("Jabatan"),Integer.parseInt(rs.getString("Jam_Lembur")));
                    
                 }
             }
             rs.close();
             statement.close();
            
        }
        catch(Exception Ex) {
            System.out.println("Error reading database information ");
            System.out.println(Ex);
        }
        return Peg;
    }
        
    
    public void editPegawai(Pegawai pegawai,String kodePegawai) {
        String sql = "UPDATE Pegawai SET Kode =' "
                +pegawai.getkodePegawai()+" ', Nama = '"
                +pegawai.getnamaPegawai()+" ', Jabatan =' " +pegawai.getJabatan()+" ', Jam_Lembur= " 
                + pegawai.getJamLembur()+" where Kode=' " +kodePegawai+" ' ";
                
        System.out.println("Editing Pegawai...");
                
                try {
                    Statement statement = CON.createStatement();
                   int result = statement.executeUpdate(sql);
                    System.out.println("Edit " +result+" Pegawai\n"+kodePegawai);
                    statement.close();
                    
                }
                catch(Exception Ex) {
                    System.out.println("Error edit a Pegawai....");
                    System.out.println(Ex);
                    
                }
                 
                
    }
    
    public void deletePegawai(String kodePegawai) {
       String sql = "DELETE FROM Pegawai WHERE Kode= ' " +kodePegawai+" ' ";
       System.out.println("Delete Pegawai ");
       try {
           Statement statement= CON.createStatement();
           int result = statement.executeUpdate(sql);
           System.out.println("Delete "+result+"Pegawai \n");
           statement.close();
       }
       
       catch(Exception Ex) {
            System.out.println("Error deleting a Makanan ");
            System.out.println(Ex);
        }

   }
    
    
    
    
    
}
