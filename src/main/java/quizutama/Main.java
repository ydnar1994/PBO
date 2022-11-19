package quizutama;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("#0.00");
        boolean isAdmin=false;

        boolean isLogin=true;
        Barang br=new Barang();
        BarangMasuk bm=new BarangMasuk();
        List<BarangMasuk>  listBarangMasuk=new ArrayList<BarangMasuk>();
        List<BarangKeluar>  listBarangKeluar=new ArrayList<BarangKeluar>();
        List<Barang> listBarang = new ArrayList<Barang>();

        System.out.println("--- Distributor PT. Garuda Abadi Group ---");
        System.out.println("==========================================");
        Scanner sc=new Scanner(System.in);
        Login lg=new Login();
        isLogin = lg.doLogin();

        if(isLogin){
            int pilih=0;
            do{
                System.out.println("Pilih Check Data Barang : ");
                System.out.println("1. Barang Masuk ");
                System.out.println("2. Barang Keluar");
                System.out.print("Masukan Pilihan Data : ");
                pilih = sc.nextInt();
                System.out.println("=========================");

                if(!isAdmin){
                    System.out.println("Silahkan Masukan Data Anda");
                    System.out.println("=========================");
                    isAdmin = br.dataAdmin();
                }

                System.out.println();

                if(pilih==1){
                    System.out.println("*** Pendataan Barang Masuk PT. Garuda Abadi Group ***");
                    System.out.println("-----------------------------------------------------");
                    System.out.printf("|| %-10s || %-5s || %-8s || %-9s ||",
                            "Jenis Barang",
                            "Nama Barang",
                            "Jumlah",
                            "Harga");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    listBarangMasuk = br.listBarangMasuk();
                    for (int i = 0; i < listBarangMasuk.size(); i++) {
                        System.out.printf("|| %-10s || %-12s || %-7s || %-7s ||",
                                listBarangMasuk.get(i).getJenisBarang(),
                                listBarangMasuk.get(i).getNamaBarang(),
                                listBarangMasuk.get(i).getJumlah(),
                                "Rp. "+listBarangMasuk.get(i).getHarga());
                        System.out.println();
                    }
                    System.out.println("-----------------------------------------------------");
                    bm = barangMasuk(listBarangMasuk,bm);
                }else if(pilih==2){
                    System.out.println("*** Pendataan Barang Masuk PT. Garuda Abadi Group ***");
                    System.out.println("-----------------------------------------------------");
                    System.out.printf("|| %-10s || %-5s || %-8s || %-9s ||",
                            "Jenis Barang",
                            "Nama Barang",
                            "Jumlah",
                            "Harga");
                    System.out.println();
                    System.out.println("-----------------------------------------------------");
                    listBarangKeluar = br.listBarangKeluar();
                    for (int i = 0; i < listBarangKeluar.size(); i++) {
                        System.out.printf("|| %-10s || %-12s || %-7s || %-7s ||",
                                listBarangKeluar.get(i).getJenisBarang(),
                                listBarangKeluar.get(i).getNamaBarang(),
                                listBarangKeluar.get(i).getJumlah(),
                                "Rp. "+listBarangKeluar.get(i).getHarga());
                        System.out.println();
                    }
                    System.out.println("-----------------------------------------------------");
                    bm = barangKeluar(listBarangKeluar,bm);
                }
            }while (pilih!=2);
        }
        System.out.println();
        System.out.println("Administrasi Persediaan Barang Distributor PT. Garuda Abadi Group");
        System.out.println("Check, Data dan Antar, Ketelitian Anda dalam Administrasi di Utamakan (^_^)");
    }

    private static BarangMasuk barangMasuk(List<BarangMasuk> listBarang,BarangMasuk modal) {
        DecimalFormat formatter = new DecimalFormat("#0.00");

        int pilihBarang=0,jumlahBarang=0;
        Scanner sc=new Scanner(System.in);
        Hitung ht=new Hitung();
        int totalPemasukan=0;
        int totalKas=modal.getModalAwal();

        do{
            System.out.print("Pilihan Anda : ");
            pilihBarang = sc.nextInt();
            if (pilihBarang!=0){
                System.out.print("Banyaknya Barang Yang Masuk : ");
                jumlahBarang = sc.nextInt();
                System.out.println("Data Tersimpan");
                ht.totalPemasukan(jumlahBarang,listBarang.get(pilihBarang-1));
                System.out.println("Harga Sebesar : Rp."+formatter.format(ht.getTotalPemasukan()));
                totalPemasukan = totalPemasukan+ht.getTotalPemasukan();
            }
        }while (pilihBarang!=0);
        System.out.println("Selesai");
        System.out.println("Total Pemasukan => Rp."+formatter.format(totalPemasukan));
        System.out.println("Total Kas       => Rp."+formatter.format(totalKas+totalPemasukan));
        modal.setModalAwal(totalKas+totalPemasukan);

        return modal;
    }

    private static BarangMasuk barangKeluar(List<BarangKeluar> listBarang,BarangMasuk modal) {
        DecimalFormat formatter = new DecimalFormat("#0.00");

        int pilihBarang,jumlahBarang;
        Scanner sc=new Scanner(System.in);
        Hitung ht=new Hitung();
        int totalPengeluaran=0;
        int totalKas=modal.getModalAwal();

        do{
            System.out.print("Pilihan Anda : ");
            pilihBarang = sc.nextInt();
            if(pilihBarang!=0){
                System.out.print("Banyaknya Barang Yang Keluar : ");
                jumlahBarang = sc.nextInt();
                System.out.println("Data Tersimpan");
                ht.totalPengeluaran(jumlahBarang,listBarang.get(pilihBarang-1));
                System.out.println("Harga Sebesar : Rp."+formatter.format(ht.getTotalPengeluaran()));
                totalPengeluaran = totalPengeluaran+ht.getTotalPengeluaran();
            }
        }while (pilihBarang!=0);
        System.out.println("Selesai");
        System.out.println("Total Pengeluaran => Rp."+formatter.format(totalPengeluaran));
        System.out.println();
        System.out.println();
        modal.setModalAwal(totalKas-totalPengeluaran);
        System.out.print("Sisa Kas dari Total Pengeluaran => Rp."+formatter.format(totalKas+totalPengeluaran));

        return modal;
    }
}
