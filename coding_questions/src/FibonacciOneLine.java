import java.util.stream.Stream;

public class FibonacciOneLine {
  public static void main(String[] args) {
    int n = 10;
    String result = Stream.iterate(new int[] {0, 1}, f -> new int[] {f[1], f[0] + f[1]}).limit(n).map(f -> String.valueOf(f[0]))
        .reduce((a, b) -> a + " " + b).orElse("");
    System.out.println(result);

    //Step	                                          What it Does
    //Stream.iterate(new int[]{0, 1}, ...)	          Starts with a pair [0, 1]
    //f -> new int[]{f[1], f[0] + f[1]}	              Generates next pair: previous second and sum of the two
    //map(f -> f[0])	                                Extracts the current Fibonacci number
    //limit(n)	                                      Stops after n elements
    //forEach(...)	                                  Prints the series
  }
}
