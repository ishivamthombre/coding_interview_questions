package mphasis.round.two;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();

    map.put(1, "Shivam");
    map.put(2, "Naveen");
    map.put(3, "Isha");
    map.put(4, "Shivam");

    Map<String, Long> countMap = map.values().stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    countMap.forEach((name, count) -> System.out.println("name : " + name + " count : " + count));


    int[] arr = {3, 2, 7, 6, 10};
    int upperLimit = 10;

    Set<Integer> existNum = new HashSet<>();
    for (int num : arr) {
      existNum.add(num);
    }

    List<Integer> missNum = new ArrayList<>();
    for (int i = 1; i <= upperLimit; i++) {
      if (!existNum.contains(i)) {
        missNum.add(i);
      }
    }
    System.out.println(missNum);
  }
}
