package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Input");

        int bilangan = scanInput.nextInt();
        System.out.println("Output");
        for (int i = 1; i < bilangan; i++) {
            if ( bilangan % i == 0 ) {
                System.out.println(i);
            }
        }
        System.out.println(bilangan);
    }
}
