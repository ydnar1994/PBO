package javaapplication2;

public class Pesan {
    String nama,gula;
    Integer harga,qty;

    public Pesan(String nama, String gula, Integer harga, Integer qty) {
        this.nama = nama;
        this.gula = gula;
        this.harga = harga;
        this.qty = qty;
    }

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
}
