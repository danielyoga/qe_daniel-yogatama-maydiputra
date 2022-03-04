package com.company;

public class Main {

    private static boolean primeNumber(int number) {
        boolean prima = true;

        for (int i = 2; i < number; i++) {
            if ( number % i == 0 ) {
                prima = false;
                break;
            }
        }
        return prima;
    }
    public static void main(String[] args) {

        System.out.println(primeNumber (11)); // true
        System.out.println(primeNumber (13)); // true
        System.out.println(primeNumber (17)); // true
        System.out.println(primeNumber (20)); // false
        System.out.println(primeNumber(35)); // false
        System.out.println(primeNumber(50)); // false

    }
}
