package homeworks.homework5;

public class Main {
    public static void main(String[] args) {
//        String[] names = {"Аристотель", "Гераклит", "Платон", "Сократ", "Пифагор"};
        String[] names = {"Первый", "Второй", "Третий", "Четвёртый", "Пятый"};
        int eatingCount = 3;
        Table table = new Table(names, eatingCount);
        table.startEating();
    }
}
