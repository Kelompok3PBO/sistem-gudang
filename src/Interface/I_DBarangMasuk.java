/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_DBarangMasuk;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_DBarangMasuk {
    void addData (M_DBarangMasuk mdmasuk);
    void sumTotal (M_DBarangMasuk mdmasuk);
    void delete (M_DBarangMasuk mdmasuk);
    
    M_DBarangMasuk getByid(String id);
    List<M_DBarangMasuk>getData(String id);
}
