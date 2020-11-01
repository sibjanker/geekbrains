package ru.geekbrains.java_one.lesson_a.home;

import ru.geekbrains.java_one.lesson_d.online.Cat;

/**
 * (пример Javadoc)
 * Домашняя работа №1.
 * Переменные, примитивы, условия, методы, перегрузка методов
 * Иван Игоревич Овчинников.
 * Создан: 2016.12.13
 * Обновлён: 2017.07.02
 */

public class Main {

    /*
     * Написать метод вычисляющий выражение a * (b + (c / d))
     * и возвращающий результат с плавающей точкой,
     * где a, b, c, d – целочисленные входные параметры этого метода
     */
    private static double calculate(int a, int b, int c, int d) {
        return a * (b + (c * 1.0 / d));
    }

    private static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    /*
     * Написать метод, принимающий на вход два целых числа, и
     * проверяющий что их сумма лежит в пределах от 10 до 20
     * (включительно), если да – вернуть true, в противном
     * случае – false
     */
    private static boolean checkTwoNumbers(int first, int second) {
        int sum = first + second;
        return sum <= 20 && sum >= 10;
    }

    /*
     * Написать метод, которому в качестве параметра передается
     * целое число, метод должен проверить положительное ли число
     * передали, или отрицательное. Замечание: ноль считаем
     * положительным числом. Результат работы метода вывести в консоль
     */
    private static boolean isPositive(int variable) {
        return variable >= 0;
    }

    /*
     * Написать метод, которому в качестве параметра
     * передается строка, обозначающая имя, метод должен
     * вернуть приветственное сообщение «Привет, переданное_имя!»;
     * Вывести приветствие в консоль
     */
    private static String welcome(String name) {
        System.out.println("Привет, указанное_имя!");
        return "Привет, " + name + "!";
    }

    /*
     * Написать метод, который определяет является ли год високосным.
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный. Для проверки работы
     * вывести результаты работы метода в консоль
     */
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        Cat c;
        c = new Cat("Barsik", "White", 3);

        // Просто созданные переменные
        final int varOne = 1;
        final int varTwo = 2;
        final int varThree = 3;
        final int varFour = 4;

        // Переменные в "венгерской нотации", перед именем переменной
        // строчной буквой обозначен её тип
        final float fOne = 1f;
        final float fTwo = 2f;
        final float fThree = 3f;
        final float fFour = 4.0f;

        System.out.println("Calculation from the first task gives us: " + calculate(varOne, varTwo, varThree, varFour));

        System.out.println("Overloaded method returns: " + calculate(fOne, fTwo, fThree, fFour));

        System.out.println("Does the sum of two given numbers fit the range? " + checkTwoNumbers(1, 15));

        System.out.println("Your number is " + ((isPositive(-5)) ? "positive" : "negative") + "!");

        System.out.println(welcome("Somename"));

        System.out.println("Is the given year leap? " + isLeapYear(0));
    }
}
