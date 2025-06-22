package June121;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();

    // Adding Employee objects to the ArrayList

    employees.add(new Employee(1, "Alice", 30000));

    employees.add(new Employee(2, "Bob", 250000));

    employees.add(new Employee(3, "Alice", 350000));

    List<Employee> uniqueEmployee =
        employees.stream().collect(Collectors.toMap(Employee::getName, e -> e, (e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2))
            .values().stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());

    uniqueEmployee.forEach(System.out::println);
  }
}
