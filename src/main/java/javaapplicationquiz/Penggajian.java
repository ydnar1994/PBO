package javaapplicationquiz;

import java.math.BigDecimal;

public class Penggajian {
    String namaKaryawan;
    BigDecimal gaji;
    BigDecimal potongan;
    BigDecimal gajiBersih;
    String jabatan;
    String namaBagian;

    public Penggajian(String namaKaryawan, BigDecimal gaji, BigDecimal potongan, String jabatan, String namaBagian) {
        this.namaKaryawan = namaKaryawan;
        this.gaji = gaji;
        this.potongan = potongan;
        this.jabatan = jabatan;
        this.namaBagian = namaBagian;
    }

    public Penggajian(){

        setGajiBersih((gaji==null?BigDecimal.ZERO:gaji).add(potongan==null?BigDecimal.ZERO:potongan));

        this.gajiBersih = getGajiBersih();
    }

    public BigDecimal getGajiBersih() {
        return gajiBersih;
    }

    public void setGajiBersih(BigDecimal gajiBersih) {
        this.gajiBersih = gajiBersih;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public BigDecimal getGaji() {
        return gaji;
    }

    public void setGaji(BigDecimal gaji) {
        this.gaji = gaji;
    }

    public BigDecimal getPotongan() {
        return potongan;
    }

    public void setPotongan(BigDecimal potongan) {
        this.potongan = potongan;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getNamaBagian() {
        return namaBagian;
    }

    public void setNamaBagian(String namaBagian) {
        this.namaBagian = namaBagian;
    }
}
