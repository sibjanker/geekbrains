package ru.geekbrains.java_one.lesson_d.online;

import java.util.Calendar;

public class Cat {
    private static final int CURRENT_YEAR = 2020;

    private String name;
    private String color;
    private int birthYear;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return Calendar.getInstance().get(Calendar.YEAR) - birthYear;
    }

    private void setAge(int age) {
        this.birthYear = Calendar.getInstance().get(Calendar.YEAR) - age;
    }

    Cat() {
        System.out.println("Hello, kitty!");
    }

    private Cat(int age) {
        setAge(age);
    }

    public Cat(String name, String color, int age) {
        this(age);
        this.name = name;
        this.color = color;
    }

    Cat(String color) {
        this(0);
        this.color = color;
    }

    Cat(String color, int age) {
        this(age);
        this.color = color;
    }

    void jump() {
        if (getAge() < 5) {
            System.out.println(name + " jumps");
        }
    }

    void voice() {
        System.out.println(name + " meows");
    }
}
