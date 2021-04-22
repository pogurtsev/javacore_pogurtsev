package ru.geekbrains.lesson10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class HomeWork10 {

    public static void main(String[] args) {
        String[] wordsArray = {
                "one", "road", "leads", "to", "London",
                "one", "road", "leads", "to", "Wales",
                "my", "road", "leads", "me", "seawards",
                "to", "the", "white", "dipping", "sails"};

        TreeSet<String> getWords = new TreeSet<>(Arrays.asList(wordsArray));
        System.out.println(getWords);

        HashMap<String, Integer> mapWords = new HashMap<>();
        for (int i = 0; i < wordsArray.length; i++) {
            String word = wordsArray[i];
            mapWords.put(word, mapWords.getOrDefault(word, 0) + 1);
        }
        System.out.println(mapWords);

        Phonebook phonebook = new Phonebook();
        phonebook.add("Petrov", "phoneNumber1");
        phonebook.add("Petrov", "phoneNumber2");
        phonebook.add("Ivanov", "phoneNumber3");
        phonebook.add("Sidorov", "phoneNumber4");
        phonebook.add("Sidorov", "phoneNumber5");

        System.out.println("phone Petrov: " + phonebook.get("Petrov"));
        System.out.println("phone Ivanov: " + phonebook.get("Ivanov"));
        System.out.println("phone Sidorov: " + phonebook.get("Sidorov"));
    }
}
