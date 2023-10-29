/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_DBarangKeluar;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_DBarangKeluar {
    void addData (M_DBarangKeluar mdkeluar);
    void sumTotal (M_DBarangKeluar mdkeluar);
    void delete (M_DBarangKeluar mdkeluar);
    
    M_DBarangKeluar getByid(String id);
    List<M_DBarangKeluar>getData(String id);
    List<M_DBarangKeluar>search(String id);
    
    boolean validStok (M_DBarangKeluar mdkeluar);
}
