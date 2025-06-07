import java.util.*;
import java.util.stream.Collectors;


public class UniqueElementsExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

    List<Integer> uniqueElements = numbers.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
        .filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

    uniqueElements.forEach(System.out::println);

    //Step                                          What it Does
    //groupingBy(e -> e, counting())	              Count how many times each element occurs
    //filter(entry -> entry.getValue() == 1)	      Keep only those that occurred once
    //map(Map.Entry::getKey)	                      Extract the actual number
    //collect(Collectors.toList())	                Gather them as a list

  }
}