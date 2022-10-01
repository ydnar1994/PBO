package javaapplication4;

import javaapplication2.Pesan;
import java.util.ArrayList;
import java.util.Scanner;

public class javaapplication4 {

    private static int totBayar=0;

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        Integer pilih=0;

        ArrayList<Pesan> listPesan=new ArrayList();
        do{
            System.out.println("Bintang Bucks Coffee");
            System.out.println("1. Pemesanan");
            System.out.println("2. Pembayaran");
            System.out.println("3. Keluar");
            System.out.println("---------------------");
            System.out.print("Pilihanmu :");
            pilih = sc.nextInt();

            if(pilih == 1){
                //Masukan Order
                listPesan = beli(listPesan);
            }else if(pilih==2){
                //Tampilkan Order
                listPesan = bayar(listPesan);
                if(totBayar > 0){
                    System.out.println("Bayar:");
                    Integer jmlUang = sc.nextInt();
                    if (jmlUang < totBayar){
                        do {
                            System.out.println("Uang anda kurang...");
                            System.out.println("Bayar:");
                            jmlUang = sc.nextInt();
                        }while (jmlUang < totBayar);

                        System.out.println("Kembalian : "+(jmlUang-totBayar));
                    }else{
                        System.out.println("Kembalian : "+(jmlUang-totBayar));
                    }
                    listPesan.clear();
                }
            }
        }while (pilih != 3);
    }

    private static ArrayList<Pesan> beli(ArrayList<Pesan> listPesan) {
        String nama,gula;
        Integer harga,qty;
        Scanner sc=new Scanner(System.in);

        System.out.println("Nama : ");
        nama = sc.nextLine();
        System.out.println("Gula :");
        gula = sc.nextLine();
        System.out.println("Harga : ");
        harga = sc.nextInt();
        System.out.println("Qty : ");
        qty = sc.nextInt();
        do{
            System.out.println("Qty minimal 1 ");
            System.out.println("Qty : ");
            qty = sc.nextInt();
        }while (qty <= 0);

        listPesan.add(new Pesan(nama,gula,harga,qty));

        return listPesan;
    }

    private static ArrayList<Pesan> bayar(ArrayList<Pesan> listPesan) {
        Scanner sc=new Scanner(System.in);
        totBayar = 0;
        System.out.println("----------------------------------------------------");
        System.out.printf("| %-10s | %-5s | %-7s | %-7s | %-7s |",
                "Nama",
                "Gula",
                "Harga",
                "Qty",
                "Jumlah" );
        System.out.println();
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < listPesan.size(); i++) {
            System.out.printf("| %-7s  | %-5s  | %-7s  | %-7s  | %-7s |",
                    listPesan.get(i).getNama(),
                    listPesan.get(i).getGula(),
                    listPesan.get(i).getHarga(),
                    listPesan.get(i).getQty(),
                    (listPesan.get(i).getHarga()*listPesan.get(i).getQty()));
            totBayar = totBayar+(listPesan.get(i).getHarga()*listPesan.get(i).getQty());
            System.out.println();
            System.out.println("----------------------------------------------------");

        }
        System.out.println("Total : "+totBayar);

        if(totBayar==0){
            System.out.println("Tekan Enter...");
            sc.nextLine();
        }

        return  listPesan;
    }

}
