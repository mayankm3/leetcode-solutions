package solutions.interviews;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupThem {

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

        // https://stackoverflow.com/questions/61108086/group-by-list-of-object-on-multiple-fields-java-8
        Map<String, Set<Employee>> groupedEmployees = employeeList.stream().filter(employee -> employee.age() > 25)
                .collect(Collectors.groupingBy(Employee::department, Collectors.toSet()));
    }
}
