package ru.geekbrains.Java_two.lesson_3;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class CollectionsHome {
    private static final String words =
            "And it all comes down to this " +
            "That a pig is a pig is a pig is a pig " +
            "Lie upon the lie " +
            "Lie upon the lie " +
            "Lie upon the lie " +
            "Lie upon the lie " +
            "Lie upon the lie ";

    private static TreeSet<String> getWords(String[] arr) {
        return new TreeSet<>(Arrays.asList(arr));
    }

    private static HashMap<String, Integer> getWordsCount(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getWords(words.toLowerCase().split(" ")));
        System.out.println(getWordsCount(words.toLowerCase().split(" ")));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "ivanov-phone-1", "ivanov-mail-1");
        phonebook.add("Petrov", "petrov-phone-1", "petrov-mail-1");
        phonebook.add("Ivanov", "ivanov-phone-2", "ivanov-mail-2");

        System.out.println("e-mail Ivanov: " + phonebook.getMails("Ivanov"));
        System.out.println("e-mail Petrov: " + phonebook.getMails("Petrov"));
        System.out.println("phone Ivanov: " + phonebook.getPhones("Ivanov"));
        System.out.println("phone Petrov: " + phonebook.getPhones("Petrov"));
    }

}
