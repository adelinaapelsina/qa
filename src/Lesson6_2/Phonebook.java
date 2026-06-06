package Lesson6_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phonebook {
    private Map<String, List<String>> phonebook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        if (!phonebook.containsKey(surname)) {
            phonebook.put(surname, new ArrayList<>());
        }
        phonebook.get(surname).add(phoneNumber);
    }
    public List<String> get(String surname) {
        return phonebook.get(surname);
    }
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Апесинкин", "650650");
        phonebook.add("Апесинкин", "056056");
        phonebook.add("Мандаринкин", "182182");
        phonebook.add("Абрикоскин", "188188");
        phonebook.add("Ягодкин", "108108");

        System.out.println("Апесинкин: " + phonebook.get("Апесинкин"));
        System.out.println("Мандаринкин: " + phonebook.get("Мандаринкин"));
        System.out.println("Абрикоскин: " + phonebook.get("Абрикоскин"));
        System.out.println("Ягодкин" + phonebook.get("Ягодкин"));
    }
}
