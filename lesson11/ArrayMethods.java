package ru.geekbrains.lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayMethods {

    public static <T> void changeIndexesInArray(T[] array, int i1, int i2) {
        T ind = array[i1];
        array[i1] = array[i2];
        array[i2] = ind;
    }

    public static <T> ArrayList<T> createArrListFromArray(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

}
