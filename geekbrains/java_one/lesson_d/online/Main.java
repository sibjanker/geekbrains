package ru.geekbrains.java_one.lesson_d.online;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Barsik", "White", 3);

        System.out.printf("Cat %s, %s, age: %d\n",
                c.getName(), c.getColor(), c.getAge());

        Cat c0 = new Cat("Black", 5);
        c0.setName("Murzik");

        System.out.printf("Cat %s, %s, age: %d\n",
                c0.getName(), c0.getColor(), c0.getAge());

    }
}
