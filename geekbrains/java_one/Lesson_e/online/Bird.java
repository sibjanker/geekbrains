package ru.geekbrains.java_one.lesson_e.online;

public class Bird extends Animal {

    protected int flyHeight;

    Bird(String name, String color, int age, int flyHeight) {
        super(name, color, age);
        this.flyHeight = flyHeight;
    }

    @Override
    void voice() {
        System.out.println(name + " tweet");
    }

    void fly() {
        System.out.println(name + " flies on " + flyHeight + " m");
    }
}
