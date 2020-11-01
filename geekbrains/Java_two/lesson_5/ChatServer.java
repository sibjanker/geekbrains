package ru.geekbrains.java_two.lesson_e.online;

public class ChatServer {
    private ServerSocketThread server = null;
    public void start(int port) {
        if (server != null && server.isAlive()) {
            System.out.println("Server already started");
        } else {
            server = new ServerSocketThread("Chat server", 8189);
        }
    }

    public void stop() {
        if (server == null || !server.isAlive()) {
            System.out.println("Server is not running");
        } else {
            server.interrupt();
        }
    }
}
