package com.company;

public class Main {

    private static void DrawXYZ(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n+1; j++) {

                if ( j % 3 == 0 ) {
                    System.out.printf("X ");
                }
                else if ( j % 2 == 1 ) {
                    System.out.printf("Y ");
                }
                else if ( j % 2 == 0 ) {
                    System.out.printf("Z ");
                }

            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        DrawXYZ(3);
    }
}
