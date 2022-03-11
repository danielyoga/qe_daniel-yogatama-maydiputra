package com.company;

import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> Set1 = new ArrayList();
        Set1.add(2);
        Set1.add(5);
        Set1.add(9);
        Set1.add(11);
        int target =11;

        for (int i = 0; i < Set1.size()-2; i++) {

            for (int j = i+1; j < Set1.size() - 1; j++) {

                int a = Set1.get(i);
                int b = Set1.get(j);
                if (a+b == target) {
                    System.out.printf("[%d,%d]", i,j);
                    break;
                }
            }
        }

    }
}

//Set1.add(1);
//        Set1.add(2);
//        Set1.add(3);
//        Set1.add(4);
//        Set1.add(6);