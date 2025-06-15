public class FibonacciRecursive {

  // Recursive method to get nth Fibonacci number
  public static int fibonacci(int n) {
    if (n == 0)
      return 0;       // base case 0th number
    if (n == 1)
      return 1;       // base case 1st number
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  public static void main(String[] args) {
    int count = 15;
    System.out.println("First " + count + " Fibonacci numbers:");

    for (int i = 0; i < count; i++) {
      System.out.print(fibonacci(i) + " ");
    }
  }
}


@Retry(name = "service", method = "fallbackmethod")
someservice(){

  RateLimiter count ++;

  fallbackMethod
}


@CircuitBreker(name = "service", method = "fallbackmethod")
someservice(){



  fallbackMethod(){
    "due to some its failing"
  }
}