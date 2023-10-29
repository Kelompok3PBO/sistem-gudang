/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_Barang;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_Barang {
    void tambahData (M_Barang mbar);
    void updateData (M_Barang mbar);
    void hapusData (M_Barang mbar);
    
    M_Barang getByid (String id);
    
    List<M_Barang> getData();
    List<M_Barang> getData2();
    
    List<M_Barang> search(String id);
    List<M_Barang> search2(String id);
    
    String nomor();
    String nomor2();
}
