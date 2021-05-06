package ru.geekbrains.lesson13;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private ArrayList<Stage> stages;
    private Object monitor;

    public ArrayList<Stage> getStages() {
        return stages;
    }

    public Object getMonitor() {
        return monitor;
    }

    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        this.monitor = new Object();
    }
}

