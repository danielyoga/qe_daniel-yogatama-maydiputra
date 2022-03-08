package com.company;

public class Main {

    private static boolean palindrome(String value) {
        boolean palindrome = true;

        int len = value.length()-1;
        int mid = len/2;
        int j = len;
        for (int i = 0; i < mid; i++) {
            char kiri = value.charAt(i);
            char kanan = value.charAt(j);
            if ( kiri != kanan ) {
                palindrome = false;
                break;
            }
            j--;
        }
        return palindrome;
    }

    public static void main(String[] args) {

        System.out.println(palindrome("civic")); // true
//        System.out.println(palindrome("katak")); // true
//        System.out.println(palindrome("kasur rusak")); // true
//        System.out.println(palindrome("kupu-kupu")); // false
//        System.out.println(palindrome("lion")); // false
    }
}
//            System.out.printf("Kiri : %c    ", kiri);
//            System.out.printf("Kanan : %c\n", kanan);