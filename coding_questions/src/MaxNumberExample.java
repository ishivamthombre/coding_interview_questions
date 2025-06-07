import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxNumberExample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(10, 45, 67, 32, 89, 23);

    Optional<Integer> max = numbers.stream().max(Integer::compareTo);
    max.ifPresent(m -> System.out.println("Max number is: " + m));


    Optional<Integer> maxNumber = numbers.stream().reduce(Integer::max);
    maxNumber.ifPresent(m -> System.out.println("Max number is: " + m));

    //Method              Description
    //max()	              Uses a comparator to find the max value
    //reduce()	          Accumulates the max by comparing pairs
  }
}
