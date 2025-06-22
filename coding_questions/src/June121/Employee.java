package June121;

public class Employee {
  private int id;
  private String name;
  private double salary;

  public Employee(int id, String name, double salary) {
    this.id = id;
    this.name = name;
    this.salary = salary;
  }

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
    final StringBuilder sb = new StringBuilder("Employee{");
    sb.append("salary=").append(salary);
    sb.append(", name='").append(name).append('\'');
    sb.append(", id=").append(id);
    sb.append('}');
    return sb.toString();
  }
}
