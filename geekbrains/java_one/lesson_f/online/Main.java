package ru.geekbrains.java_one.lesson_f.online;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Scanner;

public class Main {

    private static int div(int a, int b) {
        return a / b;
    }

    private static void openFile(String name) {
        // if (file == null)
        FileNotFoundException ex = new FileNotFoundException("No such file or directory");
        try {
            throw ex;
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

    private static void writeFile() throws IOException {
        throw new IOException("write failed");
    }

    public static void main(String[] args) {
//        exceptionsExample();
//        writeFile();
        // Input/output (file streams)
        InputStream in;
        OutputStream out;
        try {
            FileOutputStream fos = new FileOutputStream("test.txt", true);
            //byte[] bytes = {'H', 'e', 'l', 'l', 'o'};
            fos.write("Hello world\n".getBytes());
            fos.close();

            PrintStream ps = new PrintStream(new FileOutputStream("test.txt", true));
            ps.println("This is a printstream");
            ps.close();

            FileInputStream fis = new FileInputStream("test.txt");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            System.out.println(fis.read());
            fis.close();

            Scanner scanner = new Scanner(new FileInputStream("test.txt"));
            while (scanner.hasNext()) {
                System.out.print(scanner.next());
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void exceptionsExample() {
        // ?Exception
        System.out.println("hello");
        //System.out.println(div(10, 0));
        ArrayIndexOutOfBoundsException e;
        int[] arr = {1,2,3};
        System.out.println(arr[5]);
    }

    private static void stringBuilderExample() {
        // String builder
        long timeStart = System.nanoTime();
        String s0 = "Example";
        for (int i = 0; i < 100_000; i++) {
            s0 += i; // s0 = s0 + i;
        }
        float deltaTime = (System.nanoTime() - timeStart) * 0.000001f;
        System.out.println(s0);
        System.out.println(deltaTime + " millisec");

        timeStart = System.nanoTime();
        StringBuilder s1 = new StringBuilder("Example");
        for (int i = 0; i < 100_000; i++) {
            s1.append(i); // s0 = s0 + i;
        }
        deltaTime = (System.nanoTime() - timeStart) * 0.000001f;
        System.out.println(s1);
        System.out.println(deltaTime + " millisec");

        System.out.println(s0.equals(s1.toString()));
    }

    private static void stringExample() {
        // Strings
        Scanner scanner = new Scanner(System.in);
        String s = new String("hello");
        String s0 = "hello";
        String s1 = "hello";
        String s2 = "he";
        String s3 = s2 + "llo";
        String s5 = "he" + "llo";
        String s4 = scanner.next();

        System.out.println(s0.equals(s1));
        System.out.println(s0.equals(s5));
        System.out.println(s0.equals(s3));
        System.out.println(s0.equals(s4));
    }
}
