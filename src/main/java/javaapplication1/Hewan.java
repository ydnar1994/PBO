package javaapplication1;

public class Hewan {
    String mata,mulut,telinga,ekor;
    Integer kaki;

    /* set = kata "SET" hanya kebiasaan programmer yang mengartikan fungsi untuk
    memasukkan nilai kedalam method pada suatu class
      get= kata "GET" hanya kebiasaan programmer untuk mengembalikan nilai pada dari variable
      dengan menggunakan fungsi return  */

    public void setMata(String mata) {
        this.mata = mata;
    }

    public void setMulut(String mulut) {
        this.mulut = mulut;
    }

    public void setTelinga(String telinga) {
        this.telinga = telinga;
    }

    public void setEkor(String ekor) {
        this.ekor = ekor;
    }

    public void setKaki(Integer kaki) {
        this.kaki = kaki;
    }

    public String getMata() {
        return mata;
    }

    public String getMulut() {
        return mulut;
    }

    public String getTelinga() {
        return telinga;
    }

    public String getEkor() {
        return ekor;
    }

    public Integer getKaki() {
        return kaki;
    }

    String bermain(String m){
        return m;
    }

    String makan(String mkn) {
        return mkn;
    }

    Boolean tidur(Boolean t) {
        return t;
    }
}
