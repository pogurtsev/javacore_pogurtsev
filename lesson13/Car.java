package ru.geekbrains.lesson13;

import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable {
    private static AtomicInteger winnerCount = new AtomicInteger(0);
    private static int CARS_COUNT;
    private Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }

    @Override
    public void run() {
        try {
            System.out.println(this.name + " готовится");
            Thread.sleep(500 + (int) (Math.random() * 800));
            System.out.println(this.name + " готов");
            MainClass.BARRIER.await();
            for (int i = 0; i < race.getStages().size(); i++) {
                race.getStages().get(i).go(this);
            }

            synchronized (race.getMonitor()) {
                if (winnerCount.getAndIncrement() == 0) {
                    System.out.println("У нас есть победитель:  " + this.name);
                } else {
                    System.out.println(this.name + " пришел " + winnerCount.get() + "м!");
                }
            }
            MainClass.BARRIER.await();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}