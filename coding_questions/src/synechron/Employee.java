package synechron;

import java.util.StringJoiner;

public class Employee {
  private final String name;
  private final String department;

  public Employee(String department, String name) {
    this.department = department;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getDepartment() {
    return department;
  }

  @Override public String toString() {
    return new StringJoiner(", ", Employee.class.getSimpleName() + "[", "]").add("name='" + name + "'")
        .add("department='" + department + "'").toString();
  }
}


