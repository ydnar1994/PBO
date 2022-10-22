package javaapplicationquiz;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class mainGaji {
    protected static BigDecimal totGaji=BigDecimal.ZERO;

    public static void main (String[] args){
        Penggajian gaji=new Penggajian();

        int pilih=0;

        Scanner sc=new Scanner(System.in);
        ArrayList<Penggajian> listGaji=new ArrayList();
        do{
            System.out.println("Sistem Penggajian Karyawan PT. MAJU SEJAHTERA ");
            System.out.println("1. Daftar Karyawan");
            System.out.println("2. Pembayaran Gaji");
            System.out.println("3. Keluar");
            System.out.println("---------------------");
            System.out.println("Pilih : ");
            pilih = sc.nextInt();

            if(pilih == 1){
                //Masukan Order
                listGaji = daftar(listGaji);
            }else if(pilih==2){
                listGaji = gajian(listGaji);
                listGaji.clear();
            }

        }while (pilih!=3);
    }

    private static ArrayList<Penggajian> daftar(ArrayList<Penggajian> listGaji) {
        String namaKaryawan;
        BigDecimal gaji;
        BigDecimal potongan;
        String jabatan;
        String namaBagian;

        Scanner sc=new Scanner(System.in);

        System.out.println("Nama Karyawan : ");
        namaKaryawan = sc.nextLine();
        System.out.println("Jabatan : ");
        jabatan = sc.nextLine();
        System.out.println("Bagian : ");
        namaBagian = sc.nextLine();
        System.out.println("Gaji : ");
        gaji = sc.nextBigDecimal();
        System.out.println("Potongan : ");
        potongan = sc.nextBigDecimal();

        listGaji.add(new Penggajian(namaKaryawan,gaji,potongan,jabatan,namaBagian));

        return listGaji;
    }

    private static ArrayList<Penggajian> gajian(ArrayList<Penggajian> listGaji) {
        Scanner sc=new Scanner(System.in);
        totGaji = BigDecimal.ZERO;

        System.out.println("----------------------------------------------------");
        System.out.printf("| %-10s | %-5s | %-7s | %-7s | %-7s | %-7s |",
                "Nama Karyawan",
                "Jabatan",
                "Bagian",
                "Gaji",
                "Potongan",
                "Gaji Bersih");
        System.out.println();
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < listGaji.size(); i++) {
            System.out.printf("| %-7s  | %-5s  | %-7s  | %-7s  | %-7s | %-7s |",
                    listGaji.get(i).getNamaKaryawan(),
                    listGaji.get(i).getJabatan(),
                    listGaji.get(i).getNamaBagian(),
                    listGaji.get(i).getGaji(),
                    listGaji.get(i).getPotongan(),
                    listGaji.get(i).getGaji().subtract(listGaji.get(i).getPotongan()));
            totGaji = totGaji.add(listGaji.get(i).getGaji().subtract(listGaji.get(i).getPotongan()));
            System.out.println();
            System.out.println("----------------------------------------------------");

        }
        System.out.println("Total Gaji PT. MAJU SEJAHTERA : "+totGaji);
        
        return listGaji;
    }
}
