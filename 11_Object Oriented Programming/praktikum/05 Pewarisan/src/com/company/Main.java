package com.company;

public class Main {

    public static void main(String[] args) {

        Animals Binatang1 = new Animals("","","");
        System.out.println(Binatang1.identify_myself());

        Herbivor Kambing = new Herbivor("Kambing", "Tumbuhan","tumpul");
        Carnivor Singa = new Carnivor("Singa", "Daging","Tajam");
        Omnivor Ayam = new Omnivor("Ayam", "Semua","tumpul");

        System.out.println(Kambing.identify_myself());
        System.out.println(Singa.identify_myself());
        System.out.println(Ayam.identify_myself());
    }
}
