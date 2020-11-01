package ru.geekbrains.java_one.lesson_b.online;

import java.util.Arrays;

public class Main {
    private static int power(int base, int sign) { //2, 5
        int result = 1;
        for (int i = 0; i < sign; i++) { //0 1 2 3 4
            result = result * base; // 2 4 8 16 32
        }
        return result;
    }

    private static void pythagoras() {
        for (int thisIsAVariable = 1; thisIsAVariable < 10; thisIsAVariable++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%3d", thisIsAVariable * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        int[][] ar2 = new int[3][4];
//        ar2[0][0] = 10;
//        int[][] ar3 = {
//                {1, 2, 3},
//                {2, 3, 4},
//                {3, 4, 10}
//        };
//        System.out.println(Arrays.deepToString(ar3));
//
        int[][] ar4 = new int[3][];
        ar4[0] = new int[2];
        ar4[1] = new int[5];
        ar4[2] = new int[3];

        for (int i = 0; i < ar4.length; i++) {
            System.out.println(ar4[i].length);
        }

        int[][] ar5 = {
                {1, 2},
                {2, 3, 4, 5, 6},
                {3, 4, 10}
        };

    }

    private static void arraysExample() {
        // arrays
        int[] bank = new int[5];
        bank[0] = 5;
        bank[1] = 10;
//        System.out.println(arr[5]);
        int[] collector = bank;
        collector[0] = 7;
        System.out.println(bank[0]);

        for (int i = 0; i < 5; i++) {
            bank[i] = i * 10;
        }
//        printArray(bank);

        int[] arr = {1, 2, 3, 4, 5};
//        printArray(arr);

        int[] ar2 = {1, 2, 3};
//        printArray(ar2);

        System.out.println(Arrays.toString(bank));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(ar2));
    }

    private static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    private static void countingCycleExample() {
        // cycles
        // for
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println(power(2, 10));
        System.out.println(power(6, 10));
        System.out.println(power(2, 15));
        System.out.println(power(3, 5));

        pythagoras();
    }

    private static void doWhileExample() {
        // do-while
        int i = 0;
        do {
            //request()
            System.out.print(i++ + " ");
        } while (i < 5); //while (!isRespond())
    }

    private static void whileExample() {
        // while
        int i = 0;
        while (i < 5) {
            System.out.print("i = " + i);
            System.out.println(" " + ++i + " is printed ");
        }
        System.out.println("Good bye!");
    }

    private static void switchExample() {
        // switch
        String name = "fedor";
        switch (name) {
            case "ivan":
                //more code
                System.out.println("letter sent to desk #5");
                break;
            case "fedor":
                System.out.println("letter sent to desk #2");
                break;
            case "petr":
                System.out.println("letter sent to desk #1");
                break;
            case "vasiliy":
                System.out.println("letter sent to desk #8");
                break;
            default:
                System.out.println("Unknown recipient");
        }
        System.out.println(name);
    }

    private static void selectExample() {
        //        (isPositive(-5)) ? "positive" : "negative")

        int a = 10;
        int b = 5;
        int c;
        if (a < b) {
            c = b;
        } else {
            c = a;
        }

        c = (a < b) ? b : a;

        System.out.println(c);
    }
}

