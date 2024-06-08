package homeworks.homework2.server;


import homeworks.homework2.client.ClientControllerImpl;

import java.util.List;

public interface ServerRepositoryImpl {
    void logMessage(String message);
    void addClient(ClientControllerImpl client);
    void removeClient(ClientControllerImpl client);
    void saveLogToFile(String message);
    List<ClientControllerImpl> getConnectedClients();
}
