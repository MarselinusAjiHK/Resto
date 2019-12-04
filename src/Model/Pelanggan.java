/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author hp
 */
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Pelanggan{
    private String namaPelanggan;
    private String tanggal;
    private double totalPembelian;
    private int jumlahMenu;
    
    public Pelanggan(String namaPelanggan,String tanggal,double totalPembelian,int jumlahMenu) {
        
        this.jumlahMenu=jumlahMenu;
        this.namaPelanggan=namaPelanggan;
        this.tanggal=tanggal;
        this.totalPembelian=totalPembelian;
    }
    
    public String getnamaPelanggan() {
        return namaPelanggan;
    }
    
    public void setnamaPelanggan(String namaPelanggan) {
       this.namaPelanggan=namaPelanggan;
    }
    
    public String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
    
    public void setTanggal(String tanggal) {
       this.tanggal=tanggal;
    }
    
     public double getTotalPembelian() {
        return totalPembelian;
    }
    
    public void setTotalPembelian(double totalPembelian) {
       this.totalPembelian=totalPembelian;
    }
    
    public int getJumlahMenu() {
        return jumlahMenu;
    }
    
    public void setJumlahMenu(int jumlahMenu) {
        this.jumlahMenu=jumlahMenu;
    }
    
    public String showPelanggan() {
        return getnamaPelanggan()+"||"+getTanggal()+"||"+getTotalPembelian()+"||"+getJumlahMenu();
    }




    
}
