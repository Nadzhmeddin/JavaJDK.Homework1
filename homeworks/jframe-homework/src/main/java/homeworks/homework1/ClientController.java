//package homeworks.homework1;
//
//public class ClientController {
//
//    private ClientView clientView;
//    private ServerController serverController;
//    private boolean connected;
//    String name;
//
//
//    public ClientController(ClientView clientView, ServerController serverController) {
//        this.clientView = clientView;
//        this.serverController = serverController;
//    }
//
//    public boolean connectToServer(String name) {
//        this.name = name;
//        if(serverController.connect(this)) {
//            showOnWindow("Вы успешно подключились!\n");
//            connected = true;
//            String log = server.getHistory();
//            if(log != null) {
//                showOnWindow(log);
//            }
//            return true;
//        } else {
//            showOnWindow("Подключение не удалось!");
//            return false;
//        }
//    }
//
//    public void disconnectFromServer() {
//        if(connected) {
//            connected = false;
//            serverController.disconnectUser(this);
//            appendLog("Вы были отключены от сервера!");
//        }
//    }
//
//    public void answer(String text) {
//        showOnWindow(text);
//    }
//
//    public void message(String text) {
//        if(connected) {
//            if(!text.isEmpty()) {
//                serverController.message(name + ":" + text);
//            }
//        } else {
//            showOnWindow("Нет подключения к серверу");
//        }
//    }
//
//    private void showOnWindow(String text) {
//        clientView.showMessage(text);
//    }
//}
