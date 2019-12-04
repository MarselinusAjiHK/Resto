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
public final class Pegawai implements ITotalGaji{
    private String namaPegawai;
    private String kodePegawai;
    private String jabatan;
    private int jamLembur;
   
    
    public Pegawai(String namaPegawai,String kodePegawai,String jabatan,int jamLembur){
        this.jabatan=jabatan;
        this.jamLembur=jamLembur;
        this.kodePegawai=kodePegawai;
        this.namaPegawai=namaPegawai;
      
        
    }
    
    public String getnamaPegawai() {
        return namaPegawai;
    }
    
    public void setnamaPegawai(String namaPegawai) {
       this.namaPegawai=namaPegawai;
    }
    
    public String getkodePegawai() {
        return kodePegawai;
    }
    
    public void setkodePegawai(String kodePegawai) {
       this.kodePegawai=kodePegawai;
    }
    
    public String getJabatan() {
        return jabatan;
    }
    
    public void setJabatan(String jabatan) {
       this.jabatan=jabatan;
    }
    
    public int getJamLembur() {
        return jamLembur;
    }
    
    public void setJamLembur(int jamLembur) {
      this.jamLembur=jamLembur;
    }
    
    public double getTotalGaji() {
        return totalGaji();
    }
    
    @Override
    public double totalGaji()
    {
        if(getJabatan().compareTo("Manager")==0)
        {
            return 10000000+(getJamLembur()*50000);
        }
        else
        if(getJabatan().compareTo("Chef")==0)
        {
            return 8000000+(getJamLembur()*50000);
        }
        else
          if(getJabatan().compareTo("Staff Dapur")==0)
        {
            return 5000000+(getJamLembur()*50000);
        }
        else
         if(getJabatan().compareTo("Pramusaji")==0)
        {
            return 4000000+(getJamLembur()*50000);
        }
        else
        return 0;
         
         
    }
    
    public String showPegawai() {
        return getnamaPegawai()+"||"+getkodePegawai()+"||"+
                getJabatan()+"||"+getJamLembur()+"||"+totalGaji();
    }
}
