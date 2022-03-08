package com.company;

public class Main {

    private static int pangkat(int a, int b) {

        int hasil = a;
        for (int i = 0; i < b-1; i++) {
            hasil *= a;
        }
        return hasil;
    }

    public static void main(String[] args) {
        System.out.println(pangkat(2, 3)); // 8
        System.out.println(pangkat(5, 3)); // 125
        System.out.println(pangkat(10, 2)); // 100
        System.out.println(pangkat(2, 5)); // 32
        System.out.println(pangkat(7, 3)); // 343
    }

}