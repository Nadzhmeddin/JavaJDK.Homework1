//package homeworks.homework1;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.*;
//
//
//public class ClientWindow extends JFrame implements ClientView {
//
//    private static final int WIDTH = 450;
//    private static final int HEIGHT = 400;
//    private static final int POS_X = 100;
//    private static final int POS_Y = 220;
//
//    private final JButton buttonSend = new JButton("Send");
//    private final JTextArea messageTextArea = new JTextArea();
//
//    private final JButton buttonConnect = new JButton("login");
//    private final JTextField fieldLogin = new JTextField("login");
//    private final JPasswordField fieldPassword = new JPasswordField("111111");
//    private final JTextField fieldIp = new JTextField("127.0.0.1");
//    private final JTextField fieldPort = new JTextField("8080");
//    private final JPanel topPanel = new JPanel(new GridLayout(2,3));
//
//    private final JTextArea log = new JTextArea();
//
//    private ClientController clientController;
//
//    public ClientWindow(ClientController clientController) {
//        this.clientController = clientController;
//
//        setTitle("Client Window");
//        setSize(WIDTH,HEIGHT);
//        setLocation(POS_X,POS_Y);
//
//        add(createTopPanel(), BorderLayout.NORTH);
//        add(createLog());
//        add(createLowerPanel(), BorderLayout.SOUTH);
//
//        setResizable(true);
//        setVisible(true);
//
//    }
//
//    public void disconnectFromServer() {
//        clientController.disconnectFromServer();
//    }
//
//    private void message() {
//        clientController.message(messageTextArea.getText());
//        messageTextArea.setText("");
//    }
//
//    @Override
//    public void showMessage(String message) {
//        log.append(message + "\n");
//    }
//
//    public void login() {
//        if(clientController.connectToServer(fieldLogin.getText())) {
//            topPanel.setVisible(false);
//        }
//    }
//
//    private Component createTopPanel() {
//        buttonConnect.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                login();
//            }
//        });
//
//        topPanel.add(fieldIp);
//        topPanel.add(fieldPort);
//        topPanel.add(new JPanel());
//        topPanel.add(fieldLogin);
//        topPanel.add(fieldPassword);
//        topPanel.add(buttonConnect);
//
//        return topPanel;
//    }
//
//    private Component createLog() {
//        log.setEditable(false);
//        return new JScrollPane(log);
//    }
//
//    private Component createLowerPanel() {
//        JPanel panel = new JPanel(new BorderLayout());
//        messageTextArea.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                if (e.getKeyChar() == '\n') {
//                    message();
//                }
//            }
//        });
//        buttonSend.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                message();
//            }
//        });
//        panel.add(messageTextArea);
//        panel.add(buttonSend, BorderLayout.EAST);
//        return panel;
//    }
//
//    @Override
//    protected void processWindowEvent(WindowEvent e) {
//        if (e.getID() == WindowEvent.WINDOW_CLOSING){
//            disconnectFromServer();
//        }
//        super.processWindowEvent(e);
//    }
//}
