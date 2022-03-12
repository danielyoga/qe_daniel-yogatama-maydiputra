package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Mobil Mercy1 = new Mobil(4);

        Hewan kucing = new Hewan(0.1);
        Hewan gajah = new Hewan(6);

        Mercy1.tambahMuatan(kucing);
        Mercy1.tambahMuatan(gajah);

    }
}
