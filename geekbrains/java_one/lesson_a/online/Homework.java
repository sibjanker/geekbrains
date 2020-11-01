package ru.geekbrains.java_one.lesson_a.online;
import java.util.GregorianCalendar;
import java.security.PublicKey;
import java.time.DateTimeException;
import java.util.Arrays;

public class Homework {

//}
    public static void main(String[] args) {}

    private static void work1 (String[] args){
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        //1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));}


        private static void work2(String[] args){
        int[] arr2 = new int[8];
        int j = 1;
        for (int i = 0; i < arr2.length; i++, j = j + 3) {
            arr2[i] = j;
        }
        System.out.println(Arrays.toString(arr2));}



    private static void work3(String[] args){
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print(Arrays.toString(arr3));
        System.out.print(" - ");

        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6 ) arr3[i] = arr3[i]*2;
        }
        System.out.println(Arrays.toString(arr3));}



    private static void work4 (String[] args){
        int[] numbers = {-9, 6, 0, -59};
        int max = numbers[0];
        int min = numbers[0];
        for(int k = 0; k < numbers.length; k++){
            if(max<numbers[k])
                max = numbers[k];
            }for(int k = 0; k < numbers.length; k++) {
            if (min > numbers[k])
                min = numbers[k];
        }
        System.out.println(max);
        System.out.println(min);
    }
}