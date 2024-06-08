package homeworks.homework4;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();

        directory.addEmployee("Евгений", "Онегин", "8-910-759-85-10", 8);
        directory.addEmployee("Татьяна",  "Ларина", "8-911-939-12-08", 6);
        directory.addEmployee("Владимир", "Дубровский", "8-912-309-53-24",1);
        directory.addEmployee("Германн", "Мирович", "8-913-032-09-76", 2);
        directory.addEmployee("Григорий", "Печорин", "8-914-138-90-33", 7);
        directory.addEmployee("Мери", "Лиговская", "8-915-567-45-98", 5);
        directory.addEmployee("Евгений", "Арбенин", "8-916-356-92-39", 3);
        directory.addEmployee("Александр", "Лидин", "8-917-229-91-92", 4);
        directory.addEmployee("Антонио", "Сальери", "8-918-737-67-07", 5);
        directory.addEmployee("Иван", "Грушницкий", "8-919-832-20-65", 1);

        System.out.println("Список сотрудников: \n" + directory.getAllEmployees());
        System.out.println("Сотрудники со стажем от 5 лет: \n" + directory.getEmployeesByExperience(5));
        System.out.println("Номер телефона Евгения: " + directory.getPhoneNumbersByFirstName("Евгений"));
        System.out.println("Номер телефона Арбенина: " + directory.getPhoneNumbersBySecondName("Арбенин"));
        System.out.println("Табельный номер Евгения: " + directory.getPersonnelNumbersByFirstName("Евгений"));
        System.out.println("Табельный номер Онегина: " + directory.getPersonnelNumbersBySecondName("Онегин"));
        System.out.println("С табельным номером 5: " + directory.getEmployeeByPersonnelNumber(5));

        directory.addEmployee("Остап", "Бендер", "8-920-038-14-73", 7);
        directory.addEmployee("Пьер", "Безухов", "8-921-164-99-16", 9);
        System.out.println("Список сотрудников: \n" + directory.getAllEmployees());
    }
}
