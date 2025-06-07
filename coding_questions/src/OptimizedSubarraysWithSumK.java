import java.util.*;

public class OptimizedSubarraysWithSumK {
  public static void main(String[] args) {
    int[] arr = {1, 4, 3, 2, 5, 1, 1, 3, 5};
    int k = 5;

    List<List<Integer>> subarrays = findSubarraysWithSumK(arr, k);

    System.out.println("Total subarrays with sum " + k + ": " + subarrays.size());
    for (List<Integer> sub : subarrays) {
      System.out.println(sub);
    }
  }

  public static List<List<Integer>> findSubarraysWithSumK(int[] numbs, int k) {
    List<List<Integer>> result = new ArrayList<>();
    Map<Integer, List<Integer>> sumIndexMap = new HashMap<>();
    sumIndexMap.put(0, new ArrayList<>(Collections.singletonList(-1)));  // base case

    int prefixSum = 0;

    for (int i = 0; i < numbs.length; i++) {
      prefixSum += numbs[i];

      int neededSum = prefixSum - k;

      if (sumIndexMap.containsKey(neededSum)) {
        for (int startIdx : sumIndexMap.get(neededSum)) {
          List<Integer> subarray = new ArrayList<>();
          for (int j = startIdx + 1; j <= i; j++) {
            subarray.add(numbs[j]);
          }
          result.add(subarray);
        }
      }

      sumIndexMap.putIfAbsent(prefixSum, new ArrayList<>());
      sumIndexMap.get(prefixSum).add(i);
    }

    return result;
  }
}
