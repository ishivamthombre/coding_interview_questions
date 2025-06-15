package synechron;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Synechron {
  public static void main(String args[]) {
    List<Employee> employees =
        Arrays.asList(new Employee("John", "IT"), new Employee("Alice", "HR"), new Employee("Bob", "IT"), new Employee("Jane", "Marketing"),
            new Employee("Jack", "IT"));

    Map<String, Long> countMap = employees.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));
  }
}
