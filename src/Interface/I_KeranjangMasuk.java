/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_KeranjangBarangMasuk;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_KeranjangMasuk {
    void addData (M_KeranjangBarangMasuk kermas);
    void perbaruiData (M_KeranjangBarangMasuk kermas);
    void delete (M_KeranjangBarangMasuk kermas);
    
    M_KeranjangBarangMasuk getByid (String id);
    List<M_KeranjangBarangMasuk> getData();
}
