package com.company;

public class Main {

    private static void cetakTablePerkalian(int n) {

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j < 10; j++) {
                int bilangan = i*j;
                if ( bilangan < 10 ) {
                    System.out.printf("%d  ", bilangan);
                } else {
                    System.out.printf("%d ", bilangan);
                } // else
            } // for
            System.out.println();
        } // for

    }
    public static void main(String[] args) {
        cetakTablePerkalian(3);
        // 1 2 3 4567 8 9
        // 2 4 6 10 12 14 16 18
        // 3 9. 12 15 18 21 24 27
        // 4 8 12 16 20 24 28 32 36
        // 5 10 15 20 25 30 35 40 45
        // 6 12 18 24 30 36 42 48 54
        // 7 14 21 28 35 42 49 56 63
        // 8 16 24 32 40 48 56 64 72
        // 9 18 27 36 45 54 63 72 81
    }
}
