package homeworks.homework2.client;

public interface ClientControllerImpl {
    void connect();
    void sendMessage(String message);
    void receiveMessage(String message);
    void disconnect();
}
