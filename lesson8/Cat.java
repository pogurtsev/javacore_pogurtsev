package ru.geekbrains.lesson8;

public class Cat implements RunningAndJumping {
    private String name;
    private int maxDistToRun;
    private int maxMaxHeightToJump;

    public Cat(String name, int maxDistToRun, int maxMaxHeightToJump) {
        this.name = name;
        this.maxDistToRun = maxDistToRun;
        this.maxMaxHeightToJump = maxMaxHeightToJump;
    }

    @Override
    public boolean run(int distance) {
        if (distance < maxDistToRun) {
            System.out.println("Cat " + name + " ran distance of " + distance);
            return true;
        } else {
            System.out.println("Cat " + name + " couldn't run so far");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height < maxMaxHeightToJump) {
            System.out.println("Cat " + name + " jumped over the " + height + "-height wall");
            return true;
        } else {
            System.out.println("Cat " + name + " couldn't jump so high");
            return false;
        }
    }
}