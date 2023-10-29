/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_DPemesanan;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_DPemesanan {
    void addData (M_DPemesanan mdpemesanan);
    void sumTotal (M_DPemesanan mdpemesanan);
    void delete (M_DPemesanan mdpemesanan);
    
    M_DPemesanan getByid(String id);
    List<M_DPemesanan>getData(String id);
    List<M_DPemesanan>search(String id);
}
