package javaoop02p11;

public class MainInheritance {
    public static void main(String[] args) {
        //mengambil class super dari class kendaraan:

        //kendaraan --- > Mobil
        //          --- > Motor
        System.out.println("----- M O B I L ----");
        Mobil mbl = new Mobil();

        //set menggunakan method dari class kendaraan
        //mbl.setBahanBakar("Bensin");
        //mbl.setJumlahRoda(4);

        //set menggunakan method dari class mobil
        mbl.setMerek("Honda");
        mbl.setSeri("Freed");
        mbl.setCc(1200);

        //get dari class kendaraan
        System.out.println("Berbahan bakar: " + mbl.getBahanBakar());
        System.out.println("Jumlah roda: " + mbl.getJumlahRoda());

        //get dari class mobil
        System.out.println("Merek: " + mbl.getMerek());
        System.out.println("Seri: " + mbl.getSeri());
        System.out.println("CC : " + mbl.getCc()+ " CC");

        System.out.println();
        System.out.println("----- M O T O R ----");
        Motor mtr = new Motor();

        //set menggunakan method dari class kendaraan
        //mtr.setBahanBakar("Bensin");
        //mtr.setJumlahRoda(2);

        //set menggunakan method dari class motor
        mtr.setJenis("Bebek");
        mtr.setMerek("Suzuki");
        mtr.setSeri("Address");
        mtr.setCc(110);

        //get dari class kendaraan
        System.out.println("Berbahan bakar: " + mtr.getBahanBakar());
        System.out.println("Jumlah roda: " + mtr.getJumlahRoda());

        //get dari class mobil
        System.out.println("Jenis: " + mtr.getJenis());
        System.out.println("Merek: " + mtr.getMerek());
        System.out.println("Seri: " + mtr.getSeri());
        System.out.println("CC : " + mtr.getCc()+ " CC");

    }
}
