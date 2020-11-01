package ru.geekbrains.Java_two.lesson_6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SimpleClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("127.0.0.1", 8189);
            System.out.println("connected to server");
            DataInputStream in = new DataInputStream(s.getInputStream());
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            System.out.println("ready for exchange");
            out.writeUTF("Hello");
            String answer = in.readUTF();
            System.out.println(answer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
