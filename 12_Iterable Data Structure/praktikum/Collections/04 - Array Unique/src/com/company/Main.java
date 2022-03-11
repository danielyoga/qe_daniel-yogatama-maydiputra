package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> Array_A = new ArrayList<Integer>();
        ArrayList<Integer> Array_B = new ArrayList<Integer>();
        ArrayList<Integer> NoDuplicate = new ArrayList<Integer>();

        Array_A.add(3);
        Array_A.add(8);

        Array_B.add(2);
        Array_B.add(8);

        for ( Integer num:Array_A ) {
            if ( !Array_B.contains(num) ) {
                NoDuplicate.add(num);
            }
        } // for
        System.out.println(NoDuplicate);
    }
}

//Array_A.add(1);
//        Array_A.add(2);
//        Array_A.add(3);
//        Array_A.add(4);
//
//        Array_B.add(1);
//        Array_B.add(3);
//        Array_B.add(5);
//        Array_B.add(10);
//        Array_B.add(16);