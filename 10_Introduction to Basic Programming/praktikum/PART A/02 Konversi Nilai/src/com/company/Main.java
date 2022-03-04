package com.company;

public class Main {

    public static void main(String[] args) {

        int StudentScore = 20;
        if ( StudentScore >= 80 && StudentScore <= 100) {
            System.out.println("A");
        }
        else if ( StudentScore >= 65 && StudentScore <= 79) {
            System.out.println("B+");
        }
        else if ( StudentScore >= 50 && StudentScore <= 64) {
            System.out.println("B");
        }
        else if ( StudentScore >= 35 && StudentScore <= 49) {
            System.out.println("C");
        }
        else if ( StudentScore >= 0 && StudentScore <= 34) {
            System.out.println("D");
        }
    }
}
