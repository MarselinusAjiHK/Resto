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
public  class Makanan extends Barang {
    private String jenisMakanan;
    private String kodeMakanan;
   
    public Makanan(String nama, double harga,String jenisMakanan,String kodeMakanan) {
        super(nama,harga);
        this.jenisMakanan=jenisMakanan;
        this.kodeMakanan=kodeMakanan;
    }
    
    public String getjenisMakanan() {
        return jenisMakanan;
    }
    
    public void setjenisMakanan(String jenisMakanan) {
       this.jenisMakanan=jenisMakanan;
    }
    
    public String getkodeMakanan() {
        return kodeMakanan;
    }
    
    public void setkodeMakanan(String kodeMakanan) {
       this.kodeMakanan=kodeMakanan;
    }
    
    @Override
    public String showData() {
        return getNama() +"||"+getkodeMakanan()+"||"+getjenisMakanan()+"||"+getHarga();
    }
}
