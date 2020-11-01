package ru.geekbrains.java_one.lesson_e.home;

public class Cat extends Animal{

    Cat(String name) {
        super("Cat", name, 2, 200, 1);
    }

    @Override
    protected int swim(float distance) {
        return Animal.SWIM_WTF;
    }
}
