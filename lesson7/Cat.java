package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void eat(Plate p) {
        if (!fullness) {
            if (p.decreaseFood(appetite)) {
                System.out.println("Cat " + name + " ate " + appetite +" of food");
                fullness=true;
            } else {
                System.out.println("Cat " + name + " had not eat, not enough food");
            }
        }else{
            System.out.println("Cat " +name +" not hungry");
        }
    }
}
