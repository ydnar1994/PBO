package javaoop02p11;

public class Mobil {
    String Merek, Seri, BahanBakar;
    int cc, kursi,jumlahRoda;

    public String getBahanBakar() {
        this.BahanBakar="Bensin 92";
        return this.BahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        BahanBakar = bahanBakar;
    }

    public int getJumlahRoda() {
        this.jumlahRoda=4;
        return this.jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public Mobil() {
    }

    public Mobil(String Merek, String Seri, int cc, int kursi) {
        this.Merek = Merek;
        this.Seri = Seri;
        this.cc = cc;
        this.kursi = kursi;
    }

    public String getMerek() {
        return Merek;
    }

    public void setMerek(String Merek) {
        this.Merek = Merek;
    }

    public String getSeri() {
        return Seri;
    }

    public void setSeri(String Seri) {
        this.Seri = Seri;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getKursi() {
        return kursi;
    }

    public void setKursi(int kursi) {
        this.kursi = kursi;
    }
}
