package homeworks.homework2;

import homeworks.homework2.client.ClientController;
import homeworks.homework2.client.ClientGUI;
import homeworks.homework2.server.ServerController;
import homeworks.homework2.server.ServerGUI;
import homeworks.homework2.server.ServerRepository;

public class Main {
    public static void main(String[] args) {
        ServerRepository serverRepository = new ServerRepository();
        ServerGUI serverGUI = new ServerGUI();
        ServerController serverController = new ServerController(serverGUI, serverRepository);

        ClientGUI clientGUI1 = new ClientGUI("Фаина Раневская");
        ClientController clientController1 = new ClientController(serverController, clientGUI1, "Фаина Раневская");

        ClientGUI clientGUI2 = new ClientGUI("Аркадий Райкин");
        ClientController clientController2 = new ClientController(serverController, clientGUI2, "Аркадий Райкин");

        ClientGUI clientGUI3 = new ClientGUI("Мстислав Келдыш");
        ClientController clientController3 = new ClientController(serverController, clientGUI3, "Мстислав Келдыш");

        ClientGUI clientGUI4 = new ClientGUI("Рина Зелёная");
        ClientController clientController4 = new ClientController(serverController, clientGUI4, "Рина Зелёная");

        System.out.println("Method main() is over");
    }
}
