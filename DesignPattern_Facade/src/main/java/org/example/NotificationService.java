package org.example;

public class NotificationService {
    public void send(String message, String target) {
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("198.126.0.8");
        AuthToken authToken = server.authenticate("01", "key01");
        //Message message = new Message("Hello World!");

        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
