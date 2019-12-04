/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

/**
 *
 * @author hp
 */
public class ExJabatan extends Exception {
    public String massage() {
        return "Jabatan Hanya Manager, Chef, Staff Dapur, Pramusaji";
    }
    
}
