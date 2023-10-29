 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATmodel;

/**
 *
 * @author musya
 */
public class M_KeranjangBarangMasuk {
    private String kode_barang;
    private String nama_barang;
    private Long harga;
    private Integer jumlah_masuk;
    private Long subtotmasuk;

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

    public Integer getJumlah_masuk() {
        return jumlah_masuk;
    }

    public void setJumlah_masuk(Integer jumlah_masuk) {
        this.jumlah_masuk = jumlah_masuk;
    }

    public Long getSubtotmasuk() {
        return subtotmasuk;
    }

    public void setSubtotmasuk(Long subtotmasuk) {
        this.subtotmasuk = subtotmasuk;
    }
}
