package com.company;

public class BangunDatar {

    private int sisi;

    // Constructor
    BangunDatar (int sisi_input) {
        sisi = sisi_input;
    }

    public int getSisi() {
        return sisi;
    }

} // BangunDatar

class Persegi extends BangunDatar {

    Persegi(int sisi_input) {
        super(sisi_input);
    }

    public int getLuas() {
        return getSisi()*getSisi();
    }

    public int getKeliling() {
        return getSisi() * 4;
    }

} // Persegi

class Segitiga extends BangunDatar {

    private int alas;
    private int tinggi;

    Segitiga(int alas_input, int tinggi_input) {
        super(0);
        alas = alas_input;
        tinggi = tinggi_input;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public int getKeliling() {
        return alas * tinggi;
    }
} // Segitiga

class PersegiPanjang extends BangunDatar {

    private int panjang;
    private int lebar;

    PersegiPanjang(int panjang_input, int lebar_input) {
        super(0);
        panjang = panjang_input;
        lebar = lebar_input;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public int getKeliling() {
        return 2*panjang + 2*lebar;
    }
} // Persegi Panjang

