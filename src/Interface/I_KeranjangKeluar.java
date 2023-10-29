/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_KeranjangKeluar;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_KeranjangKeluar {
    void addData (M_KeranjangKeluar kerkel);
    void updateData (M_KeranjangKeluar kerkel);
    void delete (M_KeranjangKeluar kerkel);
    
    M_KeranjangKeluar getByid (String id);
    List<M_KeranjangKeluar> getData();
}
