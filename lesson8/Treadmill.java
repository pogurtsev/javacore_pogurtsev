package ru.geekbrains.lesson8;

public class Treadmill implements Obstacle {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public int getRank() {
        return distance;
    }
}
