/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import DAO.BarangDAO;
import Model.Makanan;

/**
 *
 * @author hp
 */
public class MakananControl {
    
      private BarangDAO brgDAO = new BarangDAO();
    ////////Tambah////////
    public void InsertDataMakanan(Makanan M) {
        brgDAO.makeConnection();
        brgDAO.insertMakanan(M);
       brgDAO.closeConnection();
    }
    
     /////////TAMPIL///////
    public String showDataMakanan() {
        
        brgDAO.makeConnection();
        List<Makanan> userData = brgDAO.ShowMakanan();
        brgDAO.closeConnection();
       
        String userString = " ";
        
        for(int i = 0; i< userData.size(); i++){
            userString = userString + userData.get(i).showData() + "\n";
            
        }
        
        return userString;
    }
    
     /////////SEARCH///////
    
    public Makanan seacrhMakanan(String kodeMakanan) {
        Makanan mak = null;
        brgDAO.makeConnection();
        mak = brgDAO.searchMakanan(kodeMakanan);
        brgDAO.closeConnection();
        
        return mak;
    }
    
      public void editMakanan(Makanan M, String kodeMakanan) {
         brgDAO.makeConnection();
         brgDAO.editMakanan(M, kodeMakanan);
          brgDAO.closeConnection();
    }
    
    public void deleteMakanan(String kodeMakanan) {
        brgDAO.makeConnection();
        brgDAO.deleteMakanan(kodeMakanan);
        brgDAO.closeConnection();
    }
    
}
