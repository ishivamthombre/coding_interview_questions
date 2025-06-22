import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
  public static void main(String[] args) {
    String input = "swiss";

    Optional<Character> result =
        input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() == 1).map(Map.Entry::getKey).findFirst();

    result.ifPresent(character -> System.out.println("First Non-repeating Character : " + character));

    //Step	                            Description
    //input.chars()	                    Converts the string to an IntStream of character codes
    //mapToObj(c -> (char) c)	          Casts each int to Character object
    //groupingBy(...)	                  Groups characters and counts occurrences in a LinkedHashMap (preserves order)
    //filter(entry -> value == 1)	      Keeps only characters that appear once
    //findFirst()	                      Finds the first character with a single occurrence
  }
}