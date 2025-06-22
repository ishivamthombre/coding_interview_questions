package altimetrik;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    String s = "i_am_shivam_thombre";
    getSecondHigh(s);
  }

  private static void getSecondHigh(String s) {
    Map<Character, Integer> countMap = new HashMap<>();
    for (char c : s.toCharArray()) {
      countMap.put(c, countMap.getOrDefault(c, 0) + 1); // s 0+1
    }

    Set<Integer> countSet = new TreeSet<>(Collections.reverseOrder());
    countSet.addAll(countMap.values()); // 5 3 2 1

    Iterator<Integer> it = countSet.iterator();
    if (it.hasNext()) //first highest
      it.next();
    int secondHighest = -1;
    if (it.hasNext()) {
      secondHighest = it.next();
    }

    List<Character> result = new ArrayList<>();
    for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
      if (entry.getValue() == secondHighest) {
        result.add(entry.getKey());
      }
    }

    System.out.println("Character : " + result + " occurance " + secondHighest);
  }
}
