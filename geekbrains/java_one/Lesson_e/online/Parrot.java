package ru.geekbrains.java_one.lesson_e.online;

public class Parrot extends Bird {
    public Parrot(String name, String color, int age, int flyHeight) {
        super(name, color, age, flyHeight);
    }

    void speak() {
        System.out.println(name + " wanna cracker");
    }
}
