package com.company;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> AL1 = new ArrayList();
        ArrayList<Integer> MunculSekali = new ArrayList();
        AL1.add(1);
        AL1.add(1);
        AL1.add(2);
        AL1.add(2);

        for (Integer num:AL1) {
            if ( AL1.indexOf(num) == AL1.lastIndexOf(num) ) {
                MunculSekali.add(num);
            }
        }
        System.out.println(MunculSekali);
    }
}


//        AL1.add(7);
//                AL1.add(6);
//                AL1.add(5);
//                AL1.add(2);
//                AL1.add(3);
//                AL1.add(7);
//                AL1.add(5);
//                AL1.add(2);