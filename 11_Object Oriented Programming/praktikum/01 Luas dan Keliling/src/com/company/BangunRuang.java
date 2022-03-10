package com.company;

public class BangunRuang {

    private int sisi;

    // Constructor
    BangunRuang (int sisi_input) {
        sisi = sisi_input;
    }

    public int getSisi() {
        return sisi;
    }

} // BangunDatar

class Kubus extends BangunRuang {

    Kubus(int sisi_input) {
        super(sisi_input);
    }

    public int getVolume() {
        return getSisi()*getSisi()*getSisi();
    }

} // Persegi

class Balok extends BangunDatar {

    private int panjang;
    private int lebar;
    private int tinggi;

    Balok(int panjang_input, int lebar_input, int tinggi_input) {
        super(0);
        panjang = panjang_input;
        lebar = lebar_input;
        tinggi = tinggi_input;
    }

    public double getVolume() {
        return panjang * lebar * tinggi;
    }

} // Segitiga

class Tabung extends BangunDatar {

    private int radius;
    private int tinggi;

    Tabung(int radius_input, int tinggi_input) {
        super(0);
        radius = radius_input;
        tinggi = tinggi_input;
    }

    public double getVolume() {
        return 3.14 * radius * radius * tinggi;
    }

} // Persegi Panjang

