package quizutama1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Barang {

    public boolean dataAdmin(){
        Scanner sc=new Scanner(System.in);
        BarangMasuk bm=new BarangMasuk();
        System.out.print("Nama Admin : ");
        bm.setNama(sc.nextLine());
        System.out.print("NIK Admin : ");
        bm.setNik(sc.nextLine());

        return true;
    }

    public List<BarangMasuk> listBarangMasuk(){
        List listBarang=new ArrayList();
        BarangMasuk bm=new BarangMasuk();

        bm.setJenisBarang("1. Buku");
        bm.setNamaBarang("Buku Tulis");
        bm.setJumlah("1 Pak");
        bm.setHarga(45000);
        listBarang.add(bm);

        bm=new BarangMasuk();
        bm.setJenisBarang("2. Buku");
        bm.setNamaBarang("Buku Gambar");
        bm.setJumlah("1 Pak");
        bm.setHarga(50000);
        listBarang.add(bm);

        bm=new BarangMasuk();
        bm.setJenisBarang("3. Kertas");
        bm.setNamaBarang("Kertas A4");
        bm.setJumlah("1 Rim");
        bm.setHarga(40000);
        listBarang.add(bm);

        bm=new BarangMasuk();
        bm.setJenisBarang("4. Bulpen");
        bm.setNamaBarang("Bulpen Biru");
        bm.setJumlah("1 Pak");
        bm.setHarga(38000);
        listBarang.add(bm);

        bm=new BarangMasuk();
        bm.setJenisBarang("5. Pensil");
        bm.setNamaBarang("Pensil Raut");
        bm.setJumlah("1 Pak");
        bm.setHarga(32000);
        listBarang.add(bm);

        return listBarang;
    }

    public List<BarangKeluar> listBarangKeluar(){
        List listBarang=new ArrayList();
        BarangKeluar bm=new BarangKeluar();

        bm.setJenisBarang("1. Buku");
        bm.setNamaBarang("Buku Tulis");
        bm.setJumlah("1 Pak");
        bm.setHarga(45000);
        listBarang.add(bm);

        bm=new BarangKeluar();
        bm.setJenisBarang("2. Buku");
        bm.setNamaBarang("Buku Gambar");
        bm.setJumlah("1 Pak");
        bm.setHarga(50000);
        listBarang.add(bm);

        bm=new BarangKeluar();
        bm.setJenisBarang("3. Kertas");
        bm.setNamaBarang("Kertas A4");
        bm.setJumlah("1 Rim");
        bm.setHarga(40000);
        listBarang.add(bm);

        bm=new BarangKeluar();
        bm.setJenisBarang("4. Bulpen");
        bm.setNamaBarang("Bulpen Biru");
        bm.setJumlah("1 Pak");
        bm.setHarga(38000);
        listBarang.add(bm);

        bm=new BarangKeluar();
        bm.setJenisBarang("5. Pensil");
        bm.setNamaBarang("Pensil Raut");
        bm.setJumlah("1 Pak");
        bm.setHarga(32000);
        listBarang.add(bm);

        return listBarang;
    }
}
