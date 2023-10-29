/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_BarangKeluar;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_BarangKeluar {
    void addData(M_BarangKeluar mkeluar);
    
    M_BarangKeluar getByid (String id);
    List<M_BarangKeluar> getData();
    List<M_BarangKeluar> search(String id);
    String nomor();
}
