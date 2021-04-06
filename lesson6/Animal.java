package ru.geekbrains.lesson6;

public class Animal {
    private String typeOfAnimal;
    private String name;
    private int maxDistanceToRun;
    private int maxDistanceToSwim;
    static int countOfAnimals;

    public Animal(String typeOfAnimal, String name, int maxDistanceToRun, int maxDistanceToSwim) {
        this.typeOfAnimal = typeOfAnimal;
        this.name = name;
        this.maxDistanceToRun = maxDistanceToRun;
        this.maxDistanceToSwim = maxDistanceToSwim;
        countOfAnimals++;
    }

    public void run (int distanceToRun){
        if(maxDistanceToRun==0){
            System.out.println(typeOfAnimal +" " +name +" cannot run at all");
        }else {
            if (distanceToRun <= maxDistanceToRun) {
                System.out.println(typeOfAnimal +" " +name + " ran distance of " + distanceToRun);
            } else {
                System.out.println(typeOfAnimal +" " +name + " couldn't run distance of " + distanceToRun + ", it's too far");
            }
        }
    }

    public void swim(int distanceToSwim) {
        if(maxDistanceToSwim==0){
            System.out.println(typeOfAnimal +" " +name +" cannot swim at all");
        }else {
            if (distanceToSwim <= maxDistanceToSwim) {
                System.out.println(typeOfAnimal +" " +name + " swam distance of " + distanceToSwim);
            } else {
                System.out.println(typeOfAnimal +" " +name + " couldn't swim distance of " + distanceToSwim + ", it's too far");
            }
        }
    }
}
