/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATmodel;

/**
 *
 * @author musya
 */
public class M_BarangMasuk {
    private String no_masuk;
    private String tanggal_masuk;
    private Long banyak_masuk;
    private M_Penyuplai idpenyuplai;
    private M_Pengguna idpengguna;

    public String getNo_masuk() {
        return no_masuk;
    }

    public void setNo_masuk(String no_masuk) {
        this.no_masuk = no_masuk;
    }

    public String getTanggal_masuk() {
        return tanggal_masuk;
    }

    public void setTanggal_masuk(String tanggal_masuk) {
        this.tanggal_masuk = tanggal_masuk;
    }

    public Long getBanyak_masuk() {
        return banyak_masuk;
    }

    public void setBanyak_masuk(Long banyak_masuk) {
        this.banyak_masuk = banyak_masuk;
    }

    public M_Penyuplai getIdpenyuplai() {
        return idpenyuplai;
    }

    public void setIdpenyuplai(M_Penyuplai idpenyuplai) {
        this.idpenyuplai = idpenyuplai;
    }

    public M_Pengguna getIdpengguna() {
        return idpengguna;
    }

    public void setIdpengguna(M_Pengguna idpengguna) {
        this.idpengguna = idpengguna;
    }
}
