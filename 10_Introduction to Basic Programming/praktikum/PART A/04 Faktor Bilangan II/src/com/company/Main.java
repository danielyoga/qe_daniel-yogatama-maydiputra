package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanInput = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Input");
        int bilangan = scanInput.nextInt();

        System.out.println("Output");
        System.out.println(bilangan);
        for (int i = bilangan-1; i > 0; i--) {
            if ( bilangan % i == 0 ) {
                System.out.println(i);
            }
        }
    }
}