package ru.geekbrains.chat.server.core;

import ru.geekbrains.chat.common.Library;
import ru.geekbrains.network.SocketThread;
import ru.geekbrains.network.SocketThreadListener;

import java.net.Socket;

public class ClientThread extends SocketThread {

    private String nickname;
    private boolean isAuthorized;
    private boolean isReconnecting;

    public ClientThread(SocketThreadListener listener, String name, Socket socket) {
        super(name, listener, socket);
    }

    public boolean isReconnecting() {
        return isReconnecting;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    void reconnect() {
        isReconnecting = true;
        close();
    }

    void authAccept(String nickname) {
        isAuthorized = true;
        this.nickname = nickname;
        sendMessage(Library.getAuthAccept(nickname));
    }

    void authFail() {
        sendMessage(Library.getAuthDenied());
        close();
    }

    void msgFormatError(String msg) {
        sendMessage(Library.getMsgFormatError(msg));
        close();
    }

}
