package com.company;

public class Main {

    public static void main(String[] args) {

        int input = 5;

        for (int i = 0; i < input; i++) {

            for (int j = i; j > 0 ; j--) {
                System.out.printf(" ");
            }

            for (int j = input-i; j > 0; j--) {
                System.out.printf("* ");
            }
            System.out.println();
        }

        for (int i = 2; i < input+1; i++) {

            for (int j = i; j < input ; j++) {
                System.out.printf(" ");
            }

            for (int j = input-i; j < input; j++) {
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}
