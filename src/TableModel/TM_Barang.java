/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TableModel;

import ATmodel.M_Barang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author musya
 */
public class TM_Barang extends AbstractTableModel {
    
    private List<M_Barang> list=new ArrayList<>();
    
    public void tambahData (M_Barang mbar){
        list.add(mbar);
        fireTableRowsInserted(list.size()-1,list.size()-1);
        JOptionPane.showMessageDialog(null, "data added successfully");
    }
    
    public void updateData (int row, M_Barang mbar){
        list.add(row, mbar);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "data update successfully");
    }
    
    public void hapusData (int index){
        list.remove(index);
        fireTableRowsDeleted(index,index);
        JOptionPane.showMessageDialog(null, "data deleted successfully");
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<M_Barang>list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index,M_Barang mbar){
        list.set(index,mbar);
        fireTableRowsUpdated(index,index);
    }
    
    public M_Barang getData(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }
    
    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : list.get(rowIndex).getKode_barang();
            case 1 : list.get(rowIndex).getJns_barang().getKode_jenis();
            case 2 : list.get(rowIndex).getJns_barang().getNama_jenis();
            case 3 : list.get(rowIndex).getNama_barang();
            case 4 : list.get(rowIndex).getSatuan();
            case 5 : list.get(rowIndex).getHarga();
            case 6 : list.get(rowIndex).getStok();
         
            default: return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0: return "Kode Barang";
            case 1: return "Kode jenis";
            case 2: return "Nama jenis";
            case 3: return "Nama Barang";
            case 4: return "Satuan";
            case 5: return "Harga";
            case 6: return "Stok";
            
            default: return null;
        }
    }
}
