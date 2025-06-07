public class BinarySearch {

  public static int binarySearch(int[] arr, int target) {
    int low = 0, high = arr.length - 1;

    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == target) {
        return mid; // target found
      } else if (arr[mid] < target) {
        low = mid + 1; // search right half
      } else {
        high = mid - 1; // search left half
      }
    }

    return -1; // target not found
  }

  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9, 11, 13};
    int target = 7;
    int index = binarySearch(arr, target);

    if (index != -1) {
      System.out.println("Element found at index: " + index);
    } else {
      System.out.println("Element not found.");
    }
  }
}
