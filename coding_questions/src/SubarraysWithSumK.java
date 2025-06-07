import java.util.ArrayList;
import java.util.List;

public class SubarraysWithSumK {
  public static void main(String[] args) {
    int[] arr = {1, 4, 3, 2, 5, 1, 1, 3, 5, 1, 2, 3, 4, 5, 6, 7, 3, 23, 1, 2, 4, 23, 2, 3, 5};
    int k = 5;

    List<List<Integer>> subArraysWithSum = findSubarraysWithSumK(arr, k);

    System.out.println("Total sub-arrays with sum " + k + " : " + subArraysWithSum.size());
    for (List<Integer> subArray : subArraysWithSum) {
      System.out.println(subArray);
    }
  }

  public static List<List<Integer>> findSubarraysWithSumK(int[] arr, int k) {
    List<List<Integer>> subarrays = new ArrayList<>();

    for (int start = 0; start < arr.length; start++) {
      int sum = 0;
      List<Integer> currentSubArray = new ArrayList<>();

      for (int end = start; end < arr.length; end++) {
        sum += arr[end];
        currentSubArray.add(arr[end]);

        if (sum == k)
          subarrays.add(new ArrayList<>(currentSubArray));

        if (sum > k)
          break;
      }
    }

    return subarrays;
  }
}
