package homeworks.homework3;

public class Main {
    public static void main(String[] args) {
        System.out.println("part 01");

        Calculator calculator = new Calculator();

        System.out.println("Сумма: " + calculator.sum(5, 2.5));
        System.out.println("Умножение: " + calculator.multiply(5, 2.5));
        System.out.println("Деление: " + calculator.divide(5, 2.5));
        System.out.println("Вычитание: " + calculator.subtract(5, 2.5));
        System.out.println("_____________________________________");

        System.out.println("part 02");

        ArrayComparator arrayComparator = new ArrayComparator();

        Integer[] array01 = {1, 2, 3};
        Integer[] array02 = {1, 2, 3};
        Integer[] array03 = {4, 5, 6};
        Double[] array04 = {4.0, 5.0, 6.0};
        Object[] array05 = {4.0, 5.0, 6.0};

        String[] array11 = {"a", "b", "c"};
        String[] array12 = {"a", "b", "c"};
        String[] array13 = {"d", "e", "f"};
        Object[] array14 = {"d", "e", "f"};

        System.out.println(arrayComparator.compareArrays(array01, array02)); // одинаковые значения Integer
        System.out.println(arrayComparator.compareArrays(array01, array03)); // разные значения Integer
        System.out.println(arrayComparator.compareArrays(array03, array04)); // разные типы Integer/Double
        System.out.println(arrayComparator.compareArrays(array04, array05)); // разные типы Double/родитель Object
        System.out.println(arrayComparator.compareArrays(array11, array12)); // одинаковые значения String
        System.out.println(arrayComparator.compareArrays(array11, array13)); // разные значения String
        System.out.println(arrayComparator.compareArrays(array01, array13)); // разные типы Integer/String
        System.out.println(arrayComparator.compareArrays(array13, array14)); // разные типы String/родитель Object
        System.out.println("_____________________________________");

        System.out.println("part 03");
        Pair<Integer, String> firstPair = new Pair<>(1, "One");
        System.out.println("Первое значение: " + firstPair.getFirst());
        System.out.println("Второе значение: " + firstPair.getSecond());
        System.out.println("Первая пара: " + firstPair);
        System.out.println();

        Pair<Double, Boolean> secondPair = new Pair<>(2.5, true);
        System.out.println("Первое значение: " + secondPair.getFirst());
        System.out.println("Второе значение: " + secondPair.getSecond());
        System.out.println("Вторая пара: " + secondPair);
        System.out.println("_____________________________________");
    }
}
