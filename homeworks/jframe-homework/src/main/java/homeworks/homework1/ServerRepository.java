package homeworks.homework1;

public interface ServerRepository {

    void saveInLog(String text);
    String readLog();
}
