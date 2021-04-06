package ru.geekbrains.lesson6;

public class Cat extends Animal{
    static int countOfCats;
    public Cat(String name) {
        super("Cat", name, 200, 0);
        countOfCats++;
    }
}
