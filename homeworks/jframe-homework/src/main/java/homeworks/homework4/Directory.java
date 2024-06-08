package homeworks.homework4;

import java.util.*;


public class Directory {
    private List<Employee> employees;
    private int personnelNumber;

    public Directory(List<Employee> employees) {
        this.employees = employees;
        this.personnelNumber = employees.size() + 1;
    }

    public Directory() {
        this.employees = new ArrayList<>();
        this.personnelNumber = 1;
    }

    public List<Employee> getEmployeesByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() >= experience) {
                result.add(employee);
            }
        }
        return result;
    }

    public List<String> getPhoneNumbersByFirstName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getFirstName().equalsIgnoreCase(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    public List<String> getPhoneNumbersBySecondName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSecondName().equalsIgnoreCase(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    public List<Integer> getPersonnelNumbersByFirstName(String name) {
        List<Integer> personnelNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getFirstName().equalsIgnoreCase(name)) {
                personnelNumbers.add(employee.getPersonnelNumber());
            }
        }
        return personnelNumbers;
    }

    public List<Integer> getPersonnelNumbersBySecondName(String name) {
        List<Integer> personnelNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSecondName().equalsIgnoreCase(name)) {
                personnelNumbers.add(employee.getPersonnelNumber());
            }
        }
        return personnelNumbers;
    }

    public Employee getEmployeeByPersonnelNumber(int personnelNumber) {
        for (Employee employee : employees) {
            if (employee.getPersonnelNumber() == personnelNumber) {
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(String firstName, String secondName, String phoneNumber, int experience) {
        Employee employee = new Employee(personnelNumber, phoneNumber, firstName, secondName, experience);
        employees.add(employee);
        personnelNumber++;
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }
}
