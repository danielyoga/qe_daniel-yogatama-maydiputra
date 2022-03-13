package com.company;

public class Main {

    public static void main(String[] args) {

        char input = 'P';
        input = Character.toUpperCase(input);

        int ascii = (int) input;
        if (ascii < 75) {
            ascii -= 64;
        } else if (ascii > 75) {
            ascii -= 65;
        } else if (ascii == 75) {
            ascii = 3;
        }

        int indexBaris = 0;
        int indexKolom = 0;

        if (ascii <= 5) {
            indexBaris = 1;
            indexKolom = ascii;
        } else if (ascii >= 6 && ascii <= 10) {
            indexBaris = 2;
            indexKolom = ascii - 5;
        } else if (ascii >= 11 && ascii <= 15) {
            indexBaris = 3;
            indexKolom = ascii - 10;
        } else if (ascii >= 16 && ascii <= 20) {
            indexBaris = 4;
            indexKolom = ascii - 15;
        } else if (ascii >= 21 && ascii <= 25) {
            indexBaris = 5;
            indexKolom = ascii - 20;
        }
        System.out.println(indexKolom + " " + indexBaris);

    }
}


//System.out.println(ascii);
//        System.out.println("Index Kolom : " + indexKolom);
//        System.out.println("Index Baris : " + indexBaris);