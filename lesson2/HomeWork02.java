package ru.geekbrains.lesson2;

public class HomeWork02 {

    //задание1
    public static void invertArray() {
        int[] numsToInvert = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printPlainArr(numsToInvert);
        for (int i = 0; i < numsToInvert.length; i++) {
            if (numsToInvert[i] == 1) {
                numsToInvert[i] = 0;
            } else {
                numsToInvert[i] = 1;
            }
        }
        printPlainArr(numsToInvert);
    }
    public static void printPlainArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println(System.lineSeparator());
    }

    //задание2
    public static void fillArray() {
        int[] arrToFill = new int[8];
        for (int i = 0; i < arrToFill.length; i++) {
            arrToFill[i] = i*3;
        }
        printPlainArr(arrToFill);
    }

    //задание3
    public static void changeArray() {
        int[] arrToChange = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        printPlainArr(arrToChange);
        for (int i = 0; i < arrToChange.length; i++) {
            if (arrToChange[i] < 6) {
                arrToChange[i] = arrToChange[i] *2;
            }
        }
        printPlainArr(arrToChange);
    }

    //задание4
    public static void fillDiagonal() {
        int size = 9;
        int[][] arrDiag = new int[size][size];
        for (int i = 0; i < arrDiag.length; i++) {
            arrDiag[i][i] = 1;
            arrDiag[i][arrDiag.length - i - 1] = 1;
        }
        printSquareArr(arrDiag);
    }
    public static void printSquareArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println(System.lineSeparator());
    }

    //задание5
    public static void findMaxMin() {
        int[] minMaxArr = {2, 8, 345, 0, 11, 7, 50, 5, 2, -10, -4, 8, 9, 1};
        printPlainArr(minMaxArr);
        int min = minMaxArr[0];
        int max = minMaxArr[0];
        for (int i : minMaxArr) {
            if (min > i) min = i;
            if (max < i) max = i;
        }
        System.out.println("Min = " + min + ", Max = " + max + System.lineSeparator());
    }

    public static void main(String[] args) {

        System.out.println("Задание1");
        invertArray();

        System.out.println("Задание2");
        fillArray();

        System.out.println("Задание3");
        changeArray();

        System.out.println("Задание4");
        fillDiagonal();

        System.out.println("Задание5");
        findMaxMin();

    }

}
