package homeworks.homework3;

public class Calculator {

    // сложение
    public <T extends Number, U extends Number> double sum(T a, U b) {
        return a.doubleValue() + b.doubleValue();
    }

    // умножение
    public <T extends Number, U extends Number> double multiply(T a, U b) {
        return a.doubleValue() * b.doubleValue();
    }

    // деление
    public <T extends Number, U extends Number> double divide(T a, U b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a.doubleValue() / b.doubleValue();
    }

    // вычитание
    public <T extends Number, U extends Number> double subtract(T a, U b) {
        return a.doubleValue() - b.doubleValue();
    }
}
