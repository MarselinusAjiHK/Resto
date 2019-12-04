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
public class Minuman extends Barang {
    private String jenisMinuman;
    private String kodeMinuman;
   
    public Minuman(String nama, double harga,String jenisMinuman,String kodeMinuman) {
        super(nama,harga);
        this.jenisMinuman=jenisMinuman;
        this.kodeMinuman=kodeMinuman;
    }
    
    public String getjenisMinuman() {
        return jenisMinuman;
    }
    
    public void setjenisMinuman(String jenisMinuman) {
       this.jenisMinuman=jenisMinuman;
    }
    
    public String getkodeMinuman() {
        return kodeMinuman;
    }
    
    public void setkodeMinuman(String kodeMinuman) {
       this.kodeMinuman=kodeMinuman;
    }
    
    @Override
    public String showData() {
        return getNama() +"||"+getkodeMinuman()+"||"+getjenisMinuman()+"||"+getHarga();
    }
    
}
