package ru.geekbrains.lesson6;

public class Dog extends Animal{
    static int countOfDogs;
    public Dog (String name) {
        super("Dog", name, 500,10);
        countOfDogs++;
    }
}
