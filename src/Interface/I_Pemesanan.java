/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_Pemesanan;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_Pemesanan {
    void addData (M_Pemesanan mpem);
    
    M_Pemesanan getByid (String id);
    
    List <M_Pemesanan> getData();
    List <M_Pemesanan> search(String id);
    
    String nomor();
}
