package com.company;

public class Main {

    public static void main(String[] args) {

        String input = "robot";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char lowerCurrent = Character.toLowerCase(currentChar);
            if ( lowerCurrent == 'a' || lowerCurrent == 'i' || lowerCurrent == 'u' || lowerCurrent == 'e') {
                System.out.printf(".");
            }
            if ( lowerCurrent == 'o' ) {
                System.out.printf("-");
            }
        }
    }
}
