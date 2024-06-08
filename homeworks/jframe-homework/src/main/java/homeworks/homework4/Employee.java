package homeworks.homework4;

public class Employee {
    private final int personnelNumber;
    private final String phoneNumber;
    private final String firstName;
    private final String secondName;
    private final int experience;

    public Employee(int personnelNumber, String phoneNumber, String firstName, String secondName, int experience) {
        this.personnelNumber = personnelNumber;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.experience = experience;
    }

    public int getPersonnelNumber() {
        return personnelNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Сотрудник{" +
                "имя: " + firstName +
                ", фамилия: " + secondName +
                ", табельный номер: " + personnelNumber +
                ", номер телефона: " + phoneNumber +
                ", стаж работы: " + experience +
                '}' + "\n";
    }
}