package ru.geekbrains.lesson10;

import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> phoneBook = new ArrayList<>();

    public void add(String name, String phone) {
        Person person = new Person(name, phone);
        phoneBook.add(person);
    }

    public ArrayList<String> get(String name) {
        ArrayList<String> requiredPerson = new ArrayList<>();
        for (int i = 0; i < phoneBook.size(); i++) {
            if (phoneBook.get(i).getName() == name) {
                requiredPerson.add(phoneBook.get(i).getPhone());
            }
        }
        return requiredPerson;
    }

}
