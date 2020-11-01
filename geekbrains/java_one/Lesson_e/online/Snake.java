package ru.geekbrains.java_one.lesson_e.online;

public class Snake extends Animal {
    public Snake(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    void voice() {
        System.out.println("Listen to me, Banderlogs");
    }

    @Override
    void move() {
        System.out.println(name + " crawls");
    }
}
