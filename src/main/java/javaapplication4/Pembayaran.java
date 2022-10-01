package javaapplication4;

public class Pembayaran {

    String nama,gula;
    Integer harga,qty;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGula() {
        return gula;
    }

    public void setGula(String gula) {
        this.gula = gula;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Pembayaran(String nama, String gula, Integer harga, Integer qty, Integer bayar, Integer kembali) {
        this.nama = nama;
        this.gula = gula;
        this.harga = harga;
        this.qty = qty;
    }


}
