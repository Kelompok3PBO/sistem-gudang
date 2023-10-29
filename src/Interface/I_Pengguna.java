/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_Pengguna;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_Pengguna {
    void addData (M_Pengguna mpeng);
    void updateData (M_Pengguna mpeng);
    void deleteData (M_Pengguna mpeng);
    
    M_Pengguna getByid (String id);
    
    List <M_Pengguna> getData();
    List <M_Pengguna> search(String id);
    
    String nomor();
}
