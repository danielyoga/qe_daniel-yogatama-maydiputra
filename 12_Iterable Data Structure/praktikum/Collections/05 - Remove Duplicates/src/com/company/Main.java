package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> AL1 = new ArrayList<Integer>();
        AL1.add(2);
        AL1.add(2);
        AL1.add(2);
        AL1.add(11);

        for (int i = 0; i < AL1.size()-1; i++) {
            int num = AL1.get(i);
            if ( AL1.indexOf(num) != AL1.lastIndexOf(num) ) {
                AL1.remove(AL1.lastIndexOf(num));
            }
        }
        System.out.println("Duplicates : " + AL1);
        System.out.println(AL1.size());
    }
}

//AL1.add(2);
//        AL1.add(3);
//        AL1.add(3);
//        AL1.add(3);
//        AL1.add(6);
//        AL1.add(9);
//        AL1.add(9);