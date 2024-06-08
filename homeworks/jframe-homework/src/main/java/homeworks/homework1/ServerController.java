//package homeworks.homework1;
//
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class ServerController implements ServerRepository {
//
//    private ServerView serverView;
//    private ServerRepository serverRepository;
//    private ClientController clientController;
//    private boolean isServerRunning;
//
//    public static final String LOG_PATH = "src/main/java/log.txt";
//
//
//    public ServerController(ServerView serverView, ServerRepository serverRepository, ClientController clientController) {
//        this.serverView = serverView;
//        this.serverRepository = serverRepository;
//        this.clientController = clientController;
//    }
//
//    @Override
//    public void saveInLog(String text) {
//        try(FileWriter fw = new FileWriter(LOG_PATH, true)) {
//            fw.write(text);
//            fw.write("\n");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public String readLog() {
//        StringBuilder sb = new StringBuilder();
//        try(FileReader fr = new FileReader(LOG_PATH)) {
//            int c;
//            while((c = fr.read()) != -1) {
//                sb.append((char) c);
//            }
//            sb.delete(sb.length() - 1, sb.length());
//            return sb.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//}
