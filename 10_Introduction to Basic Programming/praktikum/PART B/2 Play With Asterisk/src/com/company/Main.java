package com.company;

public class Main {

    private static void playWithAsterisk(int n) {

        for (int i = 1; i < n+1; i++) {

            for (int j = 0; j < n-i ; j++) {
                System.out.printf(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        playWithAsterisk(6);
    }
}

//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//* * * * * *