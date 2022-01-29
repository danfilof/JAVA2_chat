package server;

import java.net.Socket;

public class ClientHandler {
    private final Socket socket;
    private final ChatServer chatServer;
    private String nick;

    public ClientHandler(Socket socket, ChatServer chatServer) {
        this.socket = socket;
        this.chatServer = chatServer;
    }

    public String getNick() {
        return nick;
    }
}
