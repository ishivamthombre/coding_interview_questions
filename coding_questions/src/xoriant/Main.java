package xoriant;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    String s = "shivam";

    Map<Character, Long> countMap =
        s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

    countMap.forEach((ch, count) -> System.out.println("character : " + ch + " count : " + count));


    //http://localhost:8080/v1/employee/search/listemployees?fieldName=city&fieldValue=pune
    /*@GetMapping("")
    public List<Employee> getListEmployess(@RequestParam String city, @RequestParam String dept*/


    //SELECT * FROM student where subject = 'Math' ORDER BY DESC LIMIT 1 OFFSET 2;

  }
}
