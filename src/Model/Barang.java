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
public abstract  class Barang {
    protected String nama;
    protected double harga;
    
    public Barang(String nama, double harga) {
        this.nama=nama;
        this.harga=harga;
    }
            
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama=nama;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setHarga(double harga){
        this.harga=harga;
    }
    public abstract String showData();
    
}
