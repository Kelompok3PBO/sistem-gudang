/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_BarangMasuk;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_BarangMasuk {
    void addData(M_BarangMasuk mmasuk);
    void updateStatus (String kode_Barang);
    
    M_BarangMasuk getByid (String id);
    List<M_BarangMasuk> getData();
    List<M_BarangMasuk> search(String id);
    String nomor();
}
