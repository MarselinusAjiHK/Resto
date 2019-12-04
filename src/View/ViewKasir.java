/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import Control.MakananControl;
import Control.MinumanControl;
import Control.PelangganControl;
import Model.Minuman;
import Model.Makanan;
import Model.Pelanggan;
import Exception.ExKodeMakanan;
import Exception.ExKodeMinuman;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Timer;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ViewKasir extends javax.swing.JFrame {

    /**
     * Creates new form ViewKasir
     */
    private MakananControl MAK;
    private MinumanControl MIN;
    private PelangganControl PEL;
    
    Makanan makanan;
    Minuman minuman;
    Pelanggan pelanggan;
    String action;
    double totalMakanan;
    double totalMinuman;
    double total;
    double bayar;
    double kembalian;
    
     private DefaultTableModel tblMkn;
    private DefaultTableModel tblMin;
    
          
 
    
    public static Connection CON;
       public static final String url = "jdbc:ucanaccess://";
    public static final String path ="D:\\Database1.mdb";
    
    public ViewKasir() {
        initComponents();
        setEnableKasir(false);
        setEnableEdit(false);
        txtHargaMakanan.setEnabled(false);
        txtHargaMinuman.setEnabled(false);
        txtKembalian.setEnabled(false);
        
        MAK = new MakananControl();
        MIN = new MinumanControl();
        PEL = new PelangganControl();
        
          tblMkn = new DefaultTableModel();
             tblMakanan.setModel(tblMkn);
             tblMkn.addColumn("Nama");
             tblMkn.addColumn("Jenis");
             tblMkn.addColumn(" Harga");
             tblMkn.addColumn("Kode Makanan");
             
              tblMin = new DefaultTableModel();
             tblMinuman.setModel(tblMin);
             tblMin.addColumn("Nama");
             tblMin.addColumn("Jenis");
             tblMin.addColumn("Harga");
             tblMin.addColumn("Kode Minuman");
       
        
        
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMakanan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtJumlahMakanan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtMinuman = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnBayar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtTotalBiaya = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        txtBayar = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtKembalian = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNamaMM = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtJenis = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnTampil = new javax.swing.JButton();
        radioBtnEdit = new javax.swing.JRadioButton();
        radioBtnKasir = new javax.swing.JRadioButton();
        radioBtnMakanan = new javax.swing.JRadioButton();
        radioBtnMinuman = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMakanan = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMinuman = new javax.swing.JTable();
        btnManager = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTanggal = new com.toedter.calendar.JDateChooser();
        jLabel20 = new javax.swing.JLabel();
        txtHargaMakanan = new javax.swing.JTextField();
        txtHargaMinuman = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtJumlahMinuman = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/Sampul (1).png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 180));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Daftar Makanan ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Nama Pelanggan");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 170, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Kode Makanan");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 90, -1));

        txtMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMakananActionPerformed(evt);
            }
        });
        getContentPane().add(txtMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 170, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Jumlah Makanan");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 90, -1));
        getContentPane().add(txtJumlahMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 510, 170, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Kode Minuman ");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 90, -1));
        getContentPane().add(txtMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Daftar Minuman");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 110, -1));

        btnTotal.setBackground(new java.awt.Color(153, 153, 153));
        btnTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnTotal.setText("TOTAL");
        btnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTotalMouseClicked(evt);
            }
        });
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, 180, 70));

        btnBatal.setBackground(new java.awt.Color(153, 153, 153));
        btnBatal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 530, 180, 50));

        btnBayar.setBackground(new java.awt.Color(153, 153, 153));
        btnBayar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBayar.setText("BAYAR");
        btnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 580, 180, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Total Biaya");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, 70, 14));

        txtTotalBiaya.setColumns(20);
        txtTotalBiaya.setRows(5);
        txtTotalBiaya.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane3.setViewportView(txtTotalBiaya);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 220, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Bayar");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, -1, -1));

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, 220, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Kembalian");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 560, -1, -1));

        txtKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKembalianActionPerformed(evt);
            }
        });
        getContentPane().add(txtKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 580, 220, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Makanan & Minuman");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 350, -1, -1));

        jLabel15.setText("Nama ");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 380, 50, -1));
        getContentPane().add(txtNamaMM, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 380, 150, -1));

        jLabel16.setText("ID");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, 60, -1));
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 410, 150, -1));

        jLabel17.setText("Jenis");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 50, 20));
        getContentPane().add(txtJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 440, 150, -1));

        jLabel18.setText("Harga");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, -1, -1));

        txtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaActionPerformed(evt);
            }
        });
        getContentPane().add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 470, 150, -1));

        btnTambah.setBackground(new java.awt.Color(153, 153, 153));
        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 560, -1, -1));

        btnHapus.setBackground(new java.awt.Color(153, 153, 153));
        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 560, -1, -1));

        btnUpdate.setBackground(new java.awt.Color(153, 153, 153));
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 560, -1, -1));

        btnTampil.setBackground(new java.awt.Color(153, 153, 153));
        btnTampil.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnTampil.setText("TAMPIL");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });
        getContentPane().add(btnTampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 600, 120, 50));

        radioBtnEdit.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(radioBtnEdit);
        radioBtnEdit.setText("Edit Data");
        radioBtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnEditActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, -1, -1));

        buttonGroup1.add(radioBtnKasir);
        radioBtnKasir.setText("Kasir");
        radioBtnKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnKasirActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 230, -1, -1));

        buttonGroup2.add(radioBtnMakanan);
        radioBtnMakanan.setText("Makanan");
        radioBtnMakanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMakananActionPerformed(evt);
            }
        });
        getContentPane().add(radioBtnMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, -1, -1));

        buttonGroup2.add(radioBtnMinuman);
        radioBtnMinuman.setText("Minuman");
        getContentPane().add(radioBtnMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 510, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setText("Cari");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, -1, -1));
        getContentPane().add(txtCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, 160, -1));

        btnCari.setBackground(new java.awt.Color(153, 153, 153));
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 280, -1, -1));

        tblMakanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Jenis", "Harga", "Kode Makanan"
            }
        ));
        jScrollPane4.setViewportView(tblMakanan);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 640, 100));

        tblMinuman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Jenis", "Harga", "Kode Minuman"
            }
        ));
        jScrollPane5.setViewportView(tblMinuman);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 640, 100));

        btnManager.setBackground(new java.awt.Color(153, 153, 153));
        btnManager.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnManager.setText("MENU MANAGER");
        btnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerActionPerformed(evt);
            }
        });
        getContentPane().add(btnManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 140, 70));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/ikan.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 280, -1));
        getContentPane().add(txtTanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 190, 20));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Tanggal");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, -1, -1));
        getContentPane().add(txtHargaMakanan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 170, -1));

        txtHargaMinuman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHargaMinumanActionPerformed(evt);
            }
        });
        getContentPane().add(txtHargaMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 570, 170, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Jumlah Minuman ");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 100, -1));
        getContentPane().add(txtJumlahMinuman, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, 170, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/ikan.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 500, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/ikan.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 470, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

  

 
    public void setEnableKasir(boolean val) {
       
        txtNama.setEnabled(val);
        txtMakanan.setEnabled(val);
        txtJumlahMakanan.setEnabled(val);
        txtJumlahMinuman.setEnabled(val);
        txtMinuman.setEnabled(val);
        btnBayar.setEnabled(val);
        btnTotal.setEnabled(val);
        btnBatal.setEnabled(val);
        txtTotalBiaya.setEnabled(val);
        txtBayar.setEnabled(val);
        txtKembalian.setEnabled(val);
        txtTanggal.setEnabled(val);
        

      
    }
    
    public void setEnableEdit(boolean val){
        txtNamaMM.setEnabled(val);
        txtID.setEnabled(val);
        txtJenis.setEnabled(val);
        txtHarga.setEnabled(val);
        btnTambah.setEnabled(val);
        btnHapus.setEnabled(val);
        btnUpdate.setEnabled(val);
        txtCari.setEnabled(val);
        btnCari.setEnabled(val);
      
   
    }
    
    public void clearTXT() {
        txtNamaMM.setText("");
        txtCari.setText("");
        txtID.setText("");
        txtJenis.setText("");
        txtHarga.setText("");
        txtNama.setText("");
        txtMakanan.setText("");
        txtJumlahMakanan.setText("");
        txtJumlahMinuman.setText("");
        txtMinuman.setText("");
    }
    
     public void exKodeMakanan() throws ExKodeMakanan {
      if(MAK.seacrhMakanan(txtID.getText())!=null)
      {
          throw new ExKodeMakanan();
      }
    }
     
     public void exKodeMinuman() throws ExKodeMinuman {
      if(MIN.seacrhMinuman(txtID.getText())!=null)
      {
          throw new ExKodeMinuman();
      }
    }


    
    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed
        // TODO add your handling code here:
        if(MAK.seacrhMakanan(txtMakanan.getText())!=null || MIN.seacrhMinuman(txtMinuman.getText())!=null )
        {
                  makanan = MAK.seacrhMakanan(txtMakanan.getText());
                 txtHargaMakanan.setText(String.valueOf(makanan.getHarga()));
                 minuman = MIN.seacrhMinuman(txtMinuman.getText());
                 txtHargaMinuman.setText(String.valueOf(minuman.getHarga()));    
                 
                 totalMinuman = Double.parseDouble(txtHargaMinuman.getText())*Integer.parseInt(txtJumlahMinuman.getText());
                 totalMakanan = Double.parseDouble(txtHargaMakanan.getText())*Integer.parseInt(txtJumlahMakanan.getText());
                 total = totalMinuman+totalMakanan;
                 txtTotalBiaya.setText(String.valueOf(total));
                 
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Data Menu Tidak Tersedia !");
        }
        
        
  
    }//GEN-LAST:event_btnTotalActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKembalianActionPerformed

    private void radioBtnKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnKasirActionPerformed
        // TODO add your handling code here:
         setEnableKasir(true);
        setEnableEdit(false);
   
   
    }//GEN-LAST:event_radioBtnKasirActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
       if(radioBtnMakanan.isSelected()==true)
                {
                    try{
                        exKodeMakanan();
                   makanan= new Makanan(txtNamaMM.getText(),Double.parseDouble(txtHarga.getText()),
                                        txtJenis.getText(),txtID.getText());
                                      
                   MAK.InsertDataMakanan(makanan);
                    JOptionPane.showMessageDialog(this, "Data Makanan berhasil ditambahkan");
                    btnTampilActionPerformed(evt);
                    clearTXT();
                    }catch(ExKodeMakanan e) {
                        JOptionPane.showMessageDialog(this, e.massage());
                    }
                }
       else if(radioBtnMinuman.isSelected()==true)
                 {
                       try{
                        exKodeMinuman();
                     minuman = new Minuman(txtNamaMM.getText(),Double.parseDouble(txtHarga.getText()),
                                        txtJenis.getText(),txtID.getText());
                     MIN.InsertDataMinuman(minuman);
                      JOptionPane.showMessageDialog(this, "Data Minuman berhasil ditambahkan");
                      btnTampilActionPerformed(evt);
                      clearTXT();
                       }catch(ExKodeMinuman e) {
                        JOptionPane.showMessageDialog(this, e.massage());
                    }
                 }
       else 
                {
                    JOptionPane.showMessageDialog(this, "Pilih Button Makanan Atau Minuman");
                }
       
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

             
            if(radioBtnMinuman.isSelected()==true && action.equalsIgnoreCase("HapusAtauUpdateMinuman"))
                 {
                    
                     minuman = new Minuman(txtNamaMM.getText(),Double.parseDouble(txtHarga.getText()),
                                        txtJenis.getText(),txtID.getText());
                     MIN.editMinuman(minuman, txtCari.getText());
                      JOptionPane.showMessageDialog(this, "Data Minuman berhasil diupdate");
                      btnTampilActionPerformed(evt);
                     
                 }
            else if(radioBtnMakanan.isSelected()==true && action.equalsIgnoreCase("HapusAtauUpdateMakanan"))
                {
                   makanan= new Makanan(txtNamaMM.getText(),Double.parseDouble(txtHarga.getText()),
                                        txtJenis.getText(),txtID.getText());
                                      
                   MAK.editMakanan(makanan, txtCari.getText());
                    JOptionPane.showMessageDialog(this, "Data Makanan berhasil diupdate");
                    btnTampilActionPerformed(evt);
                    }
            else
                {
                    JOptionPane.showMessageDialog(this, "Pilih Button Makanan Atau Minuman");
                }
            
            clearTXT();
            
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        // TODO add your handling code here:
          tblMkn.getDataVector().removeAllElements();//untuk mengkosongkan isi tabel di form
 tblMkn.fireTableDataChanged();
 
  try {
      
          CON = DriverManager.getConnection(url + path);
        Statement statement = CON.createStatement();
           String sql = "SELECT * FROM Makanan";
        ResultSet rs = statement.executeQuery(sql);

    while(rs.next()){
     Object [] o = new Object[4];
     o[0] = rs.getString("Nama");
     o[1] = rs.getString("Jenis");
     o[2] = rs.getString("Harga");
     o[3] = rs.getString("Kode_Makanan");
     tblMkn.addRow(o);
                
    }
   rs.close();
   statement.close();
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
  }
  
  tblMin.getDataVector().removeAllElements();//untuk mengkosongkan isi tabel di form
 tblMin.fireTableDataChanged();
 
  try {
      
          CON = DriverManager.getConnection(url + path);
        Statement statement = CON.createStatement();
           String sql = "SELECT * FROM Minuman";
        ResultSet rs = statement.executeQuery(sql);

    while(rs.next()){
     Object [] o = new Object[4];
     o[0] = rs.getString("Nama");
     o[1] = rs.getString("Jenis");
     o[2] = rs.getString("Harga");
     o[3] = rs.getString("Kode_Minuman");
     tblMin.addRow(o);
                
    }
   rs.close();
   statement.close();
  } catch (Exception e) {
   JOptionPane.showMessageDialog(null, "Gagal koneksi "+e);
  }
      
    }//GEN-LAST:event_btnTampilActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        if(action.equalsIgnoreCase("HapusAtauUpdateMakanan") && radioBtnMakanan.isSelected()==true)
        {
            MAK.deleteMakanan(txtID.getText());
            JOptionPane.showMessageDialog(this,"Data Makanan berhasil dihapus !!");
                clearTXT();
        }
        else if(action.equalsIgnoreCase("HapusAtauUpdateMinuman") && radioBtnMinuman.isSelected()==true)
        {
            MIN.deleteMinuman(txtID.getText());
            JOptionPane.showMessageDialog(this,"Data Minuman berhasil dihapus !!");
                clearTXT();
        }
        else
        {
              JOptionPane.showMessageDialog(this,"Pilih Makanan atau Minuman !!");
        }
        txtCari.setText("");
        btnTampilActionPerformed(evt);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void radioBtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnEditActionPerformed
        // TODO add your handling code here:
         setEnableKasir(false);
        setEnableEdit(true);
    }//GEN-LAST:event_radioBtnEditActionPerformed

    private void radioBtnMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMakananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMakananActionPerformed

    private void txtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        if(MAK.seacrhMakanan(txtCari.getText())!=null)
        {
            makanan = MAK.seacrhMakanan(txtCari.getText());
            
            action = "HapusAtauUpdateMakanan";
            
            txtID.setText(String.valueOf(makanan.getkodeMakanan()));
            txtNamaMM.setText(makanan.getNama());
            txtJenis.setText(String.valueOf(makanan.getjenisMakanan()));
            txtHarga.setText(String.valueOf(makanan.getHarga()));
            
        }
        else if(MIN.seacrhMinuman(txtCari.getText())!=null)
        {
            minuman = MIN.seacrhMinuman(txtCari.getText());
            action = "HapusAtauUpdateMinuman";
            
            txtID.setText(String.valueOf(minuman.getkodeMinuman()));
            txtNamaMM.setText(minuman.getNama());
            txtJenis.setText(String.valueOf(minuman.getjenisMinuman()));
            txtHarga.setText(String.valueOf(minuman.getHarga()));       

        }
        else
            JOptionPane.showMessageDialog(this, "Kode Tidak Ditemukan");
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTotalMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnTotalMouseClicked

    private void btnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarActionPerformed
        // TODO add your handling code here:
        total=Double.parseDouble(txtTotalBiaya.getText());
        bayar=Double.parseDouble(txtBayar.getText());
        if(bayar < total)
        {
             JOptionPane.showMessageDialog(this, "Uang Anda Kurang");
        }
        else
        {
               kembalian=bayar-total;
               txtKembalian.setText(String.valueOf(kembalian));
               
                pelanggan= new Pelanggan(txtNama.getText(),txtTanggal.getDateFormatString(),Double.parseDouble(txtTotalBiaya.getText()),
                                       Integer.parseInt(txtJumlahMakanan.getText())+Integer.parseInt(txtJumlahMinuman.getText()));
                                      
                 PEL.InsertDataPelanggan(pelanggan);
                    JOptionPane.showMessageDialog(this, "Data Pelanggan berhasil ditambahkan");
                    btnTampilActionPerformed(evt);
                    clearTXT();
               
               
        }
        
    }//GEN-LAST:event_btnBayarActionPerformed

    private void txtMakananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMakananActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMakananActionPerformed

    private void txtHargaMinumanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHargaMinumanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHargaMinumanActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerActionPerformed
        // TODO add your handling code here:
        new ViewManager().show();
    }//GEN-LAST:event_btnManagerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ViewKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBayar;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnManager;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTampil;
    private javax.swing.JButton btnTotal;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton radioBtnEdit;
    private javax.swing.JRadioButton radioBtnKasir;
    private javax.swing.JRadioButton radioBtnMakanan;
    private javax.swing.JRadioButton radioBtnMinuman;
    private javax.swing.JTable tblMakanan;
    private javax.swing.JTable tblMinuman;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtHargaMakanan;
    private javax.swing.JTextField txtHargaMinuman;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJenis;
    private javax.swing.JTextField txtJumlahMakanan;
    private javax.swing.JTextField txtJumlahMinuman;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtMakanan;
    private javax.swing.JTextField txtMinuman;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNamaMM;
    private com.toedter.calendar.JDateChooser txtTanggal;
    private javax.swing.JTextArea txtTotalBiaya;
    // End of variables declaration//GEN-END:variables
}
