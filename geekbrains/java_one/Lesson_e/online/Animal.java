package ru.geekbrains.java_one.lesson_e.online;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    abstract void voice();

    void move() {
        System.out.println(name + " walks on paws");
    }
}
