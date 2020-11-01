package ru.geekbrains.java_one.lesson_c.online;

import java.util.Arrays;

public class OnlineWork {
    private static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                arr[i] = 1;
//            } else {
//                arr[i] = 0;
//            }

//            arr[i] ^= 1;

            arr[i] = 1 - arr[i];
        }
    }

    //i   0 1 2 3 4 5 ...
    //i+1 1 2 3 4 5...
    //i*3 0 3 6 9 12...
    private static void fillValues(int[] arr, int shift, int step) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * step + shift;
        }
    }

    private static void multiplier(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    private static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // very bad idea
    private static int findMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    private static void diagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - i - 1] = 1;
        }
    }

    public static void main(String[] args) {
        // 1 Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Before: ");
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.print("After:  ");
        System.out.println(Arrays.toString(arr));

        // 2 Задать пустой целочисленный массив размером 8.
        // Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        int[] ar0 = new int[18];
        fillValues(ar0, 1, 3);
        System.out.print("After:  ");
        System.out.println(Arrays.toString(ar0));

        // 3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
        // написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        int[] ar1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Before: ");
        System.out.println(Arrays.toString(ar1));
        multiplier(ar1);
        System.out.print("After:  ");
        System.out.println(Arrays.toString(ar1));

        Arrays.sort(ar1);
        System.out.println(Arrays.toString(ar1));

        // 4 Задать одномерный массив.
        // Написать методы поиска в нём минимального и максимального элемента;
        System.out.println(findMin(ar1));
        System.out.println(findMax(ar1));

        // 5 * Создать квадратный целочисленный массив
        // (количество строк и столбцов одинаковое), заполнить его диагональные
        // элементы единицами, используя цикл(ы);
        int[][] ar2 = new int[10][10];
        diagonal(ar2);
        for (int y = 0; y < ar2.length; y++) {
            System.out.println(Arrays.toString(ar2[y]));
        }

        // 6 ** Написать метод, в который передается не пустой одномерный
        // целочисленный массив, метод должен вернуть true если в массиве есть место,
        // в котором сумма левой и правой части массива равны.
        // Примеры:
        System.out.println(checkBalance(1, 1, 1, 2, 1));
        System.out.println(checkBalance(2, 1, 1, 2, 1));
        System.out.println(checkBalance(10, 1, 2, 3, 4));

        // 7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен циклически сместить все элементы массива на n позиций
        // 8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
        System.out.print("Before: ");
        System.out.println(Arrays.toString(ar1));
        shift2(ar1, 3);
        System.out.print("After:  ");
        System.out.println(Arrays.toString(ar1));
    }

    private static boolean checkBalance(int... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) return false;
        int left = 0;
        for (int i = 0; i < arr.length; i++) {
            left += arr[i];
            sum -= arr[i];
            if (sum == left) return true;
        }
        return false;
    }

    private static void shift(int[] arr, int value) {
        boolean dir = value < 0;
        if (dir) value = -value;

        value %= arr.length;
        int lastIndex = arr.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (dir) ? arr[0] : arr[lastIndex];
            if (dir) {
                System.arraycopy(arr, 1, arr, 0, lastIndex);
                arr[lastIndex] = temp;
            } else {
                System.arraycopy(arr, 0, arr, 1, lastIndex);
                arr[0] = temp;
            }
        }
    }

    private static void shift2(int[] arr, int value) {
        int shift = (arr.length + (value % arr.length)) % arr.length;

        for (int i = 0; i < shift; i++) {
            int temp = arr[arr.length - 1];
            System.arraycopy(arr, 0, arr, 1, arr.length - 1);
            arr[0] = temp;
        }
    }
}
