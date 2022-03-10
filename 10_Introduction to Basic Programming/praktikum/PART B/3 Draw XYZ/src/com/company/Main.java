package com.company;

public class Main {

    private static void DrawXYZ(int n) {
        for (int i = 1; i <= n+1; i++) {

            if (i%3 == 0) {
                System.out.println("X ");
            } else if (i%2 == 0) {
                System.out.print("Z ");
            } else if (i%2 != 0 ) {
                System.out.print("Y ");
            }

            if (i%n == 0) {
                System.out.println();
            }

        }
    }
    public static void main(String[] args) {
        DrawXYZ(5);
    }
}