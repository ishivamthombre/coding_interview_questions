package hashSet_problem;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Person> people = new HashSet<>();
    people.add(new Person("Alice"));
    people.add(new Person("Alice"));
    people.add(new Person("Bob"));
    people.add(new Person("Bob"));
    System.out.println(people.size());
  }
}
