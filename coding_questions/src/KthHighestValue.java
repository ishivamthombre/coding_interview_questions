public class KthHighestValue {

  public static int findKthHighest(int[] arr, int k) {
    int n = arr.length;

    // Selection sort in descending order
    for (int i = 0; i < n - 1; i++) {
      int maxIdx = i;
      for (int j = i + 1; j < n; j++) {
        if (arr[j] > arr[maxIdx]) {
          maxIdx = j;
        }
      }
      // Swap
      int temp = arr[i];
      arr[i] = arr[maxIdx];
      arr[maxIdx] = temp;
    }

    return arr[k - 1]; // kth highest
  }

  public static void main(String[] args) {
    int[] arr = {5, 1, 9, 7, 3, 2};
    int k = 4;
    int result = findKthHighest(arr, k);
    System.out.println(k + "th highest value is: " + result);
  }
}
