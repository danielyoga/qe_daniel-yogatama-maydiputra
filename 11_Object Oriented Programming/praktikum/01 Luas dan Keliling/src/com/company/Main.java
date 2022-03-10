package com.company;

public class Main {

    public static void main(String[] args) {

        Kubus Kubus1 = new Kubus(10);
        Balok Balok1 = new Balok(3,6,10);
        Tabung Tabung1 = new Tabung(7,10);

        System.out.println("Volume");
        System.out.println(Kubus1.getVolume());
        System.out.println(Balok1.getVolume());
        System.out.println(Tabung1.getVolume());


//        Persegi Persegi1 = new Persegi(4);
//        Segitiga Segitiga1 = new Segitiga(3,4);
//        PersegiPanjang PersegiPanjang1 = new PersegiPanjang(7,8);
//
//        System.out.println("Luas");
//        System.out.println(Persegi1.getLuas());
//        System.out.println(Segitiga1.getLuas());
//        System.out.println(PersegiPanjang1.getLuas());
//
//        System.out.println("Keliling");
//        System.out.println(Persegi1.getKeliling());
//        System.out.println(Segitiga1.getKeliling());
//        System.out.println(PersegiPanjang1.getKeliling());

    } // public static
} // class