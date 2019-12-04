/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import DAO.BarangDAO;
import Model.Minuman;
/**
 *
 * @author hp
 */
public class MinumanControl {
     private BarangDAO brgDAO = new BarangDAO();
    ////////Tambah////////
    public void InsertDataMinuman(Minuman M) {
        brgDAO.makeConnection();
        brgDAO.insertMinuman(M);
        brgDAO.closeConnection();
    }
    
     /////////TAMPIL///////
    public String showDataMinuman() {
        
        brgDAO.makeConnection();
        List<Minuman> userData = brgDAO.ShowMinuman();
        brgDAO.closeConnection();
       
        String userString = " ";
        
        for(int i = 0; i< userData.size(); i++){
            userString = userString + userData.get(i).showData() + "\n";
            
        }
        
        return userString;
    }
    
    ////////SEARCH///////
    
    public Minuman seacrhMinuman(String kodeMinuman) {
        Minuman min = null;
        brgDAO.makeConnection();
        min = brgDAO.searchMinuman(kodeMinuman);
        brgDAO.closeConnection();
        
        return min;
    }
    
      public void editMinuman(Minuman M, String kodeMinuman) {
         brgDAO.makeConnection();
         brgDAO.editMinuman(M, kodeMinuman);
          brgDAO.closeConnection();
    }
    
    public void deleteMinuman(String kodeMinuman) {
        brgDAO.makeConnection();
        brgDAO.deleteMinuman(kodeMinuman);
        brgDAO.closeConnection();
    }
    
}
