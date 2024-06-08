package homeworks.homework2.server;

public interface ServerViewImpl {
    void showMessage(String message);
    void setController(ServerControllerImpl controller);
    void enableStopButton(boolean enable);
}
