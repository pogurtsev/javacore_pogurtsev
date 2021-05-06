package ru.geekbrains.lesson11;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void emptyInto(Box<T> other) {
        other.getFruits().addAll(fruits);
        fruits.clear();
    }

    public double getWeight() {
        if (fruits.size() == 0) return 0;
        return fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box<?> other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.001;
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }
}
