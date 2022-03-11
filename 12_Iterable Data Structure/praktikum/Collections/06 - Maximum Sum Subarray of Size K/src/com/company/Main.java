package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> AL1 = new ArrayList<Integer>();
        ArrayList<Integer> current = new ArrayList<Integer>();

        AL1.add(2);
        AL1.add(3);
        AL1.add(4);
        AL1.add(1);
        AL1.add(5);

        int k = 2;
        int currentTotal = 0;
        int currentMax = 0;

        for (int i = 0; i < AL1.size()-k+1 ; i++) {

            for (int j = i; j < i+k ; j++) {
                currentTotal += AL1.get(j) ;
            }

            if (currentTotal > currentMax) {
                currentMax = currentTotal;
                current.clear();
                for (int j = i; j < i+k ; j++) {
                    current.add(AL1.get(j));
                }
            }
            currentTotal = 0;
        }

        System.out.println(current);
    }
}


//AL1.add(2);
//        AL1.add(1);
//        AL1.add(5);
//        AL1.add(1);
//        AL1.add(3);
//        AL1.add(2);