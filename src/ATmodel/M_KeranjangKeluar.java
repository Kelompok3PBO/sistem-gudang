/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATmodel;

/**
 *
 * @author musya
 */
public class M_KeranjangKeluar {
    private String kode_barang;
    private String nama_barang;
    private Long harga;
    private Integer jumlah_keluar;
    private Long subtotkeluar;

    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public Integer getJumlah_keluar() {
        return jumlah_keluar;
    }

    public void setJumlah_keluar(Integer jumlah_keluar) {
        this.jumlah_keluar = jumlah_keluar;
    }

    public Long getSubtotkeluar() {
        return subtotkeluar;
    }

    public void setSubtotkeluar(Long subtotkeluar) {
        this.subtotkeluar = subtotkeluar;
    }
}
