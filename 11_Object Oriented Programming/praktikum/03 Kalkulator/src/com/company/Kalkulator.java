package com.company;

public class Kalkulator {

    private int namecode;
    Kalkulator() {
        namecode+=1;
    }

    public double penjumlahan (int a, int b) {
        return a+b;
    }

    public double pengurangan (int a, int b) {
        return a-b;
    }

    public double perkalian (int a, int b) {
        return a*b;
    }

    public double pembagian (int a, int b) {
        return a/b;
    }
}
