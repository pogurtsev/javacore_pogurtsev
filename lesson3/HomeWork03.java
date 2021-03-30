package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class HomeWork03 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    static final int RANGE_OF_NUMBER = 10;
    static final int COUNT_ATTEMPTS = 3;


    public static void main(String[] args) {

        do{
            int numToGuess = makeSomeNum(RANGE_OF_NUMBER);

            for (int i = 0; i <= COUNT_ATTEMPTS; i++) {
                System.out.print("Enter the number from 0 to " +(RANGE_OF_NUMBER-1) +" > ");
                int userGuess = scan.nextInt();
                if(userGuess==numToGuess){
                    System.out.println("You guessed correctly! You win!");
                    break;
                }else if(userGuess<numToGuess){
                    System.out.println("You guessed lesser than hidden number. Try larger" +System.lineSeparator() + "Remain guesses: "+ (COUNT_ATTEMPTS-i));

                }else if(userGuess>numToGuess){
                    System.out.println("You guessed larger than hidden number. Try lesser" +System.lineSeparator() + "Remain guesses: "+ (COUNT_ATTEMPTS-i));
                }

                if(i==COUNT_ATTEMPTS){
                    System.out.println("You have no more attempts! You loose!");
                    break;
                }
            }

            System.out.print("Повторить игру еще раз? 1 – да / 0 – нет -> ");
        }while (scan.next().equals("1"));
        scan.close();
    }
    public static int makeSomeNum (int range){
        return rand.nextInt(range);
    }
}
