import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServerWindow extends JFrame {

    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    public static final String LOG_PATH = "src/main/java/log.txt";

    List<ClientWindow> clientWindowList;

    private  final JButton startButton = new JButton("Start server");
    private  final JButton stopButton = new JButton("Stop server");
    private  final JTextArea chatArea = new JTextArea();
    private final JPanel serverPanel = new JPanel(new GridLayout(1,2));

    private boolean isServerRunning;

    public ServerWindow() {
        clientWindowList = new ArrayList<>();

        setTitle("Server Window");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setLocationRelativeTo(null);

        add(chatArea);
        add(createPanel(), BorderLayout.SOUTH);

        setResizable(false);
        setVisible(true);
    }

    public boolean connectUser(ClientWindow clientWindow) {
        if(!isServerRunning) {
            return false;
        }
        clientWindowList.add(clientWindow);
        return true;
    }

    public void disconnectUser(ClientWindow clientWindow) {
        clientWindowList.remove(clientWindow);
        if(clientWindow != null) {
            clientWindow.disconnectFromServer();
        }
    }

    public String getLog() {
        return readLog();
    }

    public void message(String text) {
        if(!isServerRunning) {
            return;
        }
        text += "";
        appendLog(text);
        answerAll(text);
        saveInLog(text);
    }

    private void answerAll(String text) {
        for (ClientWindow clientWindow : clientWindowList) {
            clientWindow.answer(text);
        }
    }

    private void saveInLog(String text) {
        try(FileWriter fw = new FileWriter(LOG_PATH, true)) {
            fw.write(text);
            fw.write("\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String readLog() {
        StringBuilder sb = new StringBuilder();
        try(FileReader fr = new FileReader(LOG_PATH)) {
            int c;
            while((c = fr.read()) != -1) {
                sb.append((char) c);
            }
            sb.delete(sb.length() - 1, sb.length());
            return sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private void appendLog(String text) {
        chatArea.append(text + "\n");
    }

    private Component createPanel() {

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isServerRunning) appendLog("Сервер уже запущен\n");
                else {
                    isServerRunning = true;
                    appendLog("Сервер запущен\n");
                }
            }
        });

        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!isServerRunning) appendLog("Сервер уже остановлен\n");
                else {
                    isServerRunning = false;
                    while(!clientWindowList.isEmpty()) {
                        disconnectUser(clientWindowList.get(clientWindowList.size()-1));
                    }
                    appendLog("Сервер остановлен!\n");
                }
            }
        });

        serverPanel.add(startButton);
        serverPanel.add(stopButton);
        return serverPanel;
    }
}
