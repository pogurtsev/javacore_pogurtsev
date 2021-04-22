package ru.geekbrains.lesson7;

public class HomeWork07 {
    public static void main(String[] args) {

        Plate plate1 = new Plate(20);
        plate1.info();

        Cat[] cats = {
                new Cat("Barsik",5),
                new Cat("Mursik",7),
                new Cat("Vaska",9),
                new Cat("Murka",6),
        };
        for (Cat i : cats) {
            i.eat(plate1);
        }

        plate1.setFood(20);
        plate1.info();

        for (Cat i : cats) {
            i.eat(plate1);
        }

        System.out.println("It is " +plate1.getFood() +" of food had been left in the plate");
    }
}
