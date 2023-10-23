package org.example;

public class NotificationServer {
    //conect() -> Connection
    //authenticate(appId, key) -> AuthToken
    //send(authToken, message, target)
    //conn.disconnet()

    public Connection connect(String ipAdress) {
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending a message..." + message.toString());
    }
}
