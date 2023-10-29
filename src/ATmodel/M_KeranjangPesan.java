/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATmodel;

/**
 *
 * @author musya
 */
public class M_KeranjangPesan {
    private String kode_barang;
    private String nama_barang;
    private Long harga;
    private Integer jumlah_pesan;
    private Long total_hargaPesanan;
    private String status;

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

    public Integer getJumlah_pesan() {
        return jumlah_pesan;
    }

    public void setJumlah_pesan(Integer jumlah_pesan) {
        this.jumlah_pesan = jumlah_pesan;
    }

    public Long getTotal_hargaPesanan() {
        return total_hargaPesanan;
    }

    public void setTotal_hargaPesanan(Long total_hargaPesanan) {
        this.total_hargaPesanan = total_hargaPesanan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
