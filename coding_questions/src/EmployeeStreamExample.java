import java.util.*;
import java.util.stream.*;

class Employee {
  private final String name;
  private final String department;

  // Constructor
  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public double getSalary() {
    return salary;
  }

  @Override public String toString() {
    return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + '}';
  }
}


public class EmployeeStreamExample {

  public static void main(String[] args) {
    List<Employee> employees =
        Arrays.asList(
            new Employee(101, "Ravi", 50000),
            new Employee(102, "Anjali", 75000),
            new Employee(103, "Zoya", 65000),
            new Employee(104, "Monit", 45000));

    // ✅ 1. Find the employee with the minimum salary
    Employee minSalaryEmp = employees.stream().min(Comparator.comparing(Employee::getSalary)).orElse(null);

    System.out.println("Employee with minimum salary:");
    System.out.println(minSalaryEmp);

    // ✅ 2. Print all employees in descending order by name
    System.out.println("\nEmployees sorted by name (descending):");
    employees.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
  }
}
