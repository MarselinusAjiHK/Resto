/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import DAO.PelangganDAO;
import Model.Pelanggan;
/**
 *
 * @author hp
 */
public class PelangganControl {
      private PelangganDAO plgDAO = new PelangganDAO();
    ////////Tambah////////
    public void InsertDataPelanggan(Pelanggan P) {
        plgDAO.makeConnection();
        plgDAO.insertPelanggan(P);
        plgDAO.closeConnection();
    }
    
     /////////TAMPIL///////
    public String showDataPelanggan() {
        
       plgDAO.makeConnection();
        List<Pelanggan> userData =plgDAO.ShowPelanggan();
       plgDAO.closeConnection();
       
        String userString = " ";
        
        for(int i = 0; i< userData.size(); i++){
            userString = userString + userData.get(i).showPelanggan() + "\n";
            
        }
        
        return userString;
    }
    
    ///////SEARCH///////
    
    public Pelanggan seacrhPelanggan(String kodePelanggan) {
        Pelanggan pel = null;
        plgDAO.makeConnection();
        pel= plgDAO.searchPelanggan(kodePelanggan);
       plgDAO.closeConnection();
        
        return pel;
    }
    
     
    
    
}
