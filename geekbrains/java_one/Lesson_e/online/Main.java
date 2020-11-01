package ru.geekbrains.java_one.lesson_e.online;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("Barseek", "White", 3);
        Dog d = new Dog("Toozeek", "Black", 5);
        Bird b = new Bird("Cheejeek", "Yellow", 1, 10);
        Parrot p = new Parrot("Polly", "Rainbow", 2, 5);
        Snake s = new Snake("Kaa", "Brown", 10);

        Animal[] zoo = {c, d, b, p, s};
        for (int i = 0; i < zoo.length; i++) {
            zoo[i].move();
            zoo[i].voice();
            if (zoo[i] instanceof Bird) {
                Bird bird = (Bird) zoo[i];
                bird.fly();
            }
            if (zoo[i] instanceof Parrot) {
                ((Parrot) zoo[i]).speak();
            }
        }


    }

    private static void typecastExample() {
        //typecast
        byte b = 100;
        int i = 511;
        byte b0 = (byte) i;

        System.out.println(b0);
    }
}
