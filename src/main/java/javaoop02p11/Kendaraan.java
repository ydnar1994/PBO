package javaoop02p11;

public class Kendaraan {
    String bahanBakar;
    int jumlahRoda;

    public Kendaraan() {
    }

    public Kendaraan(String bahanBakar, int jumlahRoda) {
        this.bahanBakar = bahanBakar;
        this.jumlahRoda = jumlahRoda;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }
}
