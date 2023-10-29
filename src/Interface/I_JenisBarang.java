/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import ATmodel.M_JenisBarang;
import java.util.List;

/**
 *
 * @author musya
 */
public interface I_JenisBarang {
    void addData (M_JenisBarang jebar);
    void updateData (M_JenisBarang jebar);
    void deleteData (M_JenisBarang jebar);
    
    M_JenisBarang getByid (String id);
    
    List <M_JenisBarang> getData();
    List <M_JenisBarang> search(String id);
    
    String nomor();
    
    boolean validasiJenisBarang(M_JenisBarang jebar);
}
