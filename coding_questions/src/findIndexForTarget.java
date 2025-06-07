public class findIndexForTarget {
  public static void main(String[] args) {
    int[] numbs = {1, 2, 3, 4, 5, 6, 7};
    int target = 8;
    for (int i = 0; i < numbs.length; i++) {
      for (int j = i + 1; j < numbs.length; j++) {
        if (numbs[i] + numbs[j] == target) {
          System.out.println(i + " " + j);
        }
      }
    }
  }
}
