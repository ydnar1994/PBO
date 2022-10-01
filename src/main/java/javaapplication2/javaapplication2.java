package javaapplication2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class javaapplication2 {

    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        Integer pilih=0;
        Integer order=0;

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
            }
        }while (pilih != 3);
        /*ArrayList<HashMap> listMap=new ArrayList<HashMap>();
        HashMap map=new HashMap();
        map.put("satu",1);
        map.put("dua","Data String");
        map.put("tiga",true);
        map.put("empat",0.2);
        listMap.add(map);

        for (int i = 0; i < listMap.size(); i++){
            HashMap data = listMap.get(i);
            System.out.println("Data Integer : " + data.get("satu"));
            System.out.println("Data String : " + data.get("dua"));
            System.out.println("Data Boolean : " + data.get("tiga"));
            System.out.println("Data Decimal : " + data.get("empat"));
        }*/
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

        listPesan.add(new Pesan(nama,gula,harga,qty));

        return listPesan;
    }

    private static ArrayList<Pesan> bayar(ArrayList<Pesan> listPesan) {
        Scanner sc=new Scanner(System.in);

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
            System.out.printf(" | %-7s  | %-5s  | %-7s  | %-7s  | %-7s |",
                    listPesan.get(i).getNama(),
                    listPesan.get(i).getGula(),
                    listPesan.get(i).getHarga(),
                    listPesan.get(i).getQty(),
                    (listPesan.get(i).getHarga()*listPesan.get(i).getQty()));
            System.out.println();
            System.out.println("----------------------------------------------------");

        }
        System.out.println("Tekan Enter...");
        sc.nextLine();

        return  listPesan;
    }

}
