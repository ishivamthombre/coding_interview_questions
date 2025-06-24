package mphasis.round.one;

public class Main {
  public static void main(String[] args) {
    Integer num = 987654321;
    System.out.println(sumInOneDigit(num));
  }

  private static Integer sumInOneDigit(Integer num) {
    while (num >= 10) {
      int sum = 0;
      while (num != 0) {
        sum += num % 10; // 987654 % 10 = 4
        num /= 10; // 98765
      }
      num = sum; //39
    }
    return num;
  }
}
