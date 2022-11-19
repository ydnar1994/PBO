package quizutama2;

import java.util.Scanner;

public class Overloading {

    public DataWarga inputDataWarga(){
        DataWarga dataWarga=new DataWarga();
        Scanner sc=new Scanner(System.in);
        System.out.println("*** Data Warga ***");
        System.out.println("Masukan Nama : ");
        dataWarga.setNama(sc.nextLine());
        System.out.println("Masukan NIK : ");
        dataWarga.setNik(sc.nextLine());
        System.out.println("Masukan Alamat : ");
        dataWarga.setAlamat(sc.nextLine());
        System.out.println("Masukan No. Tlp : ");
        dataWarga.setNoTelp(sc.nextLine());
        System.out.println("---------------------o0o-------------------------");
        System.out.println("*** Data Pekerjaan ***");
        System.out.println("Masukan Pekerjaan : ");
        dataWarga.setJenis_pekerjaan(sc.nextLine());
        System.out.println("Masukan Alamat Kantor : ");
        dataWarga.setAlamat_kantor(sc.nextLine());
        System.out.println("---------------------o0o-------------------------");
        System.out.println("*** Data Status ***");
        System.out.println("Masukan Status : ");
        dataWarga.setStatus(sc.nextLine());
        System.out.println("Masukan Nama Suami/Istri : ");
        dataWarga.setNamaPasangan(sc.nextLine());
        System.out.println("Masukan Jumlah Anak : ");
        dataWarga.setJml_anak(sc.nextInt());

        return dataWarga;
    }

}
