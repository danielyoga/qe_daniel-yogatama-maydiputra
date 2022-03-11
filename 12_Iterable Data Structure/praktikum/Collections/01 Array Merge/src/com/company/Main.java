package com.company;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> words1 = new ArrayList<String>();
        ArrayList<String> words2 = new ArrayList<String>();
        words1.add("Kazuya");
        words1.add("Jin");
        words1.add("Lee");
        words2.add("Kazuya");
        words2.add("Feng");
        Set<String> output = new HashSet<String>();

        for (String word:words1) {
            output.add(word);
        }
        for (String word:words2) {
            output.add(word);
        }
        System.out.println("Hasil");
        for (String word:output) {
            System.out.println(word);;
        }


    } // public static
} // Main
//words1.add("Kazuya");
//words1.add("Jin");
//words1.add("Lee");
//words2.add("Kazuya");
//words2.add("Feng");

//words1.add("Lee");
//words1.add("Jin");
//words2.add("Kazuya");
//words2.add("Panda");