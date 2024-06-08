package homeworks.homework2.server;

import homeworks.homework2.client.ClientControllerImpl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ServerRepository implements ServerRepositoryImpl {
    private final List<ClientControllerImpl> connectedClients = new ArrayList<>();

    @Override
    public void logMessage(String message) {
        saveLogToFile(message);
    }

    @Override
    public void addClient(ClientControllerImpl client) {
        connectedClients.add(client);
    }

    @Override
    public void removeClient(ClientControllerImpl client) {
        connectedClients.remove(client);
    }

    @Override
    public void saveLogToFile(String message) {
        String filePath = "src/main/java/homeworks/homework_02/log.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, true))) {
            writer.println(message);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл лога: " + e.getMessage());
        }
    }

    @Override
    public List<ClientControllerImpl> getConnectedClients() {
        return new ArrayList<>(connectedClients);
    }
}
