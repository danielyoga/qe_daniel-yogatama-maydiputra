package com.company;

public class Main {

    public static void main(String[] args) {

        String test = "ABCD";

        int[] coba_a_ascii = new int[test.length()];

        for (int i = 0; i < test.length(); i++) {
            char current_char = test.charAt(i);
//            System.out.println(current_char);
            int asciinya = (int) current_char;
//            System.out.println(asciinya);
            coba_a_ascii[i] = asciinya;
        }

//        int len_coba = coba_a_ascii.length;
        for (int i = 0; i < coba_a_ascii.length; i++) {
            System.out.println(coba_a_ascii[i]);
        }
    }
}
