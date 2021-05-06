package ru.geekbrains.lesson9;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException(int i, int j) {
        System.out.println("в ячейке " + i + ":" + j + " лежит не число");
    }
}
