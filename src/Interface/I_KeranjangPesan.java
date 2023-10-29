/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_KeranjangPesan;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_KeranjangPesan {
    void addData (M_KeranjangPesan kerpes);
    void perbaruiData (M_KeranjangPesan kerpes);
    void delete (M_KeranjangPesan kerpes);
    
    M_KeranjangPesan getByid (String id);
    List<M_KeranjangPesan> getData();
}
