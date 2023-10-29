/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATmodel;

/**
 *
 * @author musya
 */
public class M_BarangKeluar {
    private String no_keluar;
    private String tanggal_keluar;
    private Long banyak_keluar;
    private M_Pengguna idpengguna;

    public String getNo_keluar() {
        return no_keluar;
    }

    public void setNo_keluar(String no_keluar) {
        this.no_keluar = no_keluar;
    }

    public String getTanggal_keluar() {
        return tanggal_keluar;
    }

    public void setTanggal_keluar(String tanggal_keluar) {
        this.tanggal_keluar = tanggal_keluar;
    }

    public Long getBanyak_keluar() {
        return banyak_keluar;
    }

    public void setBanyak_keluar(Long banyak_keluar) {
        this.banyak_keluar = banyak_keluar;
    }

    public M_Pengguna getIdpengguna() {
        return idpengguna;
    }

    public void setIdpengguna(M_Pengguna idpengguna) {
        this.idpengguna = idpengguna;
    }
}
