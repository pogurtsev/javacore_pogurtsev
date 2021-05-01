package ru.geekbrains.lesson12;

import java.util.Arrays;

public class ThreadTest {

    static final int SIZE = 10_000_000;

    public static void main(String[] args) {

        float[] arr1 = new float[SIZE];
        float[] arr2 = new float[SIZE];

        try {
            ArrayProcessing.oneThreadProcessing(arr1);
            ArrayProcessing.twoThreadProcessing(arr2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.equals(arr1, arr2));

    }
}
