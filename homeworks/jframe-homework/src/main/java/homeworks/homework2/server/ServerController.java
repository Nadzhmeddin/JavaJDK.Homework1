package homeworks.homework2.server;

import homeworks.homework2.client.ClientControllerImpl;

public class ServerController implements ServerControllerImpl {
    private final ServerViewImpl serverView;
    private final ServerRepositoryImpl serverRepository;
    private boolean isServerWorking;
    private boolean isServerStopped;

    public ServerController(ServerViewImpl serverView, ServerRepositoryImpl serverRepository) {
        this.serverView = serverView;
        this.serverRepository = serverRepository;
        this.serverView.setController(this);
        this.isServerWorking = false;
        this.isServerStopped = false;
    }

    @Override
    public void startServer() {
        if (isServerRunning()) {
            serverView.showMessage("Сервер уже запущен\n");
        } else {
            isServerWorking = true;
            isServerStopped = false;
            serverView.showMessage("Сервер запущен\n");
            serverView.enableStopButton(true);
            serverRepository.logMessage("Сервер запущен");
        }
    }

    @Override
    public void stopServer() {
        if (isServerStopped) {
            serverView.showMessage("Сервер уже остановлен\n");
        } else {
            isServerStopped = true;
            isServerWorking = false;
            for (ClientControllerImpl client : serverRepository.getConnectedClients()) {
                client.disconnect();
            }
            serverView.showMessage("Сервер остановлен. Все клиенты отключены\n");
            serverRepository.logMessage("Сервер остановлен. Все клиенты отключены");
        }
    }


    @Override
    public boolean isServerRunning() {
        return isServerWorking;
    }

    @Override
    public boolean isServerStopped() {
        return isServerStopped;
    }

    @Override
    public void logMessage(String message) {
        serverView.showMessage(message + "\n");
        serverRepository.saveLogToFile(message);
    }

    @Override
    public void addClient(ClientControllerImpl client) {
        serverRepository.addClient(client);
    }

    @Override
    public void removeClient(ClientControllerImpl client) {
        serverRepository.removeClient(client);
    }

    @Override
    public void broadcastMessage(String message, ClientControllerImpl sender) {
        serverView.showMessage(message + "\n");
        for (ClientControllerImpl client : serverRepository.getConnectedClients()) {
            if (client != sender) {
                client.receiveMessage(message);
            }
        }
        serverRepository.saveLogToFile(message);
    }
}
