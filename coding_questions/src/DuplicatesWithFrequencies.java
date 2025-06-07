import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicatesWithFrequencies {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 6, 5, 6, 7, 8);

    Map<Integer, Long> countMap = numbers.stream().collect(Collectors.groupingBy(num -> num, Collectors.counting()));
    System.out.println("All Frequencies");
    countMap.forEach((key, value) -> System.out.println("elements : " + key + " occurrence : " + value));

    System.out.println("Duplicate Elements");
    countMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
        .forEach(entry -> System.out.println(entry.getKey() + " appears " + entry.getValue() + " times"));


    //Operation	              Java 8 Feature Used
    //Counting items	        Collectors.groupingBy + counting()
    //Filtering duplicates	  Stream.filter()
    //Printing nicely 	      forEach()
  }
}
