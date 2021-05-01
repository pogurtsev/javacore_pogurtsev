package ru.geekbrains.lesson9;

public class HomeWork09 {

    public static void main(String[] args) {

        String[][] array1 = {
                {"00", "01", "02", "03",},
                {"10", "11", "12", "13",},
                {"20", "21", "22", "23",},
                {"30", "31", "32", "33",},
        };

        try {
            getSumOfSells(array1);
        } catch (MyArraySizeException mase) {
            System.out.println("MyArraySizeException: " + mase.getMessage());
        } catch (MyArrayDataException made) {
            System.out.println("MyArraySizeException: " + made.getMessage());
        }
    }

    public static void getSumOfSells(String[][] array) throws MyArrayDataException, MyArraySizeException {
        if (array.length != 4) throw new MyArraySizeException();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) throw new MyArraySizeException();
            for (int j = 0; j < array[i].length; j++) {
                try {
                    int a = Integer.parseInt(array[i][j]);
                    sum += a;
                } catch (NumberFormatException nfe) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Сумма чисел в ячейках = " + sum);
    }
}
