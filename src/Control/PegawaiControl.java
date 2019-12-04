/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.List;
import DAO.PegawaiDAO;
import Model.Pegawai;
/**
 *
 * @author hp
 */
public class PegawaiControl {
    private PegawaiDAO pgwDAO = new PegawaiDAO();
    ////////Tambah////////
    public void InsertDataPegawai(Pegawai P) {
        pgwDAO.makeConnection();
        pgwDAO.insertPegawai(P);
        pgwDAO.closeConnection();
    }
    
     /////////TAMPIL///////
    public String showDataPegawai() {
        
       pgwDAO.makeConnection();
        List<Pegawai> userData = pgwDAO.ShowPegawai();
         pgwDAO.closeConnection();
       
        String userString = " ";
        
        for(int i = 0; i< userData.size(); i++){
            userString = userString + userData.get(i).showPegawai() + "\n";
            
        }
        
        return userString;
    }
    
    ////////SEARCH///////
    
    public Pegawai seacrhPegawai(String kodePegawai) {
        Pegawai peg = null;
        pgwDAO.makeConnection();
        peg = pgwDAO.searchPegawai(kodePegawai);
        pgwDAO.closeConnection();
        
        return peg;
    }
    
      public void editPegawai(Pegawai P, String kodePegawai) {
       pgwDAO.makeConnection();
       pgwDAO.editPegawai(P, kodePegawai);
       pgwDAO.closeConnection();
    }
    
    public void deletePegawai(String kodePegawai) {
       pgwDAO.makeConnection();
       pgwDAO.deletePegawai(kodePegawai);
       pgwDAO.closeConnection();
    }
    
}
