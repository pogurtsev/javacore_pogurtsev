package ru.geekbrains.lesson12;

public class ArrayThread extends Thread {

    private float[] arr;
    private int startIndex;

    public ArrayThread(float[] arr, int startIndex) {
        this.arr = arr;
        this.startIndex = startIndex;
    }

    @Override
    public void run() {
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = (float) (this.arr[i] * Math.sin(0.2f + (i + startIndex) / 5) * Math.cos(0.2f + (i + startIndex) / 5) * Math.cos(0.4f + (i + startIndex) / 2));
        }
    }
}
