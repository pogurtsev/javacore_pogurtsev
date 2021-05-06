package ru.geekbrains.lesson8;

public class HomeWork08 {
    public static void main(String[] args) {
        RunningAndJumping[] competitors = {
                new Human("Alex", 2000, 180),
                new Human("Grigory", 5000, 200),
                new Cat("Barsik", 900, 150),
                new Cat("Murzik", 500, 170),
                new Robot("Rob01", 3000, 500),
                new Robot("Rob02", 350, 100),
        };

        Obstacle[] obstacles = {
                new Treadmill(300),
                new Wall(100),
                new Treadmill(500),
                new Wall(160),
                new Treadmill(1000),
                new Wall(190),
                new Treadmill(2500),
                new Wall(220),
        };

        for (RunningAndJumping i : competitors) {
            for (Obstacle j : obstacles) {
                if (j instanceof Treadmill) {
                    if (!i.run(j.getRank())) break;
                }
                if (j instanceof Wall) {
                    if (!i.jump(j.getRank())) break;
                }
            }

        }
    }
}