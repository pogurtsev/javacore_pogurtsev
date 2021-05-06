package ru.geekbrains.lesson12;

import java.util.Arrays;

public class ArrayProcessing {

    static final int HALF = ThreadTest.SIZE / 2;

    public static void oneThreadProcessing(float[] arr) throws InterruptedException {
        System.out.println("Starting... with 1 thread");
        long startTime = System.currentTimeMillis();
        Arrays.fill(arr, 1.0f);

        long time1 = (System.currentTimeMillis() - startTime);

        ArrayThread thread1 = new ArrayThread(arr, 0);
        thread1.start();
        thread1.join();

        long time2 = (System.currentTimeMillis() - time1 - startTime);

        System.out.println("Операция выполнена за " + (System.currentTimeMillis() - startTime) + " мс\nЗаполнение единицами " + time1 + " мс\nОбработка формулой " + time2 + " мс\n\n");
    }

    public static void twoThreadProcessing(float[] arr) throws InterruptedException {
        System.out.println("Starting... with 2 threads");
        long startTime = System.currentTimeMillis();
        Arrays.fill(arr, 1.0f);
        long time1 = (System.currentTimeMillis() - startTime);

        float[] arr1 = new float[HALF];
        System.arraycopy(arr, 0, arr1, 0, HALF);
        float[] arr2 = new float[HALF];
        System.arraycopy(arr, HALF, arr2, 0, HALF);
        long splitTime = (System.currentTimeMillis() - startTime - time1);

        ArrayThread thread1 = new ArrayThread(arr1, 0);
        ArrayThread thread2 = new ArrayThread(arr2, HALF);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        long processingTime = (System.currentTimeMillis() - startTime - time1 - splitTime);

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        long joinTime = (System.currentTimeMillis() - startTime - time1 - splitTime - processingTime);

        System.out.println("Операция выполнена за " + (System.currentTimeMillis() - startTime) + " мс\nЗаполнение единицами " + time1 + " мс\nРазбивка массива " +
                +splitTime + " мс\nОбработка формулой " + processingTime + " мс\nСклейка массива " + joinTime + " мс\n\n");
    }

}
