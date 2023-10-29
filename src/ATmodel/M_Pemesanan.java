/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATmodel;

/**
 *
 * @author musya
 */
public class M_Pemesanan {
    private String no_pesanan;
    private String tanggal_pesanan;
    private Long total_hargaPesanan;
    private M_Penyuplai idpenyuplai;
    private M_Pengguna idpengguna;

    public String getNo_pesanan() {
        return no_pesanan;
    }

    public void setNo_pesanan(String no_pesanan) {
        this.no_pesanan = no_pesanan;
    }

    public String getTanggal_pesanan() {
        return tanggal_pesanan;
    }

    public void setTanggal_pesanan(String tanggal_pesanan) {
        this.tanggal_pesanan = tanggal_pesanan;
    }

    public Long getTotal_hargaPesanan() {
        return total_hargaPesanan;
    }

    public void setTotal_hargaPesanan(Long total_hargaPesanan) {
        this.total_hargaPesanan = total_hargaPesanan;
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
