//package homeworks.homework1;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class ServerWindow extends JFrame implements ServerView {
//
//    private static final int WIDTH = 400;
//    private static final int HEIGHT = 400;
//
//    private  final JButton startButton = new JButton("Start server");
//    private  final JButton stopButton = new JButton("Stop server");
//    private  final JTextArea chatArea = new JTextArea();
//    private final JPanel serverPanel = new JPanel(new GridLayout(1,2));
//
//    ServerController serverController;
//
//
//    public ServerWindow(ServerController serverController) {
//        this.serverController = serverController;
//
//        setTitle("Server Window");
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setSize(WIDTH, HEIGHT);
//        setLocationRelativeTo(null);
//
//        add(chatArea);
//        add(createPanel(), BorderLayout.SOUTH);
//
//        setResizable(false);
//        setVisible(true);
//    }
//
//    private void answerAll(String text) {
//        for (ClientController controller : clientControllerList) {
//            serverController.answer(text);
//        }
//    }
//
//    private void appendLog(String text) {
//        chatArea.append(text + "\n");
//    }
//
//    public void message(String text) {
//        if(!isServerRunning) {
//            return;
//        }
//        text += "";
//        appendLog(text);
//        answerAll(text);
//        serverController.saveInLog(text);
//    }
//
//    private Component createPanel() {
//
//        startButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(isServerRunning) appendLog("Сервер уже запущен\n");
//                else {
//                    isServerRunning = true;
//                    appendLog("Сервер запущен\n");
//                }
//            }
//        });
//
//        stopButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(!isServerRunning) appendLog("Сервер уже остановлен\n");
//                else {
//                    isServerRunning = false;
//                    while(!clientWindowList.isEmpty()) {
//                        disconnectUser(clientWindowList.get(clientWindowList.size()-1));
//                    }
//                    appendLog("Сервер остановлен!\n");
//                }
//            }
//        });
//
//        serverPanel.add(startButton);
//        serverPanel.add(stopButton);
//        return serverPanel;
//    }
//
//    @Override
//    public void showMessage(String text) {
//
//    }
//
//    @Override
//    public boolean connectUser() {
//        return false;
//    }
//
//    @Override
//    public void disconnectUser() {
//
//    }
//}
