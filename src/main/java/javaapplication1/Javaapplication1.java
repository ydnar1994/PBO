package javaapplication1;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Javaapplication1 {
    public static void main(String[]args){
        Hewan h= new Hewan();

        h.setTelinga("Panjang");
        System.out.println(h.getTelinga());

        System.out.println(h.bermain("Bola"));
    }
}
