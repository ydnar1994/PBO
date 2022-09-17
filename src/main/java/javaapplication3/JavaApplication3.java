package javaapplication3;

public class JavaApplication3 extends Aritmatika {
    public static void main (String[] args){
        Integer nilai1=12;
        Integer nilai2=6;

        Integer nilaiTambah=pertambahan(nilai1,nilai2);
        System.out.println(nilai1+"+"+nilai2+"="+nilaiTambah);

        Integer nilaiKurang=pengurangan(nilai1,nilai2);
        System.out.println(nilai1+"-"+nilai2+"="+nilaiKurang);

        perkalian(nilai1,nilai2);
//        System.out.println(nilai1+"x"+nilai2+"="+nilaiKali);

        Integer nilaiBagi=pembagian(nilai1,nilai2);
        System.out.println(nilai1+":"+nilai2+"="+nilaiBagi);

    }
}

