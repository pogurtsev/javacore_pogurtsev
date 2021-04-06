package ru.geekbrains.lesson6;

public class HomeWork06 {
    public static void main(String[] args) {
        Animal[] animals = {
        new Cat("Barsik"),
        new Cat("Murzik"),
        new Dog("Jackson"),
        new Dog("Bobik")
        };

        for (Animal i: animals) {
            i.run(20);
            i.swim(7);
        }

        System.out.println("There were " +Animal.countOfAnimals +" animals");
        System.out.println("There were " +Cat.countOfCats +" cats");
        System.out.println("There were " +Dog.countOfDogs +" dogs");
    }
}
