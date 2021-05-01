package ru.geekbrains.lesson11;

public class HomeWork11 {
    public static void main(String[] args) {
        String[] wordsArray = {"Richard", "Of", "York", "Gave", "Battle", "In", "Vain" };
        ArrayMethods.changeIndexesInArray(wordsArray, 2, 3);
        System.out.println(ArrayMethods.createArrListFromArray(wordsArray));

        Apple apple1 = new Apple();
        Orange orange1 = new Orange();
        System.out.println("Вес яблока: " + apple1.getWeight() +" Вес апельсина: "+ orange1.weight);

        Box<Apple> appleBox1 = new Box<>();
        for (int i = 0; i < 15; i++) {
            appleBox1.addFruit(new Apple());
        }
        Box<Apple> appleBox2 = new Box<>();
        for (int i = 0; i < 50; i++) {
            appleBox2.addFruit(new Apple());
        }
        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 10; i++) {
            orangeBox1.addFruit(new Orange());
        }
        Box<Orange> orangeBox2 = new Box<>();
        for (int i = 0; i < 50; i++) {
            orangeBox2.addFruit(new Orange());
        }

        System.out.println("Вес appleBox1: "+appleBox1.getWeight());
        System.out.println("Вес orangeBox1: " +orangeBox1.getWeight());
        System.out.println("Вес orangeBox2: " +orangeBox2.getWeight());

        System.out.println("Равен ли вес коробок appleBox1 и orangeBox1: " +appleBox1.compare(orangeBox1));

        orangeBox1.emptyInto(orangeBox2);
        System.out.println("Вес orangeBox1: " +orangeBox1.getWeight());
        System.out.println("Вес orangeBox2: " +orangeBox2.getWeight());
    }

}
