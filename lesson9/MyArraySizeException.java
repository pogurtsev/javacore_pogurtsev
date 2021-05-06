package ru.geekbrains.lesson9;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    public MyArraySizeException() {
        System.out.println("Размер массива не соответствует 4х4");
    }
}
