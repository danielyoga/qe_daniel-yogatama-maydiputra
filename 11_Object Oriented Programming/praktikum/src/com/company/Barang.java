package com.company;

public class Barang {

    private int panjang;
    private int lebar;
    private int tinggi;
    private int berat;

    Barang (int input_panjang, int input_lebar, int input_tinggi, int input_berat) {
        panjang = input_panjang;
        lebar = input_lebar;
        tinggi = input_tinggi;
        berat = input_berat;
    } // Barang

    public int getOngkir() {
        int volume = panjang * lebar * tinggi;

        if ( volume <= 50 || berat <= 1 ) {
           return 5000;
        } else {
            return berat * 5000;
        }
    }

} // Barang Class
