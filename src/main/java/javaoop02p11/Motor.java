package javaoop02p11;

public class Motor {
    String Jenis, Merek, Seri,BahanBakar;
    int cc,jumlahRoda;

    public String getBahanBakar() {
        this.BahanBakar="Bensin 90";
        return this.BahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        BahanBakar = bahanBakar;
    }

    public int getJumlahRoda() {
        this.jumlahRoda=2;
        return this.jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public Motor() {
    }

    public Motor(String Jenis, String Merek, String Seri, int cc) {
        this.Jenis = Jenis;
        this.Merek = Merek;
        this.Seri = Seri;
        this.cc = cc;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
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
}
