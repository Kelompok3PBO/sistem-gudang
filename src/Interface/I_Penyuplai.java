/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_Penyuplai;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_Penyuplai {
    void addData (M_Penyuplai molai);
    void updateData (M_Penyuplai molai);
    void deleteData (M_Penyuplai molai);
    
    M_Penyuplai getByid (String id);
    
    List <M_Penyuplai> getData();
    List <M_Penyuplai> search(String id);
    
    String nomor();
}
