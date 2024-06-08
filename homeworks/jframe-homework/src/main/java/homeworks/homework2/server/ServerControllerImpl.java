package homeworks.homework2.server;


import homeworks.homework2.client.ClientControllerImpl;

public interface ServerControllerImpl {
    void startServer();
    void stopServer();
    boolean isServerRunning();
    boolean isServerStopped();
    void broadcastMessage(String message, ClientControllerImpl sender);
    void logMessage(String message);
    void addClient(ClientControllerImpl client);
    void removeClient(ClientControllerImpl client);
}
