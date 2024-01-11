package solutions.interviews;

import java.util.*;

public class SortThem {
    // group emp based on their department whose age is > 25
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 26, "MARKETING"),
                new Employee("Harry Major", 26, "LEGAL"),
                new Employee("Ethan Hardy", 65, "LEGAL"),
                new Employee("Nancy Smith", 22, "MARKETING"),
                new Employee("Catherine Jones", 21, "HR"),
                new Employee("James Elliot", 58, "OPERATIONS"),
                new Employee("Frank Anthony", 55, "MARKETING"),
                new Employee("Michael Reeves", 40, "OPERATIONS"));

        employeeList.sort(Comparator.comparing(Employee::age));

        for (Employee employee:employeeList) {
            System.out.println(employee);
        }
    }
}
