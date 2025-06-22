import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
  public static void main(String[] args) {
    String input = "shivam";

    Map<Character, Long> countMap =
        input.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    countMap.forEach((ch, count) -> System.out.println(ch + " : " + count));
  }
}
