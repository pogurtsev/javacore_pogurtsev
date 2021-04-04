package ru.geekbrains.lesson1;

public class MainApp {

    // задание 1
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        // задание 2
        // примитивные переменные
        byte valByte = 20;
        System.out.println("byte = " +valByte);

        short valShort = 1024;
        System.out.println("short = " +valShort);

        int valInt = 100;
        System.out.println("int= " +valInt);

        long valLong = 8035486L;
        System.out.println("long = " +valLong);

        float valFloat = 23.32f;
        System.out.println("float = " +valFloat);

        double valDouble = 45.54;
        System.out.println("double = " +valDouble);

        char ch = 'R';
        System.out.println("char = " +ch);

        boolean bul = true;
        System.out.println("boolean = " +bul);

        //ссылочные переменные
        String str1 = "This is string I wrote";
        System.out.println("String = " +str1);

        // задание 3
        float a = 3.14f, b = 30.12f, c = 50.50f, d = 10.10f;
        System.out.println("Результат вычисления 3.14 * (30.12 + (50.50 / 10.10)) = " +countFloats(a, b, c, d));

        // задание 4
        System.out.println("Cумма 12+3 в пределах от 10 до 20 = " +checkSumm (12, 3));

        // задание 5
        checkPositNegat (-8);

        // задание 6
        System.out.println("Число -8 отрицательное? = " +ifNumIsNegative (-8));

        // задание 7
        String name1 = "Алибабаевич";
        greetingName (name1);

        // задание 8
        int yearToCheck = 1703;
        if (chkLeapYear(yearToCheck)){
            System.out.println("Год " +yearToCheck +" високосный");
        }else {
            System.out.println("Год " +yearToCheck +" не високосный");
        }

    }

    // задание 3
    public static float countFloats (float a, float b, float c, float d){
        return a * (b + (c / d));
    }

    // задание 4
    public static boolean checkSumm (int a, int b){
        int c = a + b;
        return (c>=10 && c<=20);
    }

    // задание 5
    public static void checkPositNegat (int a){
        if (a<0){
            System.out.println("Число а = отрицательное (" +a +")");
        }else {
            System.out.println("Число а = положительное (" +a +")");
        }
    }

    // задание 6
    public static boolean ifNumIsNegative (int a){
        return a<0;
    }

    // задание 7
    public static void greetingName (String name){
        System.out.println("Привет, " +name +"!");
    }

    // задание 8
    public static boolean chkLeapYear (int year){
        boolean leapYear = false;
        if(year % 4 == 0){
            leapYear = true;
        }
        if(year % 100 == 0){
            leapYear = false;
        }
        if(year % 400 == 0){
            leapYear = true;
        }
        return leapYear;
    }

}
