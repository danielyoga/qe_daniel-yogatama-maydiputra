package com.company;

public class Main {

    private static float Mean(float[] numbers) {
        float mean = 0.0f;
        for (int i = 0; i < numbers.length; i++) {
            mean += numbers[i];
        }
        mean /= numbers.length;
        return mean;
    }

    public static void main(String[] args){
        float[] value = {1, 2, 3, 4};
        System.out.println(Mean(value)); // 2.5
    }

}
